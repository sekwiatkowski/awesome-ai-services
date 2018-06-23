// For English, set "language" to "en".

class Document(val id: String, val language: String, val text: String)

data class Entity(
    val name : String,
    val wikipediaLanguage: String,
    val wikipediaId: String,
    val wikipediaUrl: String,
    val bingId: String)

data class EntityRecognition(val id: String, val entities: List<Entity>)

data class EntityRecognitionResponse (val documents: List<EntityRecognition>)

val host = "https://westeurope.api.cognitive.microsoft.com"
val path = "/text/analytics/v2.0/entities"
val url = host + path

val documents = listOf(Document("1", language, text))

val gson = Gson()
val body = gson.toJson(documents)

val stringResponse = Unirest.post(url)
    .header("Content-Type", "application/json")
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .body(body)
    .asString()
    .body

val response = gson.fromJson(stringResponse, EntityRecognitionResponse::class.java)
