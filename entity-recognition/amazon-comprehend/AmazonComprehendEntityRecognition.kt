// "text" is a string containing the input document.
// For US English, set "languageCode" to "en".

val client = AmazonComprehendClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build()

val request = DetectEntitiesRequest()
    .withText(text)
    .withLanguageCode(languageCode)

val result = client.detectEntities(request)

val entities = result.entities
