// input is a File object pointing to an image file.

val bytes = ByteBuffer.wrap(input.readBytes())

val client = AmazonRekognitionClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build()

val image = Image().withBytes(bytes)

val request = DetectTextRequest()
    .withImage(image)

val result = client.detectText(request)

val textDetections = result.textDetections
