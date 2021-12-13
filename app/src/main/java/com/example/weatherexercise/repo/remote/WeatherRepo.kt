package com.example.weatherexercise.repo.remote

import android.util.Log
import com.example.weatherexercise.util.ApiState
import kotlinx.coroutines.flow.flow

object WeatherRepo {

    private const val TAG = "WeatherRepo"

    private val weatherService by lazy { RetrofitInstance.weatherService }

    fun getWeatherState(
        city: String
    ) = flow {
        emit(ApiState.Loading)

        val state =
            try {
                val weatherResponse = weatherService.getForecastByCity(city)
                if (weatherResponse.isSuccessful) {
                    Log.i(TAG, "weatherResponse response body is : ${weatherResponse.body()} ")
                    ApiState.Success(weatherResponse.body()!!)
                } else {
                    ApiState.Failure("Error fetching data.")
                }
            } catch (ex: Exception) {
                ApiState.Error("Unknown error fetching API")
            }
        emit(state)
    }
}