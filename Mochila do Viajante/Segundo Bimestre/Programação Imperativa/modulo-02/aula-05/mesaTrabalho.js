// 1. Crie uma função que converta polegadas em centímetros.
// Recebe pelo parâmetro polegadas e retorna seu equivalente em centímetros.

function polegadasParaCentimetros(x) {
  return x * 2.54
}
console.log('1. Função polegadas para centimetros')
console.log('Recebido o valor 42 polegadas')
console.log(
  '42 polegadas é ' + polegadasParaCentimetros(42) + ' em centimetros.\n',
)

// 2. Crie uma função que receba uma string e a converta em um URL.
// ex: "funcaojs" é retornado como "http://www.funcaojs.com.br"

function stringToURL(text) {
  return `http://www.${text}.com.br`
}

console.log('2. Função texto para URL')
console.log('Recebido o texto peepershop')
console.log(stringToURL('peepersshop'), '\n')

// 3. Crie uma função que recebe umas tring e retorna a mesma frase, mas com o caracter de exclamação (!).

function exclamation(text) {
  return `${text}!`
}

console.log('3. Função texto com exclamação')
console.log('Recebido o texto Hey JavaScript')
console.log(exclamation('Hey JavaScript'), '\n')

// 4. Crie uma função que calcule a idade dos cachorros, considerando que 1 ano humano, equivale a 7 anos para eles.

function dogYears(dogAge) {
  return dogAge * 7
}

console.log('4. Idade do cachorro para humano')
console.log('Recebido 5 anos')
console.log(dogYears(5), '\n')

// 5. Crie uma função que calcule o valor da sua hora de trabalho, tendo como parâmetro o seu salário mensal. PS: considere que você trabalhe 160 horas no mês.

function salarioHora(salarioMes, horasMes) {
  return salarioMes / horasMes
}

console.log('5. Salário do mês em horas')
console.log('Salário de R$6000,00 por 160 horas trabalhadas')
console.log(salarioHora(6000, 160), '\n')

// 6. Crie a função calculadora de IMC de uma pessoa, que recebe a altura em centímetros e o peso em quilogramas.Emseguida, execute a função, testan do diferentes valores.

function calculcarIMC(altura, peso) {
  let alturacm = altura / 100
  let imc = Math.round(peso / (alturacm * alturacm))
  return imc
}

console.log('6. Calcular o IMC')
console.log('IMC de Antonio Henrique 172cm e 68kg')
imc = calculcarIMC(172, 68)
fullname = 'Antonio Henrique'
console.log(`${fullname} tem o indice de massa corporal de ${imc}\n`)
imc = calculcarIMC(162, 55)
fullname = 'Bruna Heimbeck'
console.log('IMC de Bruna Heimbeck 162cm e 55kg')
console.log(`${fullname} tem o indice de massa corporal de ${imc}\n`)

// 7. Crie uma função que receba uma string em minúsculas, converta-a em maiúsculas e as retorne.
// Investigue o que o método de .toUpperCase() faz.

function caixaAlta(word) {
  const palavra = word
  return palavra.toUpperCase()
}

console.log(caixaAlta('antonio'))

// 8. Crie uma função que receba um parâmetro e retorne o tipo de dado deste parâmetro.

function queTipo(tipo) {
  const type = tipo
  return typeof type
}

console.log(queTipo('Antonio'))
console.log(queTipo(8))

// 9. Crie uma função pela qual passamos o raio de um círculo e ela retorna a circunferência.

function circumference(raio) {
  return 2 * Math.PI * raio
}

console.log(circumference(10))
