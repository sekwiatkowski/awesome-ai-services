# awesome-ai-services

A curated list of awesome AI services maintained by Sebastian Kwiatkowski.

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
[Overview](https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html) | [Demo](https://console.aws.amazon.com/comprehend/v2/home?region=us-east-1#home)

- What are the entities mentioned in the document?
- What are their types?
- How often is each of these entities mentioned?

Supported entity types: commercial items, dates, events, locations, organizations, persons, quantities, other types, titles

### Google Cloud Natural Language
[Overview](https://cloud.google.com/natural-language/docs/reference/rest/v1/Entity) | [Demo](https://cloud.google.com/natural-language/)

- What are the entities mentioned in the document?
- What are their types?
- How salient is each of these entities in the document?
- Where in the text are these entities mentioned?
- What are the URLs to the corresponding Wikipedia entries?

Supported entity types: consumer good, event, location, organization, person, work of art, other types

### IBM Watson Natural Understanding
[Overview](https://www.ibm.com/watson/developercloud/natural-language-understanding/api/v1/#entities) | [Demo](https://natural-language-understanding-demo.ng.bluemix.net/)

- What are the entities mentioned in the document?
- What are their types and subtypes?

Supported entity types:
- Types: anatomy, award, broadcaster, company, crime, drug, email address, facility, geographic feature, health condition, hashtag, ip address, job title, location, movie, music group, natural event, organization, person, print media, quantity, sport, sporting event, television show, twitter handle, vehicle
- [Subtypes](https://console.bluemix.net/docs/services/natural-language-understanding/entity-types-v1.html#entity-types-and-subtypes-version-1-#entity-subtypes)

## Microsoft Cognitive Services Text Analytics (Preview)
[Overview](https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/how-tos/text-analytics-how-to-entity-linking) | [Demo](https://azure.microsoft.com/en-us/services/cognitive-services/text-analytics/)

- What are the entities mentioned in the document?
- Where in the document are they mentioned?
- What are the URLs to the corresponding Wikipedia entries?
- What are their Wikipedia and Bing IDs?

## Keyphrase Extraction

### Amazon Comprehend
[Overview](https://aws.amazon.com/comprehend/features/#Keyphrase_Extraction) | [Demo](https://console.aws.amazon.com/comprehend/v2/home?region=us-east-1#home)

- Which keywords can be extracted for the given document?
- How often do each of these keywords occur?

### Google Cloud Natural Language
*Not supported*

### IBM Watson Natural Understanding
[Overview](https://www.ibm.com/watson/developercloud/natural-language-understanding/api/v1/#entities) | [Demo](https://natural-language-understanding-demo.ng.bluemix.net/)

- Which keywords can be extracted for the given document?

### Microsoft Cognitive Services Text Analytics | [Demo](https://azure.microsoft.com/en-us/services/cognitive-services/text-analytics/)
[Overview](https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/how-tos/text-analytics-how-to-keyword-extraction)

- Which keywords can be extracted for the given document?

## Sentiment Analysis

### Amazon Comprehend
[Overview](https://aws.amazon.com/comprehend/features#Sentiment_Analysis) | [Demo](https://console.aws.amazon.com/comprehend/v2/home?region=us-east-1#home)

- To what extent does the document express an overal positive, negative, neutral or mixed sentiment?

### Google Cloud Natural Language [Demo](https://cloud.google.com/natural-language/)
[Overview](https://cloud.google.com/natural-language/docs/analyzing-sentiment)

- To what extent does the document express an overal positive, negative, neutral or mixed sentiment?

### IBM Watson Natural Understanding
[Overview](https://www.ibm.com/watson/developercloud/natural-language-understanding/api/v1/#sentiment) | [Demo](https://natural-language-understanding-demo.ng.bluemix.net/)

- To what extent does the document express an overal positive, negative or neutral sentiment?

### Microsoft Cognitive Services Text Analytics
[Overview](https://docs.microsoft.com/en-us/azure/cognitive-services/text-analytics/how-tos/text-analytics-how-to-sentiment-analysis) | [Demo](https://azure.microsoft.com/en-us/services/cognitive-services/text-analytics/)

- To what extent does the document express an overal positive, negative or neutral sentiment?

# Speech

<h2 id="speech-to-text">Speech-to-text / Speech Recognition</h2>

### Amazon Transcribe

[Overview](https://aws.amazon.com/transcribe/)

Support for US English and Spanish

### Google Speech-to-Text

[Overview](https://cloud.google.com/speech-to-text/)

Support for 119 languages/locales

### IBM Speech to Text

[Overview](https://www.ibm.com/watson/services/speech-to-text)

Support for 9 languages

### Microsoft Cognitive Services Speech to Text (Preview)

[Overview](https://azure.microsoft.com/en-us/services/cognitive-services/speech-to-text/)

Support for 8 languages

<h2 id="text-to-speech">Text-to-speech / Speech Synthesis</h2>

### Amazon Polly

[Overview](https://aws.amazon.com/polly/)

34 voices in 25 languages

SSML extensions:
- Breathing
- Dynamic Range Compression
- Speaking softly
- Timbre
- Whispering

### Google Text-to-Speech (Beta)

[Overview](https://cloud.google.com/text-to-speech/)

28 voices in 14 languages

### IBM Watson Text to Speech

[Overview](https://www.ibm.com/watson/services/text-to-speech/)

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

[Overview](https://azure.microsoft.com/en-us/services/cognitive-services/text-to-speech/)

80 voices in 32 languages

Customization in private preview

# Vision

## Face recognition

### Amazon Rekognition
[Overview](https://aws.amazon.com/rekognition/image-features/)

- Where are the faces located in the image?
- Given a face image, what other image shows the most similar face?
- Are the faces in two images of the same person?
- Are the eyes opened or closed?
- Is the person smiling?

### Google Cloud Vision
[Overview](https://cloud.google.com/vision/docs/detecting-faces)

- Where are the faces and face parts located in the image?
- Does the face express the emotional states of joy, sorrow, anger or surprise?
- Is the person wearing headwear?

### IBM Watson Visual Recognition
[Overview](https://console.bluemix.net/docs/services/visual-recognition/getting-started.htm)

- Where are the faces and face parts located in the image?
- What are the age ranges of the persons?
- What are their genders?

### Microsoft Cognitive Service Face
[Overview](https://azure.microsoft.com/en-us/services/cognitive-services/face/)

- What are the faces and face parts localed in the image?
- Are parts of the face occluded?
- What is the pose of the head?
- Are the faces in two images of the same person?
- What is the age of the person?
- What is the gender?
- Does the face express the emotional states of anger, contempt, disgust, fear, happiness sadness, surprise or a neutral state?
- Is the person smiling?
- Is the hair visibile? What is the hair color? Or is the person bald?
- Does the person have moustache, a beard or sideburns?
- What kind of acessories is the person wearing, if any?
- What kind of glasses is the person wearing, if any?

## Text recognition

### Amazon Rekognition
[Overview](https://docs.aws.amazon.com/rekognition/latest/dg/text-detection.html)

- Where in the image file is text located?
- What is the text content?

### Google Cloud Vision
[Overview](https://cloud.google.com/vision/docs/ocr)

- Where in the image file is text located?
- What is the text content?
- What is the language of the text content?

### IBM Watson Visual Recognition
*This feature is currently in private beta.*

### Microsoft Cognitive Services Computer Vision
[Overview](https://azure.microsoft.com/en-us/services/cognitive-services/computer-vision/#text)

- Where in the image file is text located?
- What is the text content?


## License
[![Creative Commons License](http://i.creativecommons.org/l/by/4.0/88x31.png)](http://creativecommons.org/licenses/by/4.0/)

This work is licensed under a [Creative Commons Attribution 4.0 International License](https://creativecommons.org/licenses/by/4.0/).
