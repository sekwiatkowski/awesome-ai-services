// "ssml" is the input provided in the Speech Synthesis Markup Language.
// Alternatively, you can provide raw text and set the text type to "TextType.Text".

AmazonPolly client = AmazonPollyClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build();

SynthesizeSpeechRequest request = new SynthesizeSpeechRequest()
    .withText(ssml)
    .withTextType(TextType.Ssml)
    .withVoiceId(VoiceId.Matthew)
    .withOutputFormat(OutputFormat.Mp3);

SynthesizeSpeechResult result = client.synthesizeSpeech(request);

InputStream audioStream = result.getAudioStream();

FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

IOUtils.copy(audioStream, fileOutputStream);

audioStream.close();
fileOutputStream.close();
