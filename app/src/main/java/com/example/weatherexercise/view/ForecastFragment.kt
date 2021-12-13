package com.example.weatherexercise.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources

import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherexercise.R
import com.example.weatherexercise.adapter.ForecastAdapter
import com.example.weatherexercise.databinding.FragmentForecastBinding

class ForecastFragment : Fragment() {

    private var _binding: FragmentForecastBinding? = null
    private val binding: FragmentForecastBinding get() = _binding!!

    private val args: ForecastFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentForecastBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }


    private fun initViews() = with(binding) {
        //setup recycle view
        (requireActivity() as MainActivity).binding.topAppBar.apply {
            navigationIcon =
                AppCompatResources.getDrawable(requireContext(), R.drawable.ic_baseline_arrow_back_24)
            title = args.wData.city?.name
            setNavigationOnClickListener {
                this@ForecastFragment.findNavController().navigateUp()
            }
        }

        rvList.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = ForecastAdapter(args.wData.list ?: emptyList()) {
                val directions =
                    ForecastFragmentDirections.actionForecastFragmentToForecastDetailFragment(it)
                view?.findNavController()?.navigate(directions)
            }
        }
    }

    companion object {
        private val TAG = ForecastFragment::class.java.name

    }
}