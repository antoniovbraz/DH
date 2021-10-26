// function calcImc(peso, altura)
// {
//     let imc = peso / (altura*altura);
//   return Math.round(imc);
// }

// let meuimc = calcImc(68,1.72);
// console.log(meuimc);


var person = {
  firstName: "Antonio",
  lastName: "Henrique",
  idade: 37,
  peso: 68,
  altura: 1.72,
  imc: function calcularIMC(peso,altura) {
    altura = this.altura;
    return Math.round(this.peso / (altura * altura));
  }
};

qualoimc = console.log(`${person.firstName} ${person.lastName} de ${person.idade} anos tem o indice de massa corporal de ${person.imc()}`);
