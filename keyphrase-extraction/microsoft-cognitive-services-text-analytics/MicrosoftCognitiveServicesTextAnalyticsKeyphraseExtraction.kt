// "text" is a String containg the input document.
// For English, set "language" to "en".

data class KeyphraseExtraction(
    val id: String,
    val keyPhrases: List<String>)

data class KeyphraseExtractionResponse(
    val documents: List<KeyphraseExtraction>)

val host = "https://westeurope.api.cognitive.microsoft.com"
val path = "/text/analytics/v2.0/keyPhrases"
val url = host + path

val documents = Documents()
documents.add("1", language, text)

val gson = Gson()
val body = gson.toJson(documents)

val stringResponse = Unirest.post(url)
    .header("Content-Type", "application/json")
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .body(body)
    .asString()
    .body

val response = gson.fromJson(stringResponse, KeyphraseExtractionResponse::class.java)
val keyPhrases = response.documents.single().keyPhrases
