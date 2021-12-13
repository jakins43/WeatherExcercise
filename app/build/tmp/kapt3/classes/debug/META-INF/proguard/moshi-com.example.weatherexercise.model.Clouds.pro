-if class com.example.weatherexercise.model.Clouds
-keepnames class com.example.weatherexercise.model.Clouds
-if class com.example.weatherexercise.model.Clouds
-keep class com.example.weatherexercise.model.CloudsJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
