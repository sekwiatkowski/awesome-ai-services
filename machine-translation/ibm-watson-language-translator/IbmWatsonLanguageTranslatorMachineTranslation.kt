// "input" is a String containing the input document.
// To translate from English to German, set "source" to "en" and "target" to "de".

val iamOptions = IamOptions.Builder()
    .apiKey(apiKey)
    .build()

val translator = LanguageTranslator("2018-03-16", iamOptions)
translator.endPoint = endPoint

val options = TranslateOptions.Builder()
    .addText(input)
    .modelId("$source-$target")
    .build()

val result = translator
    .translate(options)
    .execute()

val translation = result.translations.single()

val translatedText = translation.translationOutput
