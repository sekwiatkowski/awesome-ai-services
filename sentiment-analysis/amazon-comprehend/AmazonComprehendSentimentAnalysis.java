// For English, set "languageCode" to "en".

AmazonComprehend client = AmazonComprehendClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build();

DetectSentimentRequest request = new DetectSentimentRequest()
    .withText(text)
    .withLanguageCode(languageCode);

DetectSentimentResult result = client.detectSentiment(request);

String sentiment = result.getSentiment();
