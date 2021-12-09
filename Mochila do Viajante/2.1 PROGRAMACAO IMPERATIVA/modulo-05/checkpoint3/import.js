let Aluno = require('./aluno')

let antonio = new Aluno('Antonio', 8, [3, 5, 8, 7])
let douglas = new Aluno('Douglas', 3, [10, 9, 7, 8])
let taynan = new Aluno('Taynan', 4, [6, 7, 5, 4])
let gustavo = new Aluno('Gustavo', 7, [6, 8, 5, 8])
let marcel = new Aluno('Marcel', 5, [5, 3, 7, 8])

console.log(douglas.media)

antonio.faltas

console.log(antonio.qtdfaltas)
