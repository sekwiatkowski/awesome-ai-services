// "ssml" is the input provided in the Speech Synthesis Markup Language.
// "target" is the path to the output file.

const request = require('request')
const fs = require('fs')

const tokenHost = 'https://westus.api.cognitive.microsoft.com'
const tokenPath = '/sts/v1.0/issueToken'
const tokenUrl = tokenHost + tokenPath

request.post(
    {
        url: tokenUrl,
        headers: {
            'Ocp-Apim-Subscription-Key': subscriptionKey
        }
    },
    (err, res, token) => {
        const ttsHost = "https://westus.tts.speech.microsoft.com"
        const ttsPath = "/cognitiveservices/v1"
        const ttsUrl = ttsHost + ttsPath

        request.post(
            {
                url: ttsUrl,
                headers: {
                    'X-Microsoft-OutputFormat': 'audio-16khz-128kbitrate-mono-mp3',
                    'Content-Type': 'application/ssml+xml',
                    'Authorization': token,
                    'User-Agent': 'awesome-ai-services'
                },
                body: ssml,
                encoding: null
            },
            (err, res, body) => {
                fs.writeFileSync(target, body)
            })
    })
