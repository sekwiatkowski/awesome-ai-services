// "content" is a string holding the input document.

const language = require('@google-cloud/language')

const client = new language.LanguageServiceClient()

const document = {
    content,
    type: 'PLAIN_TEXT'
}

client.analyzeEntities({ document })
    .then(results => {
        const entities = results[0].entities
    })
    .catch(err => {
    })
