// "input" is a string holding the path to the image file.
// "mode" is a required parameter that is set to "Printed" or "Handwritten".

public class Word {
    public String text;
}

public class Line {
    public int[] boundingBox;
    public String text;
    public Word[] words;
}

public class TextRecognitionResult {
    public List<Line> lines;
}

public class TextRecognitionOperationResponse {
    public String status;
    public TextRecognitionResult recognitionResult;
}

Path path = Paths.get(input);
byte[] bytes = Files.readAllBytes(path);

String host = "https://westcentralus.api.cognitive.microsoft.com";
String endpoint = "/vision/v2.0/recognizeText";
String base = host.concat(endpoint);

String url = new URIBuilder(base)
    .setParameter("mode", "Printed")
    .toString();

HttpResponse<String> recognitionResponse = Unirest.post(url)
    .header("Content-Type", "application/octet-stream")
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .body(bytes)
    .asString();

String operationLocation = recognitionResponse
    .getHeaders()
    .getFirst("Operation-Location");

Gson gson = new Gson();

TextRecognitionOperationResponse operationResponse = null;

while(true) {
    String operationResponseString = Unirest.get(operationLocation)
        .header("Ocp-Apim-Subscription-Key", subscriptionKey)
        .asString()
        .getBody();

    operationResponse = gson.fromJson(operationResponseString, TextRecognitionOperationResponse.class);

    if (operationResponse.status.equals("Succeeded")) {
        break;
    }
    else {
        Thread.sleep(1000L);
    }
}

TextRecognitionResult result = operationResponse.recognitionResult;
