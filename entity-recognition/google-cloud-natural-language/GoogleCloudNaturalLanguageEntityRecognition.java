// "content" is a string containg the input document.

try (LanguageServiceClient language = LanguageServiceClient.create()) {
    Document document = Document.newBuilder()
        .setContent(content)
        .setType(Document.Type.PLAIN_TEXT)
        .build();

    List<Entity> entities = language
        .analyzeEntities(document, EncodingType.UTF8)
        .getEntitiesList();
}
