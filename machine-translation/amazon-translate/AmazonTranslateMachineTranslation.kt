// "input" is a String containing the input document
// To translate from English to German, set "sourceLanguageCode" to "en" and "targetLanguageCode" to "de".

val client = AmazonTranslateClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build()

val request = TranslateTextRequest()
    .withText(input)
    .withSourceLanguageCode(sourceLanguageCode)
    .withTargetLanguageCode(targetLanguageCode)

val result = client.translateText(request)
val translatedText = result.translatedText
