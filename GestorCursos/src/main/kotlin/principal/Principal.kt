package principal

import Enums.Niveis
import gestaoCursos.ConteudoEducacional
import gestaoCursos.Formacao
import gestaoCursos.listCursos
import gestaoUsuarios.listAlunos
import view.mostrarMenu
import java.util.Scanner

fun main (){
    val  input = Scanner(System.`in`)
    var resp : String
    var op: Int
    val conteudos1 : MutableList<ConteudoEducacional> = mutableListOf( ConteudoEducacional("Java avançado", 60),
                        ConteudoEducacional("Kotlin Avançado", 80 ),
                        ConteudoEducacional("Java Script Avançado", 60 ))
    val formar1 = Formacao("Bootcamp Java", conteudos1.get(0), nivel =Niveis.BASICO)

    do{
        mostrarMenu()
        var op = input.nextInt()
        when(op){
            1 -> listCursos.forEach(){
                    i -> println("${i}")
                }
            2-> listAlunos.forEach(){
                    i -> println("${i}")
                }
            3 -> formar1.matricular(listAlunos.get(0),  listCursos.get(0))
            4 -> println(formar1.toString())
        }
        println("\nDeseja Continuar?: ")
        resp = input.next()
    } while (resp.equals("Sim"))
}
