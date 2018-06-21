// "input" is a string that holds the path to the input file (a local FLAC file, in this example).
// For US English, "languageCode" is set to "en-US".

try (SpeechClient client = SpeechClient.create()) {
    Path path = Paths.get(input);
    byte[] data = Files.readAllBytes(path);
    ByteString audioBytes = ByteString.copyFrom(data);

    RecognitionConfig config = RecognitionConfig.newBuilder()
        .setEncoding(RecognitionConfig.AudioEncoding.FLAC)
        .setLanguageCode(languageCode)
        .build();
    RecognitionAudio audio = RecognitionAudio.newBuilder()
        .setContent(audioBytes)
        .build();

    RecognizeResponse response = client.recognize(config, audio);

    List<SpeechRecognitionResult> resultsList = response.getResultsList();
}
