// For English, "language" is set to "en".

class Document {
    public String id, language, text;

    public Document(String id, String language, String text) {
        this.id = id;
        this.language = language;
        this.text = text;
    }
}

class Documents {
    public List<Document> documents;

    public Documents() {
        this.documents = new ArrayList<>();
    }
    public void add(String id, String language, String text) {
        this.documents.add (new Document (id, language, text));
    }
}

Documents documents = new Documents();
documents.add(id, language, textId);

Gson gson = new Gson();
String body = gson.toJson(documents);

String stringResponse = Unirest.post(host.concat(path))
    .header("Content-Type", "application/json")
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .body(body)
    .asString()
    .getBody();

Response response = gson.fromJson(stringResponse, Response.class);
