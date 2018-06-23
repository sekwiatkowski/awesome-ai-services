// "input" is a File object pointing to the input image file.

val content = ByteString.copyFrom(input.readBytes())

val image = Image.newBuilder()
    .setContent(content)
    .build()
val feature = Feature.newBuilder()
    .setType(Feature.Type.FACE_DETECTION)
    .build()
val request = AnnotateImageRequest.newBuilder()
    .addFeatures(feature)
    .setImage(image)
    .build()

val requests = listOf(request)

val client = ImageAnnotatorClient.create()
val batchResponse = client.batchAnnotateImages(requests)
val response = batchResponse.responsesList.single()

val results = response.faceAnnotationsList
val result = results.single()
