// "input" can be a File or InputStream object.

IamOptions iamOptions = new IamOptions.Builder()
    .apiKey(apiKey)
    .build();

VisualRecognition client = new VisualRecognition("2018-03-16", iamOptions);

DetectFacesOptions detectFacesOptions = new DetectFacesOptions.Builder()
    .imagesFile(input)
    .build();

DetectedFaces result = client
    .detectFaces(detectFacesOptions)
    .execute();
