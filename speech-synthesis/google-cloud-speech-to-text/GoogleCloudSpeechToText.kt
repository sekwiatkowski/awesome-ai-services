
// "ssml" is the input provided in the Speech Synthesis Markup Language (SSML).
// Alternatively, you can use the "setText" method to provide raw text.
// To use the WaveNet architecture, specificy a "voice" betwen "en-US-Wavenet-A" and "en-US-Wavenet-F".
// For US English, set "languageCode" to "en-US".

val client = TextToSpeechClient.create()

val input = SynthesisInput
    .newBuilder()
    .setSsml(ssml)
    .build()

val voice = VoiceSelectionParams
    .newBuilder()
    .setLanguageCode("en-US")
    .setName("en-US-Wavenet-C")
    .build()

val audioConfig = AudioConfig
    .newBuilder()
    .setAudioEncoding(AudioEncoding.MP3)
    .build()

val response = client.synthesizeSpeech(input, voice, audioConfig)

val audioContent = response.audioContent

val bytes = audioContent.toByteArray()

FileOutputStream(outputFile).use { stream -> stream.write(bytes) }
