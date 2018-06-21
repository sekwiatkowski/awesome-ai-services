// For English, set "language" to "en"

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

public class Entity {
    public String name;
    public String wikipediaLanguage;
    public String wikipediaId;
    public String wikipediaUrl;
    public String bingId;

    public Entity(String name, String wikipediaLanguage, String wikipediaId, String wikipediaUrl, String bingId) {
        this.name = name;
        this.wikipediaLanguage = wikipediaLanguage;
        this.wikipediaId = wikipediaId;
        this.wikipediaUrl = wikipediaUrl;
        this.bingId = bingId;
    }
}

public class EntityRecognition {
    public String id;
    public List<Entity> entities;

    public EntityRecognition(String id, List<Entity> entities) {
        this.id = id;
        this.entities = entities;
    }
}

public class EntityRecognitionResponse {
    public List<EntityRecognition> documents;
}

String host = "https://westeurope.api.cognitive.microsoft.com";
String path = "/text/analytics/v2.0/entities";
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

Response response = gson.fromJson(stringResponse, EntityRecognitionResponse.class);
