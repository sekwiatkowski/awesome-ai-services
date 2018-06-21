// For English, "languageCode" is set to "en".

AmazonComprehend client = AmazonComprehendClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build();

DetectEntitiesRequest request = new DetectEntitiesRequest()
    .withText(text)
    .withLanguageCode(languageCode);

DetectEntitiesResult result = client.detectEntities(request);

List<Entity> entities = result.getEntities();
