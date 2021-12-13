package com.example.weatherexercise.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u00c6\u0003J\u008c\u0001\u00103\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0002\u00104J\t\u00105\u001a\u000206H\u00d6\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u00d6\u0003J\t\u0010;\u001a\u000206H\u00d6\u0001J\t\u0010<\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u000206H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b$\u0010\u0019R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u0006B"}, d2 = {"Lcom/example/weatherexercise/model/ForecastDetails;", "Landroid/os/Parcelable;", "clouds", "Lcom/example/weatherexercise/model/Clouds;", "dt", "", "dtTxt", "", "main", "Lcom/example/weatherexercise/model/Main;", "pop", "rain", "Lcom/example/weatherexercise/model/Rain;", "sys", "Lcom/example/weatherexercise/model/Sys;", "visibility", "weather", "", "Lcom/example/weatherexercise/model/Weather;", "wind", "Lcom/example/weatherexercise/model/Wind;", "(Lcom/example/weatherexercise/model/Clouds;Ljava/lang/Double;Ljava/lang/String;Lcom/example/weatherexercise/model/Main;Ljava/lang/Double;Lcom/example/weatherexercise/model/Rain;Lcom/example/weatherexercise/model/Sys;Ljava/lang/Double;Ljava/util/List;Lcom/example/weatherexercise/model/Wind;)V", "getClouds", "()Lcom/example/weatherexercise/model/Clouds;", "getDt", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDtTxt", "()Ljava/lang/String;", "getMain", "()Lcom/example/weatherexercise/model/Main;", "getPop", "getRain", "()Lcom/example/weatherexercise/model/Rain;", "getSys", "()Lcom/example/weatherexercise/model/Sys;", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/example/weatherexercise/model/Wind;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/example/weatherexercise/model/Clouds;Ljava/lang/Double;Ljava/lang/String;Lcom/example/weatherexercise/model/Main;Ljava/lang/Double;Lcom/example/weatherexercise/model/Rain;Lcom/example/weatherexercise/model/Sys;Ljava/lang/Double;Ljava/util/List;Lcom/example/weatherexercise/model/Wind;)Lcom/example/weatherexercise/model/ForecastDetails;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ForecastDetails implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final com.example.weatherexercise.model.Clouds clouds = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double dt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dtTxt = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.weatherexercise.model.Main main = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double pop = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.weatherexercise.model.Rain rain = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.weatherexercise.model.Sys sys = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double visibility = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.weatherexercise.model.Weather> weather = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.weatherexercise.model.Wind wind = null;
    public static final android.os.Parcelable.Creator<com.example.weatherexercise.model.ForecastDetails> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherexercise.model.ForecastDetails copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clouds")
    com.example.weatherexercise.model.Clouds clouds, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt")
    java.lang.Double dt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt_txt")
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "main")
    com.example.weatherexercise.model.Main main, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pop")
    java.lang.Double pop, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "rain")
    com.example.weatherexercise.model.Rain rain, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sys")
    com.example.weatherexercise.model.Sys sys, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "visibility")
    java.lang.Double visibility, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.example.weatherexercise.model.Weather> weather, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wind")
    com.example.weatherexercise.model.Wind wind) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ForecastDetails(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clouds")
    com.example.weatherexercise.model.Clouds clouds, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt")
    java.lang.Double dt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt_txt")
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "main")
    com.example.weatherexercise.model.Main main, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pop")
    java.lang.Double pop, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "rain")
    com.example.weatherexercise.model.Rain rain, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sys")
    com.example.weatherexercise.model.Sys sys, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "visibility")
    java.lang.Double visibility, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.example.weatherexercise.model.Weather> weather, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wind")
    com.example.weatherexercise.model.Wind wind) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherexercise.model.Clouds component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherexercise.model.Clouds getClouds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDtTxt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherexercise.model.Main component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherexercise.model.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPop() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherexercise.model.Rain component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherexercise.model.Rain getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherexercise.model.Sys component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherexercise.model.Sys getSys() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.weatherexercise.model.Weather> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.weatherexercise.model.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherexercise.model.Wind component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.weatherexercise.model.Wind getWind() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.weatherexercise.model.ForecastDetails> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.weatherexercise.model.ForecastDetails createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.weatherexercise.model.ForecastDetails[] newArray(int size) {
            return null;
        }
    }
}