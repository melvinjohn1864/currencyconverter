package com.example.mmconverter.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.example.mmconverter.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val loginViewModel: LoginViewModel by viewModels()

        binding.btnLogin.setOnClickListener {
            loginViewModel.checkLoginCredentials(binding.etUsername.toString(),binding.etPassword.toString())
        }
    }
}
