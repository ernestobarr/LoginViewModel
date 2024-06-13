package com.example.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    private val validUsername = "user1"
    private val validPassword = "user1"

    private val _message = MutableLiveData<String>()
    val message: LiveData<String>
        get() = _message

    fun validateCredentials(username: String, password: String) {
        if (username == validUsername && password == validPassword) {
            _message.value = "¡Bienvenido!"
        } else {
            _message.value = "Usuario inválido"
        }
    }
}