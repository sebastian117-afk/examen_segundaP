package com.example.examen_segundap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examen_segundap.databinding.ActivityAgendaBinding
import com.example.examen_segundap.databinding.ActivityMainBinding

class Agenda : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendaBinding.inflate(layoutInflater)
        setContentView(binding.root)

    val parExtra = intent.extras
        val nombre = parExtra?.getString("nombre")
        binding.textView4.text = nombre.toString()



        binding.button3.setOnClickListener(){
            val intent3 = Intent(this, MainActivity::class.java)
            startActivity(intent3)
        }

    }
}