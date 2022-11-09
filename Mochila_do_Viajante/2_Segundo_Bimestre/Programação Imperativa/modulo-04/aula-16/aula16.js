let bemVindo = () => 'Olá mundo!'
let dobro = (numero) => numero * 2
let soma = (a, b) => a + b

let horaAtual = () => {
  let data = new Date()
  return data.getHours() + ':' + data.getMinutes()
}

console.log(horaAtual())

setTimeout(() => {
  console.log('Olá mago')
}, 3000)
