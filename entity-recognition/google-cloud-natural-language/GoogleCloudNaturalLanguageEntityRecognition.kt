val client = LanguageServiceClient.create()

val document = Document.newBuilder()
    .setContent(text)
    .setType(Document.Type.PLAIN_TEXT)
    .build()

val entities = client
    .analyzeEntities(document, EncodingType.UTF8)
    .entitiesList
