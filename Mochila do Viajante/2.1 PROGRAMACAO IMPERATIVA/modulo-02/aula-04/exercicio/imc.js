function calcimc(peso, altura)
{
    let imc = peso / (altura*altura);
    return imc;
}

let person = function (nome, idade, altura)
{
    let nome = nome;
    let idade = idade;
    let altura = altura;
}

pessoa = person("Antonio Henrique", 38, 1.72);

console.log(pessoa);

console.log(calcimc(68,1.72).round)