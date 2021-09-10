package com.example.parcial_i_luis_diaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ejercicioUno()
        ejercicioDos()
        ejercicioTres()
    }
    //Ejercicio if colores
    private fun ejercicioUno(){
        var color = "verde"

        if (color == "negro"){
            println("El color que busca es el negro")
        }else if (color == "marron"){
            println("El color que busca es el marron")
        }else if (color == "rojo"){
            println("El color que busca es el rojo")
        }else if (color == "naranja"){
            println("El color que busca es el naranja")
        }else if (color == "amarillo"){
            println("El color que busca es el amarillo")
        }else if (color == "verde"){
            println("El color que busca es el verde")
        }else{
            println("El color $color no se ha podido encontrar...")
        }
    }

    private fun ejercicioDos(){
        val tipodeComida = "Pupusas"

        when(tipodeComida){
            "Pupusas" ->{
                println("Las $tipodeComida son originarias de El Salvador")
            } "Hamburguesas" -> {
            println("Las $tipodeComida son originarias de Estados Unidos")
        } "Sushi" ->{
            println("El $tipodeComida es originario de Japon")
        } "Pizzas" ->{
            println("la $tipodeComida es originaria de Italia")
        } "Gazpacho" ->{
            println("El $tipodeComida es originario de España")
        }
        }
    }

    private fun ejercicioTres(){
        var arreglo = intArrayOf(1,2,3,4,5,6,7,8,9)

        //De uno en uno del 1 al 9
        for (i in arreglo){
            println(i)
        }

        //De 10 a 1
        for (arreglo2 in 10 downTo 1){
            println(arreglo2)
        }

        //De 2 en 2 del 0 al 20
        for (arreglo3 in 0..20 step 2){
            println(arreglo3)
        }
    }
}