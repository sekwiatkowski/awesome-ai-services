// For English, set "language" to "en".

data class Document(val id: String, val language: String, var text: String)

data class SentimentAnalysis(val id: String, val score: Double)

data class SentimentAnalysisResponse(val documents: List<SentimentAnalysis>)

val host = "https://westeurope.api.cognitive.microsoft.com"
val path = "/text/analytics/v2.0/sentiment"
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

val response = gson.fromJson(stringResponse, SentimentAnalysisResponse::class.java)
val score = response.documents.single().score
