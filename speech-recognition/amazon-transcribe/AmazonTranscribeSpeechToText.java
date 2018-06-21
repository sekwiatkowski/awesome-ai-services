// "jobName" is a self-descriptive string.
// For speech in US English, "languageCode" is set to "en-US".
// "s3Uri" is a string pointing to an audio file stored in an S3 bucket.

AmazonTranscribe client = AmazonTranscribeClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build();

StartTranscriptionJobRequest startRequest = new StartTranscriptionJobRequest();

startRequest.setTranscriptionJobName(jobName);
startRequest.setLanguageCode(languageCode);

Media media = new Media();
media.setMediaFileUri(s3Uri);
startRequest.setMedia(media);
startRequest.setMediaFormat(MediaFormat.Mp3.toString());

client.startTranscriptionJob(startRequest);

GetTranscriptionJobRequest getRequest = new GetTranscriptionJobRequest();
getRequest.setTranscriptionJobName(jobName);

while (true) {
    GetTranscriptionJobResult getResponse = client.getTranscriptionJob(getRequest);

    TranscriptionJob job = getResponse.getTranscriptionJob();

    if (job.getTranscriptionJobStatus().equals(TranscriptionJobStatus.COMPLETED.toString())) {

        Transcript transcript = job.getTranscript();

        String transcriptUri = transcript.getTranscriptFileUri();
        System.out.println(transcriptUri);

        break;
    }
    else {
        Thread.sleep(1000L);
    }
}
