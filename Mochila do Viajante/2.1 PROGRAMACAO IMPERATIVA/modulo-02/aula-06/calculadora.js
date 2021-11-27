function add(x, y) {
  return x + y
}

function subtraction(x, y) {
  return x - y
}

function multiply(x, y) {
  return x * y
}

function divide(x, y) {
  return x / y
}

function modulo(x, y) {
  return x % y
}

// Testing the functions

// console.log(add(10,10));
// console.log(subtraction(10,2));
// console.log(multiply(10,10));
// console.log(divide(10,5));

function quadradoDoNumero(x) {
  return multiply(x, x)
}

// console.log(quadradoDoNumero(10))

function mediaDeTresNumeros(x, y, z) {
  const sum = x + y + z
  return divide(sum, 3)
}

// console.log(mediaDeTresNumeros(10, 20, 10))

function percentage(a, b) {
  const porcentos = divide(a * b, 100)
  return porcentos
}

console.log(percentage(300, 15))

function geradorDePorcentagem(a, b) {
  const resultado = multiply(a / b, 100)
  return resultado
}

console.log(geradorDePorcentagem(20, 200))
