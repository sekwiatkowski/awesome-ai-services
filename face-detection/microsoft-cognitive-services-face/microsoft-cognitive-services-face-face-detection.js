// "input" is a string holding a path to an image file.

const querystring = require('querystring')
const request = require('request')
const fs = require('fs')

const host = 'https://westcentralus.api.cognitive.microsoft.com'
const endpoint = '/face/v1.0/detect'
const parameters = querystring.stringify({
    returnFaceId: true,
    returnFaceLandmarks: false,
    returnFaceAttributes: 'age,gender,headPose,smile,facialHair,glasses,emotion,hair,makeup,occlusion,accessories,blur,exposure,noise'
})

const url = host + endpoint + '?' + parameters

request.post(
    {
        url,
        headers: {
            'Content-Type': 'application/octet-stream',
            'Ocp-Apim-Subscription-Key': subscriptionKey
        },
        body: fs.readFileSync(input)
    },
    (err, res, faceDetections) => {

    })
