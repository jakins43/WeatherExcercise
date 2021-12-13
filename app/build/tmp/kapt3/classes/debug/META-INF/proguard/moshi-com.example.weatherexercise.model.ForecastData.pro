-if class com.example.weatherexercise.model.ForecastData
-keepnames class com.example.weatherexercise.model.ForecastData
-if class com.example.weatherexercise.model.ForecastData
-keep class com.example.weatherexercise.model.ForecastDataJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
