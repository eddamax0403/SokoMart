package com.eddy.sokomart.repository

import com.eddy.sokomart.data.UserDao
import com.eddy.sokomart.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}