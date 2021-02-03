package com.qbo.appfundamentoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var titulo = "QBO Institute"
    val subtitulo = "Kotlin Expert for Android"
    var edad : Int = 31
    var precio: Double = 4.6
    var dato : Char = '1'


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Comentario en bloque
        */
        //Definición de variables.
        val nombre = "Luis Angel"
        val anioNac = 1989
        val anioAct = 2021
        // + - * /
        val arrayNumeros : IntArray = intArrayOf(23, 45,7, 10)
        val arrayList = ArrayList<String>()
        arrayList.add("Colombia")
        arrayList.add("España")
        arrayList.add("México")
        arrayList.add("Francia")
        arrayList.add("Guatemala")
        /*for(pais in arrayList){
          enviarMensajeConsola("País: $pais")
        }*/
        //enviarMensajeConsola(longitudDeNombre("Gabriel"))
        //obtenerLongitudApellido("Salvatierra", "Aquino")
        //bucleFor()
        //bucleWhile()
        busquedaOrdenamiento()
    }
    fun busquedaOrdenamiento(){
        for(i in 1..4){
            for (j in 1..4){
                if(i == 2 && j == 2){
                    enviarMensajeConsola("Ambas variables son IGUALES")
                    break
                }else{
                    enviarMensajeConsola("valor i = ${i.toString()}- j ${j.toString()}")
                }
            }
        }
    }
    private fun bucleFor(){
        val edades = intArrayOf(24,25,30,34,60,79)
        for((indice, valor) in edades.withIndex()){
            enviarMensajeConsola("Indice: $indice edad: ${valor.toString()}")
        }
        for(i in 5..16) enviarMensajeConsola("Número ${i.toString()}")
    }
    private fun bucleWhile() {
        var indice = 10
        /*while(indice > 0){
            enviarMensajeConsola(indice.toString())
            indice--
        }*/
        do {
            enviarMensajeConsola(indice.toString())
            indice--
        }while (indice > 0 )
    }


    private fun enviarMensajeUsuario(mensaje: String){
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
    }
    private fun enviarMensajeConsola(mensaje: String){
        Log.i("RESULTADO", mensaje)
    }

    private fun obtenerLongitudApellido(apellido1: String, apellido2: String){
        var apellidolargo = if(apellido1.length > apellido2.length){
            apellido1
        }else if(apellido2.length > apellido1.length){
            apellido2
        }else{
            "Ambos apellidos tiene la misma longitud"
        }
        enviarMensajeConsola("El apellido más extenso es: $apellidolargo")
    }
    fun longitudDeNombre(nombre: String): String{
        return when(nombre.length){
            0 -> "Nombre vacio"
            in 1..4 -> "Nombre pequeño"
            in 5..7 -> "Nombre es mediano"
            else -> "Nombre extenso"
        }
    }


}