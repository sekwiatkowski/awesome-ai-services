// "ssml" is the input in the Speech Synthesis Markup Language (SSML) format.
// "target" is the path to the output file.
// To use the WaveNet architecture, specificy a "voice" between "en-US-Wavenet-A" and "en-US-Wavenet-F".
// For US English, set "languageCode" to "en-US".

const textToSpeech = require('@google-cloud/text-to-speech')
const fs = require('fs')

const client = new textToSpeech.TextToSpeechClient()

const request = {
    input: { ssml },
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
