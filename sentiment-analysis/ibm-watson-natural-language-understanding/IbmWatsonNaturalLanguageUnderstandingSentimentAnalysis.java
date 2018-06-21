NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding("2018-03-16", username, password);

SentimentOptions sentimentOptions = new SentimentOptions.Builder().build();

Features features = new Features.Builder()
    .sentiment(sentimentOptions)
    .build();

AnalyzeOptions parameters = new AnalyzeOptions.Builder()
    .text(text)
    .features(features)
    .build();

AnalysisResults response = service
    .analyze(parameters)
    .execute();

SentimentResult sentiment = response.getSentiment();
