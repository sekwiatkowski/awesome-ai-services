// ssml is the input provided in the Speech Synthesis markup Language.

String tokenHost = "https://westus.api.cognitive.microsoft.com";
String tokenPath = "/sts/v1.0/issueToken";
String tokenUrl = tokenHost.concat(tokenPath);

String token = Unirest.post(tokenUrl)
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .asString()
    .getBody();

String ttsHost = "https://westus.tts.speech.microsoft.com";
String ttsPath = "/cognitiveservices/v1";
String ttsUrl = ttsHost.concat(ttsPath);

InputStream audioStream = Unirest.post(ttsUrl)
    .header("X-Microsoft-OutputFormat", "audio-16khz-128kbitrate-mono-mp3")
    .header("Content-Type", "application/ssml+xml")
    .header("Authorization", token)
    .body(ssml)
    .asBinary()
    .getBody();

FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

IOUtils.copy(audioStream, fileOutputStream);

audioStream.close();
fileOutputStream.close();
