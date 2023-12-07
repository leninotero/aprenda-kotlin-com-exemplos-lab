package gestaoUsuarios

data class Alunos(val nome: String, val idade: Int, val sexo: Char)

val estudantes : MutableList<Alunos> = mutableListOf( Alunos("Lenin Abadie", 34, 'M'),
    Alunos("Ana Alice", 22, 'F'),
    Alunos("Carlos Magno", 19, 'M')
)

val listAlunos : List<Alunos> = estudantes