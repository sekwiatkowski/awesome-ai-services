// "text" is a String containing the input document.
// For English, set "languageCode" to "en".

const AWS = require('AWS-sdk')

const comprehend = new AWS.Comprehend({
    region: 'us-east-1'
})

const params = { Text: text, LanguageCode: languageCode }

comprehend.detectEntities(params, (err, res) => {
   const keyPhrases = res.KeyPhrases
})
