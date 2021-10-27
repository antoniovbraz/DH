// 1. Crie uma função que converta polegadas em centímetros.
// Recebe pelo parâmetro polegadas e retorna seu equivalente em centímetros.

function polegadasParaCentimetros(x){
    return x * 2.54;
}
console.log("1. Função polegadas para centimetros");
console.log("Recebido o valor 42 polegadas");
console.log("42 polegadas é " + polegadasParaCentimetros(42) + " em centimetros.\n");

// 2. Crie uma função que receba uma string e a converta em um URL.
// ex: "funcaojs" é retornado como "http://www.funcaojs.com.br"

function stringToURL(text){
    return`http://www.${text}.com.br`;
}

console.log("2. Função texto para URL");
console.log("Recebido o texto peepershop");
console.log(stringToURL("peepersshop"),"\n");

// 3. Crie uma função que recebe umas tring e retorna a mesma frase, mas com o caracter de exclamação (!).

function exclamation(text){
    return`${text}!`;
}

console.log("3. Função texto com exclamação");
console.log("Recebido o texto Hey JavaScript");
console.log(exclamation("Hey JavaScript"),"\n");

// 4. Crie uma função que calcule a idade dos cachorros, considerando que 1 ano humano, equivale a 7 anos para eles.

function dogYears(dogAge){
    return dogAge * 7;
}

console.log("4. Idade do cachorro para humano");
console.log("Recebido 5 anos");
console.log(dogYears(5));