// input is a string holding the path to the image file.

public class Rectangle {
    public int top, left, width, height;
}

public class Accessory {
    public String type;
    public float confidence;
}

public class Blur {
    public String blurLevel;
    public float value;
}

public class Emotion {
    public short anger, contempt, disgust, fear, happiness, neutral, sadness, surprise;
}

public class Exposure {
    public String exposureLevel;
    public float value;
}

public class FacialHair {
    public short moustache, beard, sideburns;
}

public class HairColor {
    public String color;
    public float confidence;
}

public class Hair {
    public float bald;
    public boolean invisible;
    public List<HairColor> hairColor;
}

public class HeadPose {
    public float pitch, roll, yaw;
}

public class Makeup {
    public boolean eyeMakekup, lipMakeup;
}

public class Noise {
    public String noiseLevel;
    public Float value;
}

public class Occlusion {
    public boolean foreheadOccluded, eyeOccluded, mouthOccluded;
}

public class FaceAttributes {
    public List<Accessory> accessories;
    public short age;
    public Blur blur;
    public Emotion emotion;
    public Exposure exposure;    
    public FacialHair facialHair;
    public String gender;
    public String glasses;
    public Hair hair;
    public HeadPose headPose;
    public Makeup makeup;
    public Noise noise;
    public Occlusion occlusion;
    public short smile;
}

public class FaceRecognition {
    public UUID faceId;
    public Rectangle faceRectangle;
    public FaceAttributes faceAttributes;
}

public class FaceRecognitions extends ArrayList<FaceRecognition> {}

Path path = Paths.get(input);
byte[] bytes = Files.readAllBytes(path);

String subscriptionKey = Credentials.INSTANCE.getMicrosoftFaceKey();

String host = "https://westcentralus.api.cognitive.microsoft.com";
String endpoint = "/face/v1.0/detect";
String base = host.concat(endpoint);

String faceAttributes =
    "age,gender,headPose,smile,facialHair,glasses,emotion,hair,makeup,occlusion,accessories,blur,exposure,noise";

String url = new URIBuilder(base)
    .setParameter("returnFaceId", "true")
    .setParameter("returnFaceLandmarks", "false")
    .setParameter("returnFaceAttributes", faceAttributes)
    .toString();

String json = Unirest.post(url)
    .header("Content-Type", "application/octet-stream")
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .body(bytes)
    .asString()
    .getBody();

Gson gson = new Gson();

FaceRecognitions faceRecognitions = gson.fromJson(json, FaceRecognitions.class);
