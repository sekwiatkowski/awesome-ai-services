# awesome-ai-services [![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)

A overview of awesome AI services maintained by Sebastian Kwiatkowski

## Sharing
- [Share on Twitter](http://twitter.com/home?status=http://github.com/sekwiatkowski/awesome-ai-services)
- [Share on Facebook](http://www.facebook.com/sharer/sharer.php?u=http://github.com/sekwiatkowski/awesome-ai-services)
- [Share on Google Plus](http://plus.google.com/share?url=http://github.com/sekwiatkowski/awesome-ai-services)
- [Share on LinkedIn](http://www.linkedin.com/shareArticle?mini=true&url=http://github.com/sekwiatkowski/awesome-ai-services)

## Table of Contents

### Natural Language
- [Entity Recognition](#entity-recognition)
- [Keyphrase Extraction](#keyphrase-extraction)
- [Sentiment Analysis](#sentiment-analysis)

## Speech
- [Speech-to-text / Speech Recognition](#speech-to-text)
- [Text-to-speech / Speech Synthesis](#text-to-speech)

### Vision
- [Face Recognition](#face-recognition)
- [Text Recognition](#text-recognition)

# Natural Language

## Entity Recognition

### Amazon Comprehend
[Overview](https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html) | [UI](https://console.aws.amazon.com/comprehend/v2/home?region=us-east-1#home) | [Pricing](https://aws.amazon.com/comprehend/pricing/)

- What are the entities mentioned in the document?
- What are their types?
- How often is each of these entities mentioned?

Supported entity types: commercial items, dates, events, locations, organizations, persons, quantities, other types, titles

### Google Cloud Natural Language
[Overview](https://cloud.google.com/natural-language/docs/reference/rest/v1/Entity) | [Demo](https://cloud.google.com/natural-language/) | [Pricing](https://cloud.google.com/natural-language/pricing)

- What are the entities mentioned in the document?
- What are their types?
- How salient is each of these entities in the document?
- Where in the text are these entities mentioned?
- What are the URLs to the corresponding Wikipedia entries?

Supported entity types: consumer good, event, location, organization, person, work of art, other types

### IBM Watson Natural Understanding
[Overview](https://console.bluemix.net/docs/services/natural-language-understanding/) | [Demo](https://natural-language-understanding-demo.ng.bluemix.net/) | [Pricing](https://www.ibm.com/cloud/watson-natural-language-understanding/pricing)

- What are the entities mentioned in the document?
- What are their types and subtypes?

Supported entity types:
- Types: anatomy, award, broadcaster, company, crime, drug, email address, facility, geographic feature, health condition, hashtag, ip address, job title, location, movie, music group, natural event, organization, person, print media, quantity, sport, sporting event, television show, twitter handle, vehicle
- [Subtypes](https://console.bluemix.net/docs/services/natural-language-understanding/entity-types-v1.html#entity-types-and-subtypes-version-1-#entity-subtypes)

### Microsoft Cognitive Services Text Analytics (Preview)
[Overview](https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/how-tos/text-analytics-how-to-entity-linking) | [Demo](https://azure.microsoft.com/en-us/services/cognitive-services/text-analytics/) | [Pricing](https://azure.microsoft.com/en-us/pricing/details/cognitive-services/text-analytics/)

- What are the entities mentioned in the document?
- Where in the document are they mentioned?
- What are the URLs to the corresponding Wikipedia entries?
- What are their Wikipedia and Bing IDs?

## Keyphrase Extraction

### Amazon Comprehend
[Overview](https://aws.amazon.com/comprehend/features/#Keyphrase_Extraction) | [Demo](https://console.aws.amazon.com/comprehend/v2/home?region=us-east-1#home) | [Pricing](https://aws.amazon.com/comprehend/pricing/)

- Which keywords can be extracted for the given document?
- How often do each of these keywords occur?

### Google Cloud Natural Language
*Not supported*

### IBM Watson Natural Understanding
[Overview](https://console.bluemix.net/docs/services/natural-language-understanding/) | [Demo](https://natural-language-understanding-demo.ng.bluemix.net/) | [Pricing](https://www.ibm.com/cloud/watson-natural-language-understanding/pricing)

- Which keywords can be extracted for the given document?

### Microsoft Cognitive Services Text Analytics
[Overview](https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/how-tos/text-analytics-how-to-keyword-extraction) | [Demo](https://azure.microsoft.com/en-us/services/cognitive-services/text-analytics/) | [Pricing](https://azure.microsoft.com/en-us/pricing/details/cognitive-services/text-analytics/)

- Which keywords can be extracted for the given document?

## Sentiment Analysis
[Sample input](https://github.com/sekwiatkowski/awesome-ai-services/blob/master/sentiment-analysis/sample-input.txt)

### Amazon Comprehend
[Overview](https://aws.amazon.com/comprehend/features#Sentiment_Analysis) | [Demo](https://console.aws.amazon.com/comprehend/v2/home?region=us-east-1#home) | [Pricing](https://aws.amazon.com/comprehend/pricing/)

- To what extent does the document express an overal positive, negative, neutral or mixed sentiment?

### Google Cloud Natural Language
[Overview](https://cloud.google.com/natural-language/docs/analyzing-sentiment) | [Demo](https://cloud.google.com/natural-language/) | [Pricing](https://azure.microsoft.com/en-us/pricing/details/cognitive-services/text-analytics/)

- To what extent does the document express an overal positive, negative, neutral or mixed sentiment?

### IBM Watson Natural Understanding
[Overview](https://console.bluemix.net/docs/services/natural-language-understanding/) | [Demo](https://natural-language-understanding-demo.ng.bluemix.net/) | [Pricing](https://www.ibm.com/cloud/watson-natural-language-understanding/pricing)

- To what extent does the document express an overal positive, negative or neutral sentiment?

### Microsoft Cognitive Services Text Analytics
[Overview](https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/how-tos/text-analytics-how-to-sentiment-analysis) | [Demo](https://azure.microsoft.com/en-us/services/cognitive-services/text-analytics/) | [Pricing](https://azure.microsoft.com/en-us/pricing/details/cognitive-services/text-analytics/)

- To what extent does the document express an overal positive, negative or neutral sentiment?

# Speech

<h2 id="speech-to-text">Speech-to-text / Speech Recognition</h2>

### Amazon Transcribe

[Overview](https://aws.amazon.com/transcribe/) | [UI](https://console.aws.amazon.com/transcribe/home) | [Pricing](https://aws.amazon.com/transcribe/pricing/)

Support for US English and Spanish

### Google Cloud Speech-to-Text

[Overview](https://cloud.google.com/speech-to-text/) | [Demo](https://cloud.google.com/speech-to-text/) | [Pricing](https://cloud.google.com/speech-to-text/pricing)

Support for 119 languages/locales

### IBM Speech to Text

[Overview](https://www.ibm.com/watson/services/speech-to-text) | [Demo](https://speech-to-text-demo.ng.bluemix.net/) | [Pricing](https://www.ibm.com/cloud/watson-speech-to-text/pricing)

Support for 9 languages

### Microsoft Cognitive Services Speech to Text (Preview)

[Overview](https://azure.microsoft.com/en-us/services/cognitive-services/speech-to-text/) | [Demo](https://azure.microsoft.com/en-us/services/cognitive-services/speech-to-text/) | [Pricing](https://azure.microsoft.com/en-us/pricing/details/cognitive-services/speech-services/)

Support for 8 languages

<h2 id="text-to-speech">Text-to-speech / Speech Synthesis</h2>

[Sample input](https://github.com/sekwiatkowski/awesome-ai-services/tree/master/speech-synthesis/sample-input)

### Amazon Polly

[Overview](https://aws.amazon.com/polly/) | [Sample output](https://soundcloud.com/sebastian-e-kwiatkowski/sets/amazon-polly) | [UI](https://console.aws.amazon.com/polly/home) | [Pricing](https://aws.amazon.com/polly/pricing/)

34 voices in 25 languages

SSML extensions:
- Breathing
- Dynamic Range Compression
- Speaking softly
- Timbre
- Whispering

### Google Cloud Text-to-Speech (Beta)

[Overview](https://cloud.google.com/text-to-speech/) | [Sample output](https://soundcloud.com/sebastian-e-kwiatkowski/sets/google-cloud-text-to-speech) | [Demo](https://cloud.google.com/text-to-speech/) | [Pricing](https://cloud.google.com/text-to-speech/pricing)

28 voices in 14 languages

### IBM Watson Text to Speech

[Overview](https://www.ibm.com/watson/services/text-to-speech/) | [Sample output](https://soundcloud.com/sebastian-e-kwiatkowski/sets/ibm-watson-text-to-speech) | [Demo](https://text-to-speech-demo.ng.bluemix.net/) | [Pricing](https://www.ibm.com/cloud/watson-text-to-speech/pricing)

13 voices in 7 languages

SSML extensions:
- Good news
- Apology
- Uncertainty

Customization:
- Pitch
- Glottal tension
- Breathiness
- Timbre

### Microsoft Cognitive Services Text to Speech (Preview)
[Overview](https://azure.microsoft.com/en-us/services/cognitive-services/text-to-speech/) | [Sample output](https://soundcloud.com/sebastian-e-kwiatkowski/sets/microsoft-cognitive-services) | [Demo](https://azure.microsoft.com/en-us/services/cognitive-services/text-to-speech/) | [Pricing](https://azure.microsoft.com/en-us/pricing/details/cognitive-services/speech-services/)

80 voices in 32 languages

Customization in private preview

# Vision

## Face Recognition
[Sample input](http://awesome-ai-services.s3.amazonaws.com/face-recognition/face-recognition-sample-input.jpg)

### Amazon Rekognition
[Overview](https://aws.amazon.com/rekognition/image-features/) | [Sample output](https://github.com/sekwiatkowski/awesome-ai-services/blob/master/face-recognition/amazon-rekognition-sample-output.json) | [Demo](https://console.aws.amazon.com/rekognition/home?region=us-east-1#/face-detection) | [Pricing](https://aws.amazon.com/rekognition/pricing/)

- Where are the faces and face parts located in the image?
- What are the age ranges of the persons shown?
- Are they smiling?
- Do they wear eyeglasses or sunglasses?
- What are their genders?
- Do they have a beard or mustache?
- Are their eyes or mouth open?
- Do they express emotions of happiness, sadness, anger, confusion, disgust, surprise or calmness?
- Given a face image, what other image shows the most similar face?
- Are the faces in two images of the same person?

### Google Cloud Vision
[Overview](https://cloud.google.com/vision/docs/detecting-faces) | [Sample output](https://github.com/sekwiatkowski/awesome-ai-services/blob/master/face-recognition/amazon-rekognition-sample-output.json) | [Demo](https://cloud.google.com/vision/) | [Pricing](https://cloud.google.com/vision/pricing)

- Where are the faces and face parts located in the image?
- What is the pose of the faces?
- Does the faces express emotions states of joy, sorrow, anger or surprise?
- Is the person wearing headwear?
- Is the photo underexposed or blurred?

### IBM Watson Visual Recognition
[Overview](https://console.bluemix.net/docs/services/visual-recognition/getting-started.htm) | [Sample output](https://github.com/sekwiatkowski/awesome-ai-services/blob/master/face-recognition/ibm-watson-visual-recognition-sample.output.json) | [Demo](https://watson-visual-recognition-duo-dev.ng.bluemix.net/) | [Pricing](https://www.ibm.com/cloud/watson-visual-recognition/pricing)

- Where are the faces located in the image?
- What are the age ranges of the persons shown?
- What are their genders?

### Microsoft Cognitive Service Face
[Overview](https://azure.microsoft.com/en-us/services/cognitive-services/face/) | [Sample output](https://github.com/sekwiatkowski/awesome-ai-services/blob/master/face-recognition/microsoft-cognitive-services-face-sample-output.json) | [Demo](https://azure.microsoft.com/en-us/services/cognitive-services/face/) | [Pricing](https://azure.microsoft.com/en-us/pricing/details/cognitive-services/face-api/)

- What are the faces and face parts located in the image?
- Are parts of the faces occluded?
- What is the pose of the heads?
- How old are they?
- What are their genders?
- Does the face express the emotional states of anger, contempt, disgust, fear, happiness sadness, surprise or a neutral state?
- Arey they smiling?
- Is the hair visible? What is the hair color? Or is the person bald?
- Doe they have a moustache, a beard or sideburns?
- Are they wearing make-up?
- What kind of acessories is the person wearing, if any?
- What kind of glasses is the person wearing, if any?
- Is the photo blurred? What is the exposure level? What is the noise level?
- Are the faces in two images of the same person?

## Text Recognition
[Sample input](http://awesome-ai-services.s3.amazonaws.com/text-recognition/welcome-to-utah.jpg)

### Amazon Rekognition
[Overview](https://docs.aws.amazon.com/rekognition/latest/dg/text-detection.html) | [Sample output](https://github.com/sekwiatkowski/awesome-ai-services/blob/master/text-recognition/amazon-rekognition-sample-output.json) | [Demo](https://console.aws.amazon.com/rekognition/home?region=us-east-1#/text-detection) | [Pricing](https://aws.amazon.com/rekognition/pricing/)

- Where in the image file is text located?
- What is the text content?
- Which boxes do individual words belong to?

### Google Cloud Vision
[Overview](https://cloud.google.com/vision/docs/ocr) | [Sample output](https://github.com/sekwiatkowski/awesome-ai-services/blob/master/text-recognition/google-cloud-vision-sample-output.json) | [Demo](https://cloud.google.com/vision/) | [Pricing](https://cloud.google.com/vision/pricing)

- Where in the image file is text located?
- What is the text content?
- What is the language of the text content?

### IBM Watson Visual Recognition
*This feature is currently in private beta.*

### Microsoft Cognitive Services Computer Vision
[Overview](https://azure.microsoft.com/en-us/services/cognitive-services/computer-vision/#text) | [Sample output](https://github.com/sekwiatkowski/awesome-ai-services/blob/master/text-recognition/microsoft-cognitive-services-computer-vision-sample-output.json) | [Demo](https://azure.microsoft.com/en-us/services/cognitive-services/computer-vision/#text) | [Pricing](https://azure.microsoft.com/en-us/pricing/details/cognitive-services/computer-vision/)

- Where in the image file is text located?
- What is the text content?

## License
[![Creative Commons License](http://i.creativecommons.org/l/by/4.0/88x31.png)](http://creativecommons.org/licenses/by/4.0/)

This work is licensed under a [Creative Commons Attribution 4.0 International License](https://creativecommons.org/licenses/by/4.0/).
