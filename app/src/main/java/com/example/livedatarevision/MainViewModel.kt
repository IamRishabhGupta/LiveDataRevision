package com.example.livedatarevision

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val factsLiveData=MutableLiveData<String>("This is a fact")



    fun updateLiveData()
    {
        factsLiveData.value="Hello Ji, Ki haal Chaal?"
    }
}