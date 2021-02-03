package com.qbo.appfundamentoskotlin.entidades

import com.qbo.appfundamentoskotlin.interfaces.Movimientos

open class Persona : Movimientos {
    lateinit var nomPersona: String
    /*init {
        nomPersona  = "Luis Angel"
    }*/
    fun mostrarDocumento() : String{
        return "Documento de identidad"
    }

    override fun movimientoCircular(valor: Double) {
        TODO("Not yet implemented")
    }

    override fun movimientoSismico(Longitud: Double) {
        TODO("Not yet implemented")
    }
}