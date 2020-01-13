package com.example.databindingapp.otherfrag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.databindingapp.databinding.SampleAdapterLayoutBinding
import com.example.databindingapp.models.GREEN
import com.example.databindingapp.models.ItemModel
import com.example.databindingapp.models.ORANGE

class OtherFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val dataBinding = SampleAdapterLayoutBinding.inflate(layoutInflater)
        dataBinding.item = ItemModel(ORANGE, GREEN)
        return dataBinding.root
    }

}