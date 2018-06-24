// "input" is a string holding the path to a WAV file.
// For US English, set "languageCode" to "en-US".

public class SpeechRecognitionResponse {
    public String RecognitionStatus, DisplayText;
    public int Offset, Duration;
}

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
String sstPath = String.format("/speech/recognition/conversation/cognitiveservices/v1?language=%s", languageCode);
String sstUrl = sttHost.concat(sstPath);

String responseString = Unirest.post(sstUrl)
    .header("Content-Type", "application/json")
    .header("Authorization", token)
    .body(data)
    .asString()
    .getBody();

SpeechRecognitionResponse response = new Gson().fromJson(responseString, SpeechRecognitionResponse.class);
