// "text" is a string containing the input document.
// For English, set "languageCode" to "en".

val client = AmazonComprehendClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build()

val request = DetectKeyPhrasesRequest()
    .withText(text)
    .withLanguageCode(languageCode)

val result = client.detectKeyPhrases(request)

val keyPhrases = result.keyPhrases
