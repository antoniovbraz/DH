// Micro desafio - Passo 3

// Em um arquivo diferente, crie o objeto literal curso que tem como atributos:
// nome do curso (string), nota de aprovação (number), faltas máximas (number)
// e uma  de estudantes lista(um array composto pelos alunos criados no passo 1).
let Aluno = require('./aluno')

let curso = {
  nomeCurso: 'CTD Programação Imperativa',
  notaAprovação: 7,
  faltalMaximas: 5,
  alunos: [],
  novoAluno: function (...aluno) {
    this.alunos.push(...aluno)
  },

  alunoAprovado: function (aluno) {
    let media = aluno.media()
    if (aluno.qtdFaltas < this.faltasMaximas && media >= this.notaAprovacao) {
      return true
    } else if (
      aluno.qtdFaltas == this.faltasMaximas &&
      media >= this.notaAprovacao * 1.1
    ) {
      return true
    } else {
      return false
    }
  },

  listarAprovados: function () {
    let listaDeAprovados = []
    this.alunos.forEach((aluno) => {
      listaDeAprovados.push(this.alunoAprovado(aluno))
    })
    return listaDeAprovados
  },
}

module.exports = curso
