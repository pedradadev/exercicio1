package com.example.weightconversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weightconversor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calcular.setOnClickListener{ convertKilosToPounds() }
    }

    fun convertKilosToPounds() {
        val stringInTextField = binding.costOfService.text.toString()
        var valor = stringInTextField.toDouble()
        val selectedId = binding.tipOptions.checkedRadioButtonId
        if (selectedId == R.id.KgParaLibra) {
            valor = valor * 2.2
            var resultadoString = String.format("Resultado:", valor)
            binding.result.text = resultadoString
        } else {
            valor = valor * 0.45
            var resultado = String.format("Resultado:", valor)
            binding.result.text = resultado
        }

    }

}