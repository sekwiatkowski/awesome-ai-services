// "input" is a string holding the path to an image file.
// "mode" is a required parameter that is set to "Printed" or "Handwritten".

const querystring = require('querystring')
const request = require('request')
const fs = require('fs')

const host = 'https://westcentralus.api.cognitive.microsoft.com'
const endpoint = '/vision/v2.0/recognizeText'

const parameters = querystring.stringify({ mode })

const url = host + endpoint + '?' + parameters

request.post(
    {
        url,
        headers: {
            'Content-Type': 'application/octet-stream',
            'Ocp-Apim-Subscription-Key': subscriptionKey
        },
        body: fs.createReadStream(input)
    },
    (startErr, startRes) => {
        const operationLocation = startRes.headers['operation-location']

        const repeatUntilCompleted = cb => {
            request(
                {
                    url: operationLocation,
                    headers: {
                        'Ocp-Apim-Subscription-Key': subscriptionKey
                    },
                    json: true
                },
                (getErr, getRes, body) => {
                    const status = body.status
                    if(status === 'Running') {
                        setTimeout(
                            function () {
                                repeatUntilCompleted(cb)
                            },
                            1000
                        )
                    }
                    else if(status === 'Succeeded') {
                        cb(body.recognitionResult)
                    }
                })
        }

        repeatUntilCompleted(recognitionResult => {
            // Do something with the recognition result
        })
    })
