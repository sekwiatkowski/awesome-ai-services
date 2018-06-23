// "text" is a String containing the input document.
// For English, set "languageCode" to "en".

const comprehend = new AWS.Comprehend({
    region: 'us-east-1'
})

const params = { Text: text, LanguageCode: languageCode }

comprehend.detectSentiment(params, (err, res) => {
   const sentiment = res.Sentiment
   const probabilityDistribution = res.Sentiment
})
