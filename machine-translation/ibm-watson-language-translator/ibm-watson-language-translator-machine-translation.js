// "input" is the string containing the input document.
// To translate from English to German, set "source" to "en" and "target" to "de".

const LanguageTranslatorV3 = require('watson-developer-cloud/language-translator/v3')

const languageTranslator = new LanguageTranslatorV3({
    iam_apikey,
    version: '2018-04-05',
    url: 'https://gateway-fra.watsonplatform.net/language-translator/api'
})

languageTranslator.translate(
    {
        text,
        source,
        target
    },
    (err, res) => {
        const translation = res.translations[0].translation
        console.log(translation)
    })
