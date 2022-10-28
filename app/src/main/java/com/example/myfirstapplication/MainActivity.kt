package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mayor_de_edad()
        t_asc()
        t_desc()
        propiedades_vehiculo()
        list_estud()
        cedula()
        iva()
    }

    //Verificacion de edad
    fun mayor_de_edad(){
        val edad = 19
        if(edad>=18){
            println("Usted es mayor de edad")
        }else{
            println("Usted es menor de edad")
        }
    }
    //Tabla de multiplicar ascendente
    fun t_asc(){
        val n = 5
        println("Multiplos de "+n+"de manera ascendente")
        for(x in 0..15){
            println(n*x)
        }
    }
    //tabla de multiplicar descendente
    fun t_desc() {
        val n = 5
        println("Multiplos de "+n+"de manera descendente")
        for (x in 15 downTo 0) {
            println(n * x)
        }
    }

    //Lista de estudiantes
    fun list_estud(){
        val estudiantes = listOf("Pablo Montaño", "Isaias Silva", "Anthonny Espinosa", "Carlos Castillo","Diego Leiva")

        val por_grupos = mutableMapOf("Pablo Montaño" to 1, "Isaias Silva" to 2, "Anthonny Espinosa" to 1, "Carlos Castillo" to 3, "Diego Leiva" to 2)

        val ordenar = estudiantes.sorted()
        for (x in ordenar){
            println(x)
        }
        val ordenar_grupos = por_grupos.toSortedMap()
        println("Resultados Ordenados")
        for (x in ordenar_grupos){
            println("${x.key} - ${x.value}")
        }
    }
    //Caracteristicas de los vehiculos

    fun propiedades_vehiculo(){
        val camion = vehiculos(arrayOf(vehiculos.trac.delantera), motor = "diesel", tipo = "motorizado", capacidad = "2 personas")
        camion.vehiculo()
        val camioneta = vehiculos(arrayOf(vehiculos.trac.delantera), motor = "hibrido", tipo = "hibrido", capacidad = "4 personas")
        camioneta.vehiculo()
        println(camion.motor)
        println(camion.tipo)
        println(camion.capacidad)
    }

    //Validación de Cédula

    fun cedula(){
        val cedula= arrayListOf<Int>(1,1,0,4,4,6,5,1,5,6)
        var suma = 0
        var cont=0
        var nFinal=cedula.last()
        for(x in cedula.indices){
            cont=cedula[x]
            if(x%2==0){
                cont=(cedula[x]*2)
                if (cont>9){
                    cont = cont-9
                }
                suma = suma+cont
            }else{
                suma= suma+cont
            }
        }
        suma = suma-nFinal
        val primerNumero = suma.toString().substring(0,1)
        val decena = (primerNumero.toInt()+1)*10
        if (decena-suma==nFinal||decena-suma==10){
            println("La cedula"+cedula+" si es valida.")
        }else{
            println("La cedula"+cedula+" no es valida.")
        }
    }

    //Calcular el iva
    fun iva(){
        val precio = 29.55
        val precio_total = precio*1.12
        println("El precio del producto es: "+precio)
        println("El precio del producto más iva es: "+precio_total)
    }

}