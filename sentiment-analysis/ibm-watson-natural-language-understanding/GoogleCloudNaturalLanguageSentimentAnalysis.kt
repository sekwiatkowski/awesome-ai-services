// "text" is a String holding the input document.

val service = NaturalLanguageUnderstanding("2018-03-16", username, password)

val sentimentOptions = SentimentOptions.Builder().build()

val features = Features.Builder()
    .sentiment(sentimentOptions)
    .build()

val parameters = AnalyzeOptions.Builder()
    .text(text)
    .features(features)
    .build()

val response = service
    .analyze(parameters)
    .execute()

val sentiment = response.sentiment
