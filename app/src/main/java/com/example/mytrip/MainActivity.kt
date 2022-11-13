package com.example.mytrip

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mapeamento dos elementos da minha tela
        val txt_Distancia = findViewById<EditText>(R.id.txt_Distancia)
        val txt_preco = findViewById<EditText>(R.id.txt_preco)
        val txt_autonomia = findViewById<EditText>(R.id.txt_autonomia)
        val txt_Resultado = findViewById<TextView>(R.id.txt_Resultado)
        val btn_Calcular = findViewById<Button>(R.id.btn_Calcular)


        // Erros para apresentar se caso o usuario nao digitar nada

        /*      if (txt_Distancia.text.isBlank()) {
                   txt_Distancia.error = ("Digite a Distancia! ")
               }

               if (txt_preco.text.isBlank()) {
                   // se o usuario nao digitar nada aparecera esta mensagem de erro
                   txt_preco.error = ("Digite o preço! ")
               }

               if (txt_autonomia.text.isBlank()) {
                   // se o usuario nao digitar nada aparecera esta mensagem de erro
                   txt_autonomia.error = ("Qual a autonomia! ")
               }*/
//android estara escutando o evento de click no botao
        btn_Calcular.setOnClickListener {
            //see o usuario tiver digitado os valores valores pode passar
            if (txt_Distancia.text.isNotBlank() && txt_preco.text.isNotBlank() && txt_autonomia.text.isNotBlank()) {
                //calculo é Distancia*preço/autonomida
                val result = (txt_Distancia.text.toString().toFloat() * txt_preco.text.toString()
                    .toFloat()) / txt_autonomia.text.toString().toFloat()
                // Apresentação do resultado no textView
                txt_Resultado.text = result.toString()
            } else {
                // se o usuario nao preencher nada ira apresentar um popup solicitando as informações
                Toast.makeText(this, "Informe valores validos!", Toast.LENGTH_LONG).show()
            }
        }


    }


}