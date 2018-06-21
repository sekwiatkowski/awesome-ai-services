// For English, set "languageCode" to "en".

AmazonComprehend client = AmazonComprehendClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build();

DetectKeyPhrasesRequest request = new DetectKeyPhrasesRequest()
    .withText(text)
    .withLanguageCode(languageCode);

DetectKeyPhrasesResult result = client.detectKeyPhrases(request);

List<KeyPhrase> keyPhrases = result.getKeyPhrases();
