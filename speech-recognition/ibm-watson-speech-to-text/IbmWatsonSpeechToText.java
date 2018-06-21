SpeechToText client = new SpeechToText(username, password);

RecognizeOptions options = new RecognizeOptions.Builder()
    .audio(inputFile)
    .contentType(HttpMediaType.AUDIO_MP3)
    .build();

SpeechRecognitionResults transcript = client.recognize(options).execute();
