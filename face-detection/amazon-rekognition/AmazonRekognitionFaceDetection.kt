// "file" is a File object pointing to the input image file.

val bytes = ByteBuffer.wrap(file.readBytes())

val client = AmazonRekognitionClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build()

val image = Image().withBytes(bytes)

val request = DetectFacesRequest()
    .withImage(image)
    .withAttributes(FaceAttributes.ALL.toString())

val result = client.detectFaces(request)

val faceDetails = result.faceDetails
