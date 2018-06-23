// "text" is a String containing the input document.
// For English, set" languageCode" to "en".

val client = AmazonComprehendClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build()

val request = DetectSentimentRequest()
    .withText(text)
    .withLanguageCode(languageCode)

val result = client.detectSentiment(request)

val sentiment = result.sentiment
