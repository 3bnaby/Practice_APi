package com.example.practice1

import com.example.practice1.Model.Wisdom

class fakeApiService {
    private val wisdomList = listOf<Wisdom>(
        Wisdom("asdfg","1/3150"),
        Wisdom("bmbnbmm","1/6487"),
        Wisdom("dsklgjsignsl","1/964"),
        Wisdom("pojktrmkrnlgnrjlnlr","1/522"),
        Wisdom(",m,xznkzniaoia","1/20")

    )

    fun getRandomWisdom():Wisdom{
        val random = (Math.random() * wisdomList.size).toInt()
        return wisdomList[random]
    }
}