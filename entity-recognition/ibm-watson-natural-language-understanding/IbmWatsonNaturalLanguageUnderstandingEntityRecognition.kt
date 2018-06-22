// "text" is a string containg the input text.

val service = NaturalLanguageUnderstanding("2018-03-16", username, password)

val options = EntitiesOptions.Builder().build()

val features = Features.Builder()
    .entities(options)
    .build()

val parameters = AnalyzeOptions.Builder()
    .text(text)
    .features(features)
    .build()

val response = service
    .analyze(parameters)
    .execute()

val entities = response.entities
