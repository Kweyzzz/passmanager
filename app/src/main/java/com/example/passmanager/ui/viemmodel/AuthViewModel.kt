package com.example.passmanager.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.passmanager.data.database.AppDatabase
import com.example.passmanager.data.model.User
import kotlinx.coroutines.launch

class AuthViewModel(application: Application) : AndroidViewModel(application) {

    private val userDao = AppDatabase.getDatabase(application).userDao()

    fun registerUser(name: String, email: String, password: String, onResult: (Boolean) -> Unit) {
        viewModelScope.launch {
            val existingUser = userDao.getUserByEmail(email)
            if (existingUser == null) {
                val user = User(name = name, email = email, password = password)
                userDao.insertUser(user)
                onResult(true) // Успех
            } else {
                onResult(false) // Пользователь уже существует
            }
        }
    }
}
