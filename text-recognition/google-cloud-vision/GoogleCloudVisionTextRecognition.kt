// "input" is a File object pointing to an image file.

val bytes = ByteString.copyFrom(input.readBytes())

val image = Image.newBuilder()
    .setContent(bytes)
    .build()
val feature = Feature.newBuilder()
    .setType(Feature.Type.TEXT_DETECTION)
    .build()
val request = AnnotateImageRequest.newBuilder()
    .addFeatures(feature)
    .setImage(image)
    .build()

val requests = listOf(request)

val client = ImageAnnotatorClient.create()

val response = client.batchAnnotateImages(requests)
val responses = response.responsesList.single()

val textAnnotationsList = responses.textAnnotationsList
val fullTextAnnotation = responses.fullTextAnnotation
