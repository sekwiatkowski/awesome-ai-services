// "content" is a String containing the input document in the specified type.

val client = LanguageServiceClient.create()

val document = Document.newBuilder()
    .setContent(content)
    .setType(Document.Type.PLAIN_TEXT)
    .build()

val sentiment = client
    .analyzeSentiment(document)
    .documentSentiment
