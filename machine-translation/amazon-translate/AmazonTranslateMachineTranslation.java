// "input" is a string holding the source document.
// To translate from English to German, set "sourceLanguageCode" to "en" and "targetLanguageCode" to "de".

AmazonTranslate client = AmazonTranslateClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build();

TranslateTextRequest request = new TranslateTextRequest()
    .withText(input)
    .withSourceLanguageCode(sourceLanguageCode)
    .withTargetLanguageCode(targetLanguageCode);

TranslateTextResult result = client.translateText(request);
String translation = result.getTranslatedText();
