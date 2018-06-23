// "text" is a string holding the input document.

val service = NaturalLanguageUnderstanding("2018-03-16", username, password)

val options = KeywordsOptions.Builder().build()

val features = Features.Builder()
    .keywords(options)
    .build()

val parameters = AnalyzeOptions.Builder()
    .text(text)
    .features(features)
    .build()

val response = service
    .analyze(parameters)
    .execute()

val keywords = response.keywords
