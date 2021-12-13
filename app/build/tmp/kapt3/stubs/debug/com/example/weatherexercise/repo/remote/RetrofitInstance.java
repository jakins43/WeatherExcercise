package com.example.weatherexercise.repo.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/example/weatherexercise/repo/remote/RetrofitInstance;", "", "()V", "BASE_URL", "", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "weatherService", "Lcom/example/weatherexercise/repo/remote/WeatherService;", "getWeatherService", "()Lcom/example/weatherexercise/repo/remote/WeatherService;", "weatherService$delegate", "Lkotlin/Lazy;", "app_debug"})
public final class RetrofitInstance {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weatherexercise.repo.remote.RetrofitInstance INSTANCE = null;
    private static final java.lang.String BASE_URL = "https://api.openweathermap.org";
    private static final com.squareup.moshi.Moshi moshi = null;
    private static final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy weatherService$delegate = null;
    
    private RetrofitInstance() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherexercise.repo.remote.WeatherService getWeatherService() {
        return null;
    }
}