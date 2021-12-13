package com.example.weatherexercise.repo.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/example/weatherexercise/repo/remote/WeatherRepo;", "", "()V", "TAG", "", "weatherService", "Lcom/example/weatherexercise/repo/remote/WeatherService;", "getWeatherService", "()Lcom/example/weatherexercise/repo/remote/WeatherService;", "weatherService$delegate", "Lkotlin/Lazy;", "getWeatherState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/weatherexercise/util/ApiState;", "Lcom/example/weatherexercise/model/ForecastData;", "city", "app_debug"})
public final class WeatherRepo {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.weatherexercise.repo.remote.WeatherRepo INSTANCE = null;
    private static final java.lang.String TAG = "WeatherRepo";
    private static final kotlin.Lazy weatherService$delegate = null;
    
    private WeatherRepo() {
        super();
    }
    
    private final com.example.weatherexercise.repo.remote.WeatherService getWeatherService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.weatherexercise.util.ApiState<com.example.weatherexercise.model.ForecastData>> getWeatherState(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
        return null;
    }
}