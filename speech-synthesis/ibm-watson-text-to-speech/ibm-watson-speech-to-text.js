// "text" is a string containing raw text or Speech Synthesis Markup Language (SSML) content.
// "target" is a string holding the path to the output file.

const TextToSpeechV1 = require('watson-developer-cloud/text-to-speech/v1')
const fs = require('fs')

const textToSpeech = new TextToSpeechV1({
    username,
    password,
    url: 'https://stream.watsonplatform.net/text-to-speech/api/'
})

const params = {
    text,
    voice: 'en-US_AllisonVoice',
    accept: 'audio/wav'
}

textToSpeech
    .synthesize(params, function(err, audio) {
        // The wav header requires a file length, but this is unknown until after the header is already generated and sent.
        textToSpeech.repairWavHeader(audio)

        fs.writeFileSync(target, audio)
    })
