package com.example.mytrip

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mapeamento dos elementos da minnha tela
        val txt_Distancia = findViewById<EditText>(R.id.txt_Distancia)
        val txt_preco = findViewById<EditText>(R.id.txt_preco)
        val txt_autonomia = findViewById<EditText>(R.id.txt_autonomia)
        val txt_Resultado = findViewById<TextView>(R.id.txt_Resultado)
        val btn_Calcular = findViewById<Button>(R.id.btn_Calcular)

        // Função para escutar o evento de click no button


    }

    fun btnCalcular(view: View) {

    }
}