public class Document {
    public String id, language, text;

    public Document(String id, String language, String text){
        this.id = id;
        this.language = language;
        this.text = text;
    }
}

public class Documents {
    public List<Document> documents;

    public Documents() {
        this.documents = new ArrayList<>();
    }
    public void add(String id, String language, String text) {
        this.documents.add (new Document (id, language, text));
    }
}

public class KeyphraseExtraction {
    public String id;
    public List<String> keyPhrases;
}

public class KeyphraseExtractionResponse {
    public List<KeyphraseExtraction> documents;
}

String host = "https://westeurope.api.cognitive.microsoft.com";
String path = "/text/analytics/v2.0/keyPhrases";
String url = host.concat(path);

Documents documents = new Documents();
documents.add(id, language, text);

Gson gson = new Gson();
String body = gson.toJson(documents);

String stringResponse = Unirest.post(url)
    .header("Content-Type", "application/json")
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .body(body)
    .asString()
    .getBody();

KeyphraseExtractionResponse response = gson.fromJson(stringResponse, KeyphraseExtractionResponse.class);
