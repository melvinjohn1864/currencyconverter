package com.example.mmconverter.login

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginServiceManager {

    //Object declaration inside a class can be done using a companion keyword
    companion object {
        fun getServiceManager(): LoginServiceManager = LoginServiceManager()
    }

    private lateinit var auth: FirebaseAuth

    fun loginUser(username: String,password: String){
        auth = Firebase.auth
        auth.createUserWithEmailAndPassword(username, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {

                } else {

                }
            }
    }
}