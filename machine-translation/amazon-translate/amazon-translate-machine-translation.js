// "input" is a string containing with the input document.
// To translate from English to German, set "sourceLanguageCode" to "en" and "targetLanguageCode" to "de".

const AWS = require('AWS-sdk')

const translate = new AWS.Translate({
    region: 'us-east-1'
})

const params = {
    SourceLanguageCode: sourceLanguageCode,
    TargetLanguageCode: targetLanguageCode,
    Text: input
}

translate.translateText(params, (err, res) => {
    const translatedText = res.TranslatedText
})
