// "input" is a string that holds the path to the input file (a local FLAC file, in this example).
// For US English, set "languageCode" to "en-US".

try (SpeechClient client = SpeechClient.create()) {
    Path inputPath = Paths.get(input);
    byte[] bytes = Files.readAllBytes(inputPath);
    ByteString content = ByteString.copyFrom(bytes);

    RecognitionConfig config = RecognitionConfig.newBuilder()
        .setEncoding(RecognitionConfig.AudioEncoding.FLAC)
        .setLanguageCode(languageCode)
        .build();
    RecognitionAudio audio = RecognitionAudio.newBuilder()
        .setContent(content)
        .build();

    RecognizeResponse response = client.recognize(config, audio);

    List<SpeechRecognitionResult> results = response.getResultsList();
}
