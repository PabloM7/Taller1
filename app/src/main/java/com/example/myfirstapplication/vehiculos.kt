package com.example.myfirstapplication

class vehiculos(val traccion: Array<trac>,val motor: String, val tipo: String, val capacidad:String) {
    enum class trac{trasera,delantera}
    fun vehiculo(){
        for(trac in traccion){
            println("Tracción: "+trac)
        }
    }
}