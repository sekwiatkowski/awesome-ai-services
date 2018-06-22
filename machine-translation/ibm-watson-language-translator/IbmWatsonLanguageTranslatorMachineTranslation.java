// "input" is the string containing the input document.
// To translate from English to German, set "source" to "en" and "target" to "de".

IamOptions iamOptions = new IamOptions.Builder()
    .apiKey(apiKey)
    .build();

LanguageTranslator translator = new LanguageTranslator("2018-03-16", iamOptions);
// It may be required to override the default endpoint.
translator.setEndPoint(endPoint);

TranslateOptions options = new TranslateOptions.Builder()
    .addText(input)
    .modelId(String.format("%s-%s", source, target))
    .build();

TranslationResult result = translator
    .translate(options)
    .execute();

Translation translation = result.getTranslations().get(0);

String translatedText = translation.getTranslationOutput();
