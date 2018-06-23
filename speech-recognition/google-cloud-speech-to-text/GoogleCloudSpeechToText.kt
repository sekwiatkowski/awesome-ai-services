// "input" is a string that holds the path to the input file (a local FLAC file, in this example).
// For US English, set "languageCode" to "en-US".

val client = SpeechClient.create()

val bytes = input.readBytes()
val content = ByteString.copyFrom(bytes)

val config = RecognitionConfig.newBuilder()
    .setEncoding(RecognitionConfig.AudioEncoding.FLAC)
    .setLanguageCode(languageCode)
    .build()
val audio = RecognitionAudio.newBuilder()
    .setContent(content)
    .build()

val response = client.recognize(config, audio)

val results = response.resultsList
