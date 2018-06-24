// "input" is a string holding the path to an image file.

const vision = require('@google-cloud/vision')

const client = new vision.ImageAnnotatorClient()

client
    .textDetection(input)
    .then(res => {
        const textAnnotations = res[0].textAnnotations
    })
    .catch(err => {
    })
