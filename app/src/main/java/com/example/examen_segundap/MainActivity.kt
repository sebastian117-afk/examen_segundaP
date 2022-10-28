package com.example.examen_segundap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.examen_segundap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val agenda = ArrayList<Agendados>()


        binding.button.setOnClickListener(){
        val nombre = binding.edit1.text.toString()
            val noControl = binding.edit2.toString()

            if (nombre=="" || noControl==""){
                Toast.makeText(this,"Ingresa el valor", Toast.LENGTH_SHORT).show()
            } else {
                agenda.add(Agendados("${nombre}","${noControl}"))
                binding.textView2.text ="agendados: ${agenda.count()}"
            }


        }
        binding.button2.setOnClickListener(){
            val indice = binding.editIn.text.toString().toInt()
            val numero = indice -1
            val intento2 = Intent(this, Agenda::class.java)
            intento2.putExtra("nombre","${agenda[numero].nombre}")

            startActivity(intento2)
        }


    }
}