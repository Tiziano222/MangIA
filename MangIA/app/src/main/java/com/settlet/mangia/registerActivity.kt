package com.settlet.mangia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.settlet.mangia.databinding.ActivityLoginBinding
import com.settlet.mangia.databinding.ActivityRegisterBinding

class registerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnContinueR.setOnClickListener(CheckValue())
    }
    fun CheckValue(){
    }
}