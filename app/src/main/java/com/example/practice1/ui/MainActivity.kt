package com.example.practice1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.practice1.R
import com.example.practice1.databinding.ActivityMainBinding
import com.example.practice1.viewModels.MainViewModel

class MainActivity : AppCompatActivity(){

    lateinit var binding: ActivityMainBinding
    private val viewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main )
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        setup()
        }

    private fun setup(){
        viewModel.getUserInfo()
        binding.click.setOnClickListener {
            viewModel.getAWisdom()
        }

        viewModel.currentUser.observe(this) {
            binding.textUserName.text = it.userName
        }

        viewModel.wisdom.observe(this){
            binding.apply {
                textDate.text = it.publishDate
                textContent.text = it.content
            }
        }
    }

}

