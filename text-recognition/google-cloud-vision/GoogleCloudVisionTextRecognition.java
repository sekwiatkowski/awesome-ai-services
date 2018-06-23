// "input" is a string holding the path to the image.

Path path = Paths.get(input);
byte[] bytes = Files.readAllBytes(path);
ByteString content = ByteString.copyFrom(bytes);

Image image = Image.newBuilder()
    .setContent(content)
    .build();
Feature feature = Feature.newBuilder()
    .setType(Feature.Type.TEXT_DETECTION)
    .build();
AnnotateImageRequest request = AnnotateImageRequest.newBuilder()
    .addFeatures(feature)
    .setImage(image)
    .build();

List<AnnotateImageRequest> requests = new ArrayList<>();
requests.add(request);

try (ImageAnnotatorClient client = ImageAnnotatorClient.create()) {
    BatchAnnotateImagesResponse batchResponse = client.batchAnnotateImages(requests);
    AnnotateImageResponse response = batchResponse.getResponsesList().get(0);

    List<EntityAnnotation> textAnnotationsList = response.getTextAnnotationsList();
    TextAnnotation fullTextAnnotation = response.getFullTextAnnotation();
}
