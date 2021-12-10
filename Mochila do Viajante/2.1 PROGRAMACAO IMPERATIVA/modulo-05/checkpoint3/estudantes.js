let Aluno = require('./aluno')
let curso = require('./curso')

let antonio = new Aluno('Antonio', 8, [10, 10, 10, 10])
let douglas = new Aluno('Douglas', 3, [10, 9, 7, 8])
let taynan = new Aluno('Taynan', 4, [6, 7, 5, 4])
let gustavo = new Aluno('Gustavo', 7, [6, 8, 5, 8])
let marcel = new Aluno('Marcel', 5, [5, 3, 7, 8])

curso.novoAluno(antonio, douglas, taynan, gustavo, marcel)

console.log(curso)
console.log(curso.alunoAprovado(antonio))
console.log(curso.listarAprovados())
