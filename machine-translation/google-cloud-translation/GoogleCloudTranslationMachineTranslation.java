// "input" is a string holding the source document.
// To translate from English to German, set "sourceLanguageCode" to "en" and "targetLanguageCode" to "de".

Translate translate = TranslateOptions.getDefaultInstance().getService();

Translation translation = translate.translate(
    input,
    Translate.TranslateOption.format("text"),
    Translate.TranslateOption.sourceLanguage(sourceLanguage),
    Translate.TranslateOption.targetLanguage(targetLanguage));

String translatedText = translation.getTranslatedText();
