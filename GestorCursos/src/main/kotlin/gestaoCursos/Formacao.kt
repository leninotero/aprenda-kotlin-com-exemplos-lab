package gestaoCursos

import Enums.Niveis
import gestaoUsuarios.Alunos

data class Formacao(val nome: String, var conteudos: ConteudoEducacional, var nivel: Niveis) {

    fun matricular(usuario: Alunos, curso: Cursos) {

        println("Aluno: ${usuario.nome} matriculado com sucesso no curso de ${curso.codigo}")
    }
}