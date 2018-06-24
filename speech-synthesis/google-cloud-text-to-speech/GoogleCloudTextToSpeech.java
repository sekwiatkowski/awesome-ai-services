// "ssml" is the input provided in the Speech Synthesis Markup Language (SSML).
// Alternatively, you can use the "setText" method to provide raw text.
// To use the WaveNet architecture, specificy a "voice" between "en-US-Wavenet-A" and "en-US-Wavenet-F".
// For US English, set "languageCode" to "en-US".

try (TextToSpeechClient client = TextToSpeechClient.create()) {
    SynthesisInput input = SynthesisInput
        .newBuilder()
        .setSsml(ssml)
        .build();

    VoiceSelectionParams voice = VoiceSelectionParams
        .newBuilder()
        .setLanguageCode(languageCode)
        .setName(voice)
        .build();

    AudioConfig audioConfig = AudioConfig
        .newBuilder()
        .setAudioEncoding(AudioEncoding.MP3)
        .build();

    SynthesizeSpeechResponse response = client.synthesizeSpeech(input, voice, audioConfig);

    byte[] audioContent = response.getAudioContent().toByteArray();

    try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
        fileOutputStream.write(audioContent);
    }
}
