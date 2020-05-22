package com.example.mmconverter.login

import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    fun checkLoginCredentials(username: String, password: String){
        var loginServiceManager = LoginServiceManager.getServiceManager()
        loginServiceManager.loginUser(username,password)
    }
}