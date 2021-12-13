package com.example.weatherexercise.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.weatherexercise.R
import com.example.weatherexercise.viewmodel.WeatherViewModel
import com.example.weatherexercise.databinding.FragmentCitylookupBinding
import com.example.weatherexercise.util.ApiState
import retrofit2.http.Tag

class CityLookupFragment : Fragment() {
    private var _binding: FragmentCitylookupBinding? = null
    private val binding get() = _binding!!
    private val weatherViewModel by activityViewModels<WeatherViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentCitylookupBinding.inflate(layoutInflater, container, false).also {
        _binding = it

    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupObservers()
        initViews()

    }

    private fun initViews() = with(binding) {
        (requireActivity() as MainActivity).binding.topAppBar.apply {
            title = getString(R.string.app_name)
            navigationIcon = null
        }
        lookUpButton.setOnClickListener {
            weatherViewModel.shouldNavigate = true
            Log.i(TAG, "onCreateView: lookupbutton clicked")

            val cityName = cityNameField.editText?.text.toString()

            if (cityName.isBlank()) {
                Toast.makeText(
                    requireContext(),
                    "You did not enter a city name",
                    Toast.LENGTH_SHORT
                )
                    .show();

            } else weatherViewModel.makeForecastFetch(cityName)

        };

    }

    private fun setupObservers() = with(weatherViewModel) {
        weatherState.observe(viewLifecycleOwner) { state ->
            if (state is ApiState.Success && weatherViewModel.shouldNavigate) {

                val wData = state.data
                weatherViewModel.shouldNavigate = false

                val directions =
                    CityLookupFragmentDirections.actionCityLookupFragmentToForecastFragment(wData)
                findNavController().navigate(directions)
            } else if (state is ApiState.Failure) {
                Toast.makeText(requireContext(), state.errorMsg, Toast.LENGTH_SHORT).show()
            } else if (state is ApiState.Error) {
                Toast.makeText(requireContext(), state.errorMsg, Toast.LENGTH_SHORT).show()
            }
        }
    }


    companion object {
        private val TAG = CityLookupFragment::class.java.name
    }

}

