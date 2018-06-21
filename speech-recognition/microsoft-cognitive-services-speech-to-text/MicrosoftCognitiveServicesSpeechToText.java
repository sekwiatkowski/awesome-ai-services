// "input" is a string holding the path to a WAV file.

Path inputPath = Paths.get(input);
byte[] data = Files.readAllBytes(inputPath);

String tokenHost = "https://westus.api.cognitive.microsoft.com";
String tokenPath = "/sts/v1.0/issueToken";
String tokenUrl = tokenHost.concat(tokenPath);

String token = Unirest.post(tokenUrl)
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .asString()
    .getBody();

String sttHost = "https://westus.stt.speech.microsoft.com";
String sstPath = "/speech/recognition/conversation/cognitiveservices/v1?language=en-US";
String sstUrl = sttHost.concat(sstPath);

String response = Unirest.post(sstUrl)
    .header("Content-Type", "application/json")
    .header("Authorization", token)
    .body(data)
    .asString()
    .getBody();
