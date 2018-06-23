// "ssml" is the input provided in the Speech Synthesis Markup Language.
// Alternatively, you can provide raw text and set the text type to "TextType.Text".

val client = AmazonPollyClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build()

val request = SynthesizeSpeechRequest()
    .withText(ssml)
    .withTextType(TextType.Ssml)
    .withVoiceId(VoiceId.Matthew)
    .withOutputFormat(OutputFormat.Mp3)

val result = client.synthesizeSpeech(request)
val audioStream = result.audioStream

val fileOutputStream = FileOutputStream(outputFile)

IOUtils.copy(audioStream, fileOutputStream)

audioStream.close()
fileOutputStream.close()
