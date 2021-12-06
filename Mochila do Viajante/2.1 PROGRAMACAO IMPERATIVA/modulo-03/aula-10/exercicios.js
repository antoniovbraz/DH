let produtos = ['Carregador de celular', 'Fone sem fio', 'Mouse', 'Cabo USB']

console.log(produtos)

let unificar = produtos.join(', ')
console.log(`Aqui você encontra ${unificar} e muito mais.`)

let retirarUltimoProduto = produtos.pop()
console.log(`O ${retirarUltimoProduto} não temos mais.`)

let adicionarUmNovoProduto = produtos.push('Cabo tipo C')
console.log(`Mas chegou o ${produtos[3]}.`)

let addProdutoFrente = produtos.unshift('Carregador por indução')
console.log(
  `Esse ${produtos[0]} chegou agora e já colocamos ele na frente dos outros produtos.`,
)

let removeFisrtItem = produtos.shift()
console.log(`O ${removeFisrtItem}, vendemos todos.`)
console.log(`Agora o que temos de produtos são ${produtos}.`)
