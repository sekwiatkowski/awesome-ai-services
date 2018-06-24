// "input" is a string holding the path to the image.

const AWS = require('AWS-sdk')
const fs = require('fs')

const rekognition = new AWS.Rekognition({
    region: 'us-east-1'
})

fs.readFile(input, (readErr, bytes) => {
    const params = {
        Image: {
            Bytes: bytes
        },
        Attributes: [ 'ALL' ]
    }

    rekognition.detectFaces(params, (detectErr, res) => {
        const faceDetails = res.FaceDetails
    })
})
