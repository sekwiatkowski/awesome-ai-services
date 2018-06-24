// "input" is a string holding the path to an audio file.
// For US English, set "languageCode" to "en-US".

const request = require('request')
const fs = require('fs')

const tokenHost = "https://westus.api.cognitive.microsoft.com"
const tokenPath = "/sts/v1.0/issueToken"
const tokenUrl = tokenHost + tokenPath

request.post(
    {
        url: tokenUrl,
        headers: {
            'Ocp-Apim-Subscription-Key': subscriptionKey
        }
    },
    (err, res, token) => {

        const sttHost = 'https://westus.stt.speech.microsoft.com'
        const sstPath = `/speech/recognition/conversation/cognitiveservices/v1?language=${languageCode}`
        const sstUrl = sttHost + sstPath

        const body = fs.readFileSync(input)

        request.post(
            {
                url: sstUrl,
                headers: {
                    'Content-Type': 'application/json',
                    'Authorization': token
                },
                body
            },
            (err, res, recognition) => {

            })
    })
