package com.example.practice1.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practice1.Model.User
import com.example.practice1.Model.Wisdom
import com.example.practice1.Repository.MainRepository

class MainViewModel:ViewModel(){
    private val repository = MainRepository()
    val currentUser = MutableLiveData<User>()
    val wisdom = MutableLiveData<Wisdom>()

    fun getUserInfo(){
         currentUser.postValue(repository.getCurrentUser())
    }
    fun getAWisdom(){
        wisdom.postValue(repository.getRandomWisdom())
    }


}