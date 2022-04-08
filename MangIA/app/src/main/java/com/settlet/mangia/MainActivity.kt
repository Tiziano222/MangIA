package com.settlet.mangia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.settlet.mangia.databinding.ActivityMainBinding
import com.settlet.mangia.databinding.ActivityRegisterBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}