// "targetLanguages" is a list of strings. To translate into German and Italian, add "de" and "it" to that list.

data class TranslatorTextRequest(val Text: String)

data class LanguageDetection(val language: String, val score: Float)

data class Translation(val text: String, val to: String)

data class TranslatorTextResponseItem(
    val detectedLanguage: LanguageDetection,
    val translations: List<Translation>)

class TranslatorTextResponse : ArrayList<TranslatorTextResponseItem>()

val host = "https://api.cognitive.microsofttranslator.com"
val path = "/translate?api-version=3.0"
val base = host + path

val targetLanguages = listOf("de", "it")

val urlBuilder = URIBuilder(base)

targetLanguages.forEach { language ->
    urlBuilder.addParameter("to", language)
}

val url = urlBuilder
    .toString()

val request = TranslatorTextRequest(input)
val requests = ArrayList<TranslatorTextRequest>()
requests.add(request)

val gson = Gson()
val body = gson.toJson(requests)

val responseString = Unirest.post(url)
    .header("Content-Type", "application/json")
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .body(body)
    .asString()
    .body

val response = gson.fromJson(responseString, TranslatorTextResponse::class.java)

val translations = response[0].translations
