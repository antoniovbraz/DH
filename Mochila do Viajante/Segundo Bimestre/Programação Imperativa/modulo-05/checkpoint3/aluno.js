// Micro desafio - Passo 1
// Crie um objeto aluno que tenha como atributos: nome (string), quantidade de faltas (number) e notas (array de números).
// Crie um construtor para ele e importe-o como o módulo aluno.
function Aluno(nome, qtdfaltas, notas, media, faltas) {
  this.nome = nome
  this.qtdfaltas = qtdfaltas
  this.notas = notas
  this.media = () => this.notas.reduce((a, b) => a + b) / notas.length // passo 2 calcular média das notas do aluno(a)
  this.Addfaltas = () => this.qtdfaltas++ // adicionando falta com sucesso
}

module.exports = Aluno
