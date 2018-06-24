// "input" is a string containg the path to an image file.

const vision = require('@google-cloud/vision')

const client = new vision.ImageAnnotatorClient()

client
    .faceDetection(input)
    .then(res => {
        const faceDetection = res[0].faceAnnotations
    })
    .catch(err => {
    })
