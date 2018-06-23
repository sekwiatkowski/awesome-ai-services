// "audio" can be a File or an InputStream object

SpeechToText client = new SpeechToText(username, password);

RecognizeOptions options = new RecognizeOptions.Builder()
    .audio(audio)
    .contentType(HttpMediaType.AUDIO_MP3)
    .build();

SpeechRecognitionResults transcript = client.recognize(options).execute();
