// "jobName" is a self-descriptive string.
// For speech in US English, set "languageCode" to "en-US".
// "s3Uri" is a string pointing to an audio file stored in an S3 bucket.

const AWS = require('AWS-sdk')

const transcribeService = new AWS.TranscribeService({
    region: 'us-east-1'
})

const params = {
    LanguageCode: languageCode,
    Media: {
        MediaFileUri: s3Uri
    },
    MediaFormat: mediaFormat,
    TranscriptionJobName: jobName
}

const repeatUntilCompleted = cb => {
    transcribeService.getTranscriptionJob({ TranscriptionJobName: jobName }, (getErr, getRes) => {
        const job = getRes.TranscriptionJob
        const status = job.TranscriptionJobStatus

        if (status === 'COMPLETED') {
            cb(job.Transcript.TranscriptFileUri)
        }
        else if (status === 'IN_PROGRESS') {
            setTimeout(
                function () {
                    repeatUntilCompleted(cb)
                },
                1000)
        }
    })
}

transcribeService.startTranscriptionJob(params, (startErr, startRes) => {
    repeatUntilCompleted(transcriptFileUri => {
        console.log(transcriptFileUri)
    })
})
