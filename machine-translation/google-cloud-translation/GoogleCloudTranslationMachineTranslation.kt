// input a String containing the input document.
// "format" is either set to "text" or "html".
// To translate from English to German, set "sourceLanguage" to "en" and "targetLanguage" to "en".

val translate = TranslateOptions.getDefaultInstance().service

val translation = translate.translate(
    input,
    Translate.TranslateOption.format(format),
    Translate.TranslateOption.sourceLanguage(sourceLanguage),
    Translate.TranslateOption.targetLanguage(targetLanguage))

val translatedText = translation.translatedText
