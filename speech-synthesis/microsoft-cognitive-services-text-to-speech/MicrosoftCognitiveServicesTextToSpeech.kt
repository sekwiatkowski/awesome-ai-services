// "ssml" is the input provided in the Speech Synthesis Markup Language.

val tokenHost = "https://westus.api.cognitive.microsoft.com"
val tokenPath = "/sts/v1.0/issueToken"
val tokenUrl = tokenHost + tokenPath

val token = Unirest.post(tokenUrl)
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .asString()
    .body

val ttsHost = "https://westus.tts.speech.microsoft.com"
val ttsPath = "/cognitiveservices/v1"
val ttsUrl = ttsHost + ttsPath

val audioStream = Unirest.post(ttsUrl)
    .header("X-Microsoft-OutputFormat", "audio-16khz-128kbitrate-mono-mp3")
    .header("Content-Type", "application/ssml+xml")
    .header("Authorization", token)
    .body(ssml)
    .asBinary()
    .body

val fileOutputStream = FileOutputStream(outputFile)

IOUtils.copy(audioStream, fileOutputStream)

audioStream.close()
fileOutputStream.close()
