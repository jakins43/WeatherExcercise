package com.example.weatherexercise.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.weatherexercise.R
import com.example.weatherexercise.databinding.FragmentForecastBinding
import com.example.weatherexercise.databinding.FragmentForecastDetailBinding
import com.example.weatherexercise.model.ForecastDetails
import com.example.weatherexercise.model.Weather

class ForecastDetailFragment : Fragment() {
    private var _binding: FragmentForecastDetailBinding? = null
    private val binding get() = _binding!!
    private val args: ForecastDetailFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentForecastDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }


    private fun initViews() = with(binding) {
        if (args.fDetail.weather != null) {
            var weather: Weather = args.fDetail.weather!![0]

            feelsLikeTextView.text = getString(R.string.feels_like)
                .format(args.fDetail.main?.feelsLike?.toInt().toString())
            tempTextView.text =
                getString(R.string.temp_degrees).format(args.fDetail.main?.temp?.toInt().toString())
            weatherDescTextView.text = weather.description.toString()
            weatherTextView.text = weather.main.toString()
        }

    }

    companion object {
        private val TAG = ForecastDetailFragment::class.java.name

    }


}