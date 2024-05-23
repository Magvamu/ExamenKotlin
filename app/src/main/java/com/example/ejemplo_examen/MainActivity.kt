package com.example.ejemplo_examen

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejemplo_examen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        }


    //Aplica la fórmula: IMC = peso (kg) / (estatura (m))^2.
            // IMC = peso/(altura cm)^2

    // Esta función calcula el Índice de Masa Corporal (IMC)
    fun calcularIMC(peso: Double, altura: Double): Double {
        // Calculamos el IMC usando la fórmula: peso / (altura * altura)
        val imc = peso / (altura * altura)
        // Devolvemos el resultado del IMC
        return imc
    }

    // Esta función clasifica el IMC según los rangos estándar
    fun clasificacionIMC(imc: Double): String {
        // Usamos una declaración condicional para determinar la clasificación del IMC
        return if (imc < 18.5) {
            "Bajo peso" // Si el IMC es menor que 18.5, la clasificación es "Bajo peso"
        } else if (imc < 24.9) {
            "Normal" // Si el IMC es menor que 24.9 pero no menor que 18.5, la clasificación es "Normal"
        } else if (imc < 29.9) {
            "Sobrepeso" // Si el IMC es menor que 29.9 pero no menor que 24.9, la clasificación es "Sobrepeso"
        } else {
            "Obesidad" // Si el IMC es 29.9 o mayor, la clasificación es "Obesidad"
        }
    }

    // Esta es la función principal donde ejecutamos  el código
    fun main() {
        // Definimos el peso en kilogramos
        val peso = 70.0 // Puedes cambiar este valor para probar con otros pesos

        // Definimos la altura en metros
        val altura = 1.75 // Puedes cambiar este valor para probar con otras alturas

        // Llamamos a la función calcularIMC para obtener el IMC
        val imc = calcularIMC(peso, altura)

        // Llamamos a la función clasificacionIMC para obtener la clasificación del IMC
        val clasificacion = clasificacionIMC(imc)

        // Mostramos el resultado del IMC con dos decimales
        println("IMC: %.2f".format(imc))

        // Mostramos la clasificación del IMC
        println("Clasificación: $clasificacion")
    }


    override fun onClick(v: View?) {
        TODO("Not yet implemented")
        when(v){
            binding.btnCalcular ->{
                if (binding.estaturatx.text.toString().isNotEmpty()) {
                    Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}

