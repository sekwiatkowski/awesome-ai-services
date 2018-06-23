// "input" is a File object pointing to an image file.
// "mode" is a required parameter that is set to "Printed" or "Handwritten".

val host = "https://westcentralus.api.cognitive.microsoft.com"
val endpoint = "/vision/v2.0/recognizeText"
val base = host + endpoint

val url = URIBuilder(base)
    .setParameter("mode", mode)
    .toString()

val recognitionResponse = Unirest.post(url)
    .header("Content-Type", "application/octet-stream")
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .body(input.readBytes())
    .asString()

val operationLocation = recognitionResponse
    .headers
    .getFirst("Operation-Location")

val gson = Gson()

fun waitForTextRecognition() : TextRecognitionOperationResponse {
    while (true) {
        val operationResponseString = Unirest.get(operationLocation)
            .header("Ocp-Apim-Subscription-Key", subscriptionKey)
            .asString()
            .body

        val operationResponse = gson.fromJson(operationResponseString, TextRecognitionOperationResponse::class.java)

        if (operationResponse.status == "Succeeded") {
            return operationResponse
        } else {
            Thread.sleep(1000L)
        }
    }
}

val response = waitForTextRecognition()

val result = response.recognitionResult
