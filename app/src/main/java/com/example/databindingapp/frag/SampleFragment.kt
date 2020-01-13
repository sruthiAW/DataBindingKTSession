package com.example.databindingapp.frag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.databindingapp.R
import com.example.databindingapp.databinding.SampleFragmentLayoutBinding

class SampleFragment : Fragment() {

    private lateinit var viewModel: SampleFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

//        val dataBinding = SampleFragmentLayoutBinding.inflate(layoutInflater)

//        val dataBinding = SampleFragmentLayoutBinding.inflate(inflater, container, false)

//        val viewRoot = inflater.inflate(R.layout.sample_fragment_layout, container, false)
//        val binding: SampleFragmentLayoutBinding = SampleFragmentLayoutBinding.bind(viewRoot)


        //Generic base type. Say we have a base class
//        val viewRoot = inflater.inflate(R.layout.sample_fragment_layout, container, false)
//        val dataBinding: ViewDataBinding? = DataBindingUtil.bind(viewRoot)

        val dataBinding: SampleFragmentLayoutBinding = DataBindingUtil.inflate(inflater, R.layout.sample_fragment_layout, container, false)

        //set value to variable in xml
        dataBinding.viewModel = viewModel


        return dataBinding.root
    }

    private fun setUpViewModel() {
        viewModel = ViewModelProviders.of(this).get(SampleFragmentViewModel::class.java)
    }

}