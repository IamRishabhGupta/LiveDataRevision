package com.example.livedatarevision

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.livedatarevision.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {

        binding=ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.factsLiveData.observe(this, Observer {

            binding.textView.text=it
        })

        binding.button.setOnClickListener {

            mainViewModel.updateLiveData()
        }


    }
}