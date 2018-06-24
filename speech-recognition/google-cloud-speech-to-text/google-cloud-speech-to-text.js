// "input" is a string holding the path to the input file (a local FLAC file, in this example).
// For US English, set "languageCode" to "en-US".

const speech = require('@google-cloud/speech')
const fs = require('fs');

const client = new speech.SpeechClient()

const file = fs.readFileSync(input, 'utf-8')
const audioBytes = file.toString('base64')

const audio = {
    content: audioBytes
}

const config = {
    encoding: 'FLAC',
    languageCode
}

const req = { audio, config }

client
    .recognize(req)
    .then(res => {
        const transcription = res[0].results
            .map(result => result.alternatives[0].transcript)
            .join('\n')
    })
    .catch(err => {
    })
