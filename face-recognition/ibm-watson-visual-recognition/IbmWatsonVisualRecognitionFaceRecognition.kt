// "input" can be a File or an InputStream object representing the input image.

val iamOptions = IamOptions.Builder()
    .apiKey(apiKey)
    .build()

val client = VisualRecognition("2018-03-16", iamOptions)

val detectFacesOptions = DetectFacesOptions.Builder()
    .imagesFile(input)
    .build()

val result = client
    .detectFaces(detectFacesOptions)
    .execute()
