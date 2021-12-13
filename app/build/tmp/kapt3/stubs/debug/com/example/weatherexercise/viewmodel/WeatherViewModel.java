package com.example.weatherexercise.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/example/weatherexercise/viewmodel/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_weatherState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/weatherexercise/util/ApiState;", "Lcom/example/weatherexercise/model/ForecastData;", "shouldNavigate", "", "getShouldNavigate", "()Z", "setShouldNavigate", "(Z)V", "weatherState", "Landroidx/lifecycle/LiveData;", "getWeatherState", "()Landroidx/lifecycle/LiveData;", "makeForecastFetch", "", "city", "", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.weatherexercise.util.ApiState<com.example.weatherexercise.model.ForecastData>> _weatherState = null;
    private boolean shouldNavigate = true;
    
    public WeatherViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.weatherexercise.util.ApiState<com.example.weatherexercise.model.ForecastData>> getWeatherState() {
        return null;
    }
    
    public final boolean getShouldNavigate() {
        return false;
    }
    
    public final void setShouldNavigate(boolean p0) {
    }
    
    public final void makeForecastFetch(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
    }
}