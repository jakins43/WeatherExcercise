-if class com.example.weatherexercise.model.Weather
-keepnames class com.example.weatherexercise.model.Weather
-if class com.example.weatherexercise.model.Weather
-keep class com.example.weatherexercise.model.WeatherJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
