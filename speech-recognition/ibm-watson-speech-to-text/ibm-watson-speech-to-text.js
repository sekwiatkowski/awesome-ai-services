// "input" is a string holding the path to an audio file.

const SpeechToTextV1 = require('watson-developer-cloud/speech-to-text/v1')
const fs = require('fs')

const speechToText = new SpeechToTextV1({
    username,
    password,
    version: '2018-04-05',
    url: 'https://stream.watsonplatform.net/speech-to-text/api/'
})

const params = {
    audio: fs.createReadStream(input),
    content_type: 'audio/mp3'
}

speechToText.recognize(
    params,
    (err, data) => {
        const transcription = data.results
            .map(result => result.alternatives[0].transcript)
            .join('\n')
    })
