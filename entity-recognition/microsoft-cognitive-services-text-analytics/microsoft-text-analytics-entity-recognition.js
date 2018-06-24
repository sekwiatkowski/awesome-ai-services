// "text" is a string holding the input document.

const request = require('request')

const host = 'https://westeurope.api.cognitive.microsoft.com'
const path = '/text/analytics/v2.0/entities'
const url = host + path

const document = {
    id: '1',
    text
}

const body = {
    documents: [
        document
    ]
}

const params = {
    url,
    body,
    headers: {
        'Ocp-Apim-Subscription-Key': subscriptionKey
    },
    json: true
}

request.post(
    params,
    (err, res, body) => {
        const entities = body.documents[0].entities
    })
