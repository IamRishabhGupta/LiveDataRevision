package com.example.livedatarevision

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
   private val factsLiveDataObject=MutableLiveData<String>("This is a fact")
    val factsLiveData:LiveData<String>
        get()=factsLiveDataObject




    fun updateLiveData()
    {
        factsLiveDataObject .value="Hello Ji, Ki haal Chaal?"
    }
}