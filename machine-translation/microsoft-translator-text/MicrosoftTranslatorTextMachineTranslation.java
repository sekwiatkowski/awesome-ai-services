// "targetLanguages" is a list of strings. To translate into German and Italian, add "de" and "it" to that list.

public class TranslatorTextRequest {
    String Text;

    public TranslatorTextRequest(String text) {
        this.Text = text;
    }
}

public class LanguageDetection {
    public String language;
    public float score;
}

public class Translation {
    public String text;
    public String to;
}

public class TranslatorTextResponseItem {
    public LanguageDetection detectedLanguage;
    public List<Translation> translations;
}

public class TranslatorTextResponse extends ArrayList<TranslatorTextResponseItem> {}

String host = "https://api.cognitive.microsofttranslator.com";
String path = "/translate?api-version=3.0";
String base = host.concat(path);

URIBuilder builder = new URIBuilder(base);
for (String targetLanguage : targetLanguages) {
    builder.addParameter("to", targetLanguage);
}
String url = builder.toString();

TranslatorTextRequest request = new TranslatorTextRequest(input);
List<TranslatorTextRequest> requests = new ArrayList<>();
requests.add(request);

Gson gson = new Gson();
String body = gson.toJson(requests);

String responseString = Unirest.post(url)
    .header("Content-Type", "application/json")
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .body(body)
    .asString()
    .getBody();

TranslatorTextResponse response = gson.fromJson(responseString, TranslatorTextResponse.class);

List<Translation> translations = response.get(0).translations;
