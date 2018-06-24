// "input" is a string holding the path to the image.

const AWS = require('AWS-sdk')
const fs = require('fs')

const rekognition = new AWS.Rekognition({
    region: 'us-east-1'
})

fs.readFile(input, (readErr, image) => {
    const params = {
        Image: {
            Bytes: image
        },
        Attributes: [ 'ALL' ]
    }

    rekognition.detectFaces(params, (detectionErr, faceDetections) => {
        // do something with the face detections
    })
})
