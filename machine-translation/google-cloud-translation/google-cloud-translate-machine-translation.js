// "text" is a string holding the input document.
// To translate from English to German, set "from" to "en" and "to" to "de".

const Translate = require('@google-cloud/translate')

const translate = new Translate()

const options = { from, to }

translate
  .translate(text, options)
  .then(results => {
      const translation = results[0]
  })
  .catch(err => {
  })
