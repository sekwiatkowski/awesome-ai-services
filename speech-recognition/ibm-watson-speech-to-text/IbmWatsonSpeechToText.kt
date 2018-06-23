// "audio" can be a File or an InputStream object.

val client = SpeechToText(username, password)

val options = RecognizeOptions.Builder()
    .audio(inputFile)
    .contentType(HttpMediaType.AUDIO_MP3)
    .build()

val transcript = client.recognize(options).execute()
