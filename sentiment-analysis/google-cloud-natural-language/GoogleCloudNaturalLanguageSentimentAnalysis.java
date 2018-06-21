try (LanguageServiceClient language = LanguageServiceClient.create()) {
    Document document = Document.newBuilder()
        .setContent(text)
        .setType(Document.Type.PLAIN_TEXT)
        .build();

    Sentiment sentiment = language
        .analyzeSentiment(document)
        .getDocumentSentiment();
}
