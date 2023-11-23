package com.example.otakuizz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.otakuizz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //declara las variables del bindeo
    //se inicia en null, hasta que se infle (inflate)
    private var _binding : ActivityMainBinding? = null
    //puede ser public porque solo es una variable asignada a un getter
    private val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //en el main activity se le pasa el inflate con un parámetro y no el de 3
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        binding.tvHello.text = getString(R.string.hello_payer)
        setContentView(view)

    }
}