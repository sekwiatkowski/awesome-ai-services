// "input" is a string holding the path to an image file.

const VisualRecognitionV3 = require('watson-developer-cloud/visual-recognition/v3')
const fs = require('fs')

const visualRecognition = new VisualRecognitionV3({
    url: 'https://gateway.watsonplatform.net/visual-recognition/api',
    version: '2018-03-19',
    iam_apikey
})

const params = {
    images_file: fs.createReadStream(input)
}

visualRecognition.detectFaces(params, (err, res) => {
    const faces = res.images[0].faces
})
