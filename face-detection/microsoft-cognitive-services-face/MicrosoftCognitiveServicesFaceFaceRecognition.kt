// input is a File object pointing to the input image file.

data class Accessory(val type: String, val confidence: Float)

data class Blur (val blurLevel: String, val value: Float)

data class Emotion(
    val anger : Short,
    val contempt : Short,
    val disgust : Short,
    val fear : Short,
    val happiness : Short,
    val neutral : Short,
    val sadness : Short,
    val surprise : Short)

data class Exposure(
    val exposureLevel: String,
    val value: Float)

data class FacialHair(
    val moustache: Short,
    val beard: Short,
    val sideburns: Short)

data class Hair(
    val bald: Float,
    val invisible: Boolean,
    val hairColor: List<HairColor>)

data class HairColor(
    val color: String,
    val confidence: Float)

data class HeadPose(
    val pitch: Float,
    val roll: Float,
    val yaw: Float)

data class Makeup(
    val eyeMakekup: Boolean,
    val lipMakeup: Boolean)

data class Noise(
    val noiseLevel: String,
    val value: Float)

data class Occlusion(
    val foreheadOccluded: Boolean,
    val eyeOccluded: Boolean,
    val mouthOccluded: Boolean)

data class Rectangle(
    val top: Int,
    val left: Int,
    val width: Int,
    val height: Int)

data class FaceAttributes(
    val accessories: List<Accessory>?,
    val age: Short?,
    val blur: Blur?,
    val emotion: Emotion?,
    val exposure: Exposure?,
    val facialHair: FacialHair?,
    val gender: String?,
    val glasses: String?,
    val hair: Hair?,
    val headPose: HeadPose?,
    val makeup: Makeup?,
    val noise: Noise?,
    val occlusion: Occlusion?,
    val smile: Short?)

data class FaceRecognition(
    val faceId: UUID,
    val faceRectangle: Rectangle,
    val faceAttributes: FaceAttributes)

class FaceRecognitions : ArrayList<FaceRecognition>()

val host = "https://westcentralus.api.cognitive.microsoft.com"
val endpoint = "/face/v1.0/detect"
val base = host + endpoint

val faceAttributes = "age,gender,headPose,smile,facialHair,glasses,emotion,hair,makeup,occlusion,accessories,blur,exposure,noise"

val url = URIBuilder(base)
    .setParameter("returnFaceId", "true")
    .setParameter("returnFaceLandmarks", "false")
    .setParameter("returnFaceAttributes", faceAttributes)
    .toString()

val bytes = input.readBytes()

val json = Unirest.post(url)
    .header("Content-Type", "application/octet-stream")
    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
    .body(bytes)
    .asString()
    .getBody()

val gson = Gson()
val faceRecognitions = gson.fromJson(json, FaceRecognitions::class.java)
