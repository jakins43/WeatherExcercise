-if class com.example.weatherexercise.model.ForecastDetails
-keepnames class com.example.weatherexercise.model.ForecastDetails
-if class com.example.weatherexercise.model.ForecastDetails
-keep class com.example.weatherexercise.model.ForecastDetailsJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
