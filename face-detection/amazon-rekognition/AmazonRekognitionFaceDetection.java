// "input" is a string holding the path to the image.

Path path = Paths.get(input);
byte[] bytes = Files.readAllBytes(path);
ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

AmazonRekognition client = AmazonRekognitionClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build();

Image image = new Image()
    .withBytes(byteBuffer);

DetectFacesRequest request = new DetectFacesRequest()
    .withImage(image)
    .withAttributes(FaceAttributes.ALL.toString());

DetectFacesResult result = client.detectFaces(request);

List<FaceDetail> faceDetails = result.getFaceDetails();
