package com.example.practice1

import com.example.practice1.Model.User

class fakeDatabase {

    fun getCurrentUser(): User {
        return User("Mahmoud",2010)
    }
}