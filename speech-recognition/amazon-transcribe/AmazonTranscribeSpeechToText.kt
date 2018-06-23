// "jobName" is a self-descriptive string.
// For speech in US English, set "languageCode" to "en-US".
// "s3Uri" is a string pointing to an audio file stored in an S3 bucket.

val client = AmazonTranscribeClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build()

val media = Media().withMediaFileUri(s3Uri)

val startRequest = StartTranscriptionJobRequest()
    .withTranscriptionJobName(jobName)
    .withLanguageCode(languageCode)
    .withMedia(media)
    .withMediaFormat(MediaFormat.Mp3.toString())

client.startTranscriptionJob(startRequest)

val getRequest = GetTranscriptionJobRequest().withTranscriptionJobName(jobName)

fun waitForTranscript(): Transcript {
    while (true) {
        val getResponse = client.getTranscriptionJob(getRequest)

        val job = getResponse.transcriptionJob

        if (job.transcriptionJobStatus == TranscriptionJobStatus.COMPLETED.toString()) {
            return job.transcript
        } else {
            Thread.sleep(1000L)
        }
    }
}

val transcript = waitForTranscript()

val transcriptUri = transcript.transcriptFileUri
