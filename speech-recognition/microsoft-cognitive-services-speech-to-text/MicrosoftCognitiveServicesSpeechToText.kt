// "input" is a File pointing to an audio file.
// For US English, set "languageCode" to "en-US".

data class SpeechRecognitionResponse(
    val RecognitionStatus: String,
    val DisplayText: String?,
    val Offset: Int?,
    val Duration: Int?)

val bytes = inputFile.readBytes()

val tokenHost = "https://westus.api.cognitive.microsoft.com"
val tokenPath = "/sts/v1.0/issueToken"
val tokenUrl = tokenHost + tokenPath

val token = Unirest.post(tokenUrl)
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .asString()
    .body

val sttHost = "https://westus.stt.speech.microsoft.com"
val sstPath = "/speech/recognition/conversation/cognitiveservices/v1?language=$languageCode"
val sstUrl = sttHost + sstPath

val response = Unirest.post(sstUrl)
    .header("Content-Type", "application/json")
    .header("Authorization", token)
    .body(bytes)
    .asString()
    .body

val response = Gson().fromJson(responseString, SpeechRecognitionResponse::class.java)
