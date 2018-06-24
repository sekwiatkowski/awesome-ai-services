// "input" is a string holding the path to the image file.

const AWS = require('AWS-sdk')
const fs = require('fs')

const rekognition = new AWS.Rekognition({
    region: 'us-east-1'
})

fs.readFile(input, (readErr, bytes) => {
    const params = {
        Image: {
            Bytes: bytes
        }
    }

    rekognition.detectText(params, (detectErr, res) => {
        const recognizedText = res.TextDetections
    })
})
