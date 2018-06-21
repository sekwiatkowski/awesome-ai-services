// "input" is a Stirng containing raw text or Speech Synthesis Markup Language (SSML) content.

TextToSpeech client = new TextToSpeech(username, password);

SynthesizeOptions synthesizeOptions = new SynthesizeOptions.Builder()
    .text(input)
    .voice(SynthesizeOptions.Voice.EN_US_ALLISONVOICE)
    .accept(SynthesizeOptions.Accept.AUDIO_MP3)
    .build();

InputStream audioStream = client
    .synthesize(synthesizeOptions)
    .execute();

FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

IOUtils.copy(audioStream, fileOutputStream);

audioStream.close();
fileOutputStream.close();
