// "input" is a string holding the input document.
// For US English, set "languageCode" to "en-US".

const textToSpeech = require('@google-cloud/text-to-speech')
const fs = require('fs')

const client = new textToSpeech.TextToSpeechClient()

const request = {
    input,
    voice: {
        languageCode,
        name: 'en-US-Wavenet-C'
    },
    audioConfig: { audioEncoding: 'MP3' }
}

client.synthesizeSpeech(request, (err, response) => {
    fs.writeFile(target, response.audioContent, 'binary', err => {

    })
})
