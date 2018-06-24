const language = require('@google-cloud/language')

const client = new language.LanguageServiceClient()

const document = {
    content,
    type: 'PLAIN_TEXT'
}

client.analyzeSentiment({ document })
    .then(results => {
        const sentiment = results[0].documentSentiment;
    })
    .catch(err => {
    })
