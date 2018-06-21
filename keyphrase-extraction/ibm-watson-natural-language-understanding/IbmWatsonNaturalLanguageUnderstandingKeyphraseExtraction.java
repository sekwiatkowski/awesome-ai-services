NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding("2018-03-16", username, password);

KeywordsOptions options = new KeywordsOptions.Builder().build();

Features features = new Features.Builder()
    .keywords(options)
    .build();

AnalyzeOptions parameters = new AnalyzeOptions.Builder()
    .text(text)
    .features(features)
    .build();

AnalysisResults response = service
    .analyze(parameters)
    .execute();

List<KeywordsResult> keywords = response.getKeywords();
