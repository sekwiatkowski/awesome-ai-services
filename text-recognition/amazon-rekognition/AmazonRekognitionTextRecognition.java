// "image" is a string holding the path tto the image file.

Path path = Paths.get(input);
byte[] data = Files.readAllBytes(path);
ByteBuffer bytes = ByteBuffer.wrap(data);

AmazonRekognition client = AmazonRekognitionClientBuilder
    .standard()
    .withCredentials(credentialsProvider)
    .withRegion(Regions.US_EAST_1)
    .build();

Image image = new Image().withBytes(bytes);

DetectTextRequest request = new DetectTextRequest()
    .withImage(image);

DetectTextResult result = client.detectText(request);

List<TextDetection> textDetections = result.getTextDetections();
