NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding("2018-03-16", username, password);

EntitiesOptions options = new EntitiesOptions.Builder().build();

Features features = new Features.Builder()
    .entities(options)
    .build();

AnalyzeOptions parameters = new AnalyzeOptions.Builder()
    .text(text)
    .features(features)
    .build();

AnalysisResults response = service
    .analyze(parameters)
    .execute();

List<EntitiesResult> entities = response.getEntities();
