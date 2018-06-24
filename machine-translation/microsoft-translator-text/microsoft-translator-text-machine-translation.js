// "input" is a string holding the input text.
// "to" is an array of language codes. To translate the input  to German and Italian, for example, set "to" equal to "['de', 'it']".

const [ subscriptionKey ] = process.argv.slice(2)

const fs = require('fs')
const querystring = require('querystring')
const request = require('request')

const input = fs.readFileSync('./sample-input.txt', 'utf-8')
const host = 'https://api.cognitive.microsofttranslator.com'
const path = '/translate'

const parameters = querystring.stringify({ 'api-version': '3.0', to })

const url = host + path + '?' + parameters

const body = [
    {
        Text: input
    }
]

request.post(
    {
        url,
        body,
        headers: {
            'Content-Type': 'application/json',
            'Ocp-Apim-Subscription-Key': subscriptionKey
        },
        json: true
    },
    (err, res, body) => {
        const translations = body[0].translations
    })
