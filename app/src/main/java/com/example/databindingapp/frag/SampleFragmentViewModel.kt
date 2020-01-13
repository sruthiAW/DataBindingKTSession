package com.example.databindingapp.frag

import android.view.View
import androidx.databinding.Bindable
import androidx.databinding.ObservableBoolean
import com.example.databindingapp.BR
import com.example.databindingapp.R
import com.example.databindingapp.utils.ObservableViewModel
import kotlinx.coroutines.*

class SampleFragmentViewModel: ObservableViewModel() {

    private val job = Job()
    private val scope = CoroutineScope(Dispatchers.Main + job)

    private var isLoading = false
    val loadingObservableField = ObservableBoolean()

    private var username = "Old user"

    fun getTextAsString(): String {
        return "Hello world string"
    }

    fun getTextAsResourceId(): Int {
        return R.string.sample_string
    }

    fun getIncludedLayoutText(): String {
        return "Included layout"
    }

    @Bindable
    fun getIsLoading(): Boolean {
        return isLoading
    }

    private fun setIsLoading(value: Boolean) {
        isLoading = value
        notifyPropertyChanged(BR.isLoading)
    }

    @Bindable("isLoading")
    fun getLoadingText(): String {
        return if (isLoading) {
            "Loading"
        } else {
            "Not loading"
        }
    }

    //used with lambda expressions
    fun onButtonClick() {
        scope.launch {
            setIsLoading(true)
            loadingObservableField.set(true)
            delay(3000)
            setIsLoading(false)
            loadingObservableField.set(false)
        }
    }

    //method with same signature
    fun onButtonClickCorrectSyntax(view: View?) {
        scope.launch {
            setIsLoading(true)
            loadingObservableField.set(true)
            delay(3000)
            setIsLoading(false)
            loadingObservableField.set(false)
        }
    }

}