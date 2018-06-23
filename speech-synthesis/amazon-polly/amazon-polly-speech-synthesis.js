// "ssml" is the input provided in the Speech Synthesis Markup Language.
// Alternatively, you can provide raw text and set "TextType" to "text".

const AWS = require('AWS-sdk')
const fs = require('fs')

const polly = new AWS.Polly({
    region: 'us-east-1'
})

const params = {
    OutputFormat: "mp3",
    Text: ssml,
    TextType: "ssml",
    VoiceId: "Matthew"
}

polly.synthesizeSpeech(params, (err, res) => {
    fs.writeFileSync(target, res.AudioStream)
})
