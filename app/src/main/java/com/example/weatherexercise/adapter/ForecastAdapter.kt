package com.example.weatherexercise.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherexercise.R
import com.example.weatherexercise.databinding.ForecastRowItemBinding
import com.example.weatherexercise.model.ForecastDetails
import com.example.weatherexercise.model.Weather


class ForecastAdapter(
    private val dataSet:
    List<ForecastDetails> = listOf(),
    private val listener: (ForecastDetails) -> Unit
) : RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ForecastViewHolder {
        return ForecastViewHolder(
            ForecastRowItemBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup,
                false
            ), listener
        )
    }

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
        holder.updateInfo(dataSet[position])
    }

    override fun getItemCount() = dataSet.size

    inner class ForecastViewHolder(
        private val binding: ForecastRowItemBinding,
        private val listener: (ForecastDetails) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        fun updateInfo(item: ForecastDetails) = with(binding) {
            var weather: Weather? = item.weather?.get(0)

            tempTextview.text = root.context.getString(R.string.rv_temp)
                .format(item.main?.temp?.toInt().toString())
            conditionTextview.text = weather?.main.toString()
            root.setOnClickListener {
                listener.invoke(item)
            }
        }
    }
}