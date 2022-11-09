// função declarada
function darOi(nome) {
  const mensagem = 'Olá, seja bem vindo! '
  console.log(mensagem + nome)
}

console.log('Função darOi')
darOi('Antonio')

// função expressa
console.log('Função somar')
let somar = function (numA, numB) {
  console.log(numA + numB)
}

somar(1, 2)
