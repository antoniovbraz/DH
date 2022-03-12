let numeros = [2, 4, 6, 8, 10, 12, 14]

let impares = numeros.map(function (par) {
  return par + 1
})

let nomes = ['joão', 'maria', 'jose,', 'maria', 'pedro']

let maria = nomes.filter(function (nomes) {
  return nomes == 'maria'
})

let reduzir = numeros.reduce(function (acumulador, numero) {
  return acumulador + '-' + numero
})

let animais = ['Leão', 'Tigre', 'Leopardo', 'Onça']

let animal = animais.forEach(function (animal) {
  console.log(`O animal é ${animal}`)
})
