// "input" is a String containing raw text or Speech Synthesis Markup Language (SSML) content.

val client = TextToSpeech(username, password)

val synthesizeOptions = SynthesizeOptions.Builder()
    .text(text)
    .voice(SynthesizeOptions.Voice.EN_US_ALLISONVOICE)
    .accept(SynthesizeOptions.Accept.AUDIO_MP3)
    .build()

val audioStream = client
    .synthesize(synthesizeOptions)
    .execute()

val fileOutputStream = FileOutputStream(outputFile)

IOUtils.copy(audioStream, fileOutputStream)

audioStream.close()
fileOutputStream.close()
