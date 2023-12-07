package gestaoCursos

data class Cursos (val codigo: Int, val nome: String)

val cursos : MutableList<Cursos> = mutableListOf(Cursos(123, "Kotlin"),
    Cursos(234, "Java"),
    Cursos(345, "Java Script"))

val listCursos : List<Cursos> = cursos
