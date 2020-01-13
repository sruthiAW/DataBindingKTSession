package com.example.databindingapp.utils

import android.graphics.drawable.ColorDrawable
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import com.example.databindingapp.models.BLUE
import com.example.databindingapp.models.GREEN
import com.example.databindingapp.models.RED

@BindingAdapter(value = ["bind:type", "bind:color"])  /* requireAll = false*/
fun setSettingsDescriptionImageVisibility(textView: TextView, type: String, color: Int) {
    textView.text = when(color){
        RED -> "Red $type"
        GREEN -> "Green $type"
        BLUE -> "Blue $type"
        else -> "Unknown"
    }
}


@BindingConversion
fun convertColorToDrawable(color: Int) = ColorDrawable(color)
