-if class com.example.weatherexercise.model.Coord
-keepnames class com.example.weatherexercise.model.Coord
-if class com.example.weatherexercise.model.Coord
-keep class com.example.weatherexercise.model.CoordJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
