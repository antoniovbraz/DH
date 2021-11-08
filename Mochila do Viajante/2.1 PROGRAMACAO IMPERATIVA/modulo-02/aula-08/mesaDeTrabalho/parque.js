function podeSubir(altura, vemAcompanhado) {
   if (altura <= 2.0 && altura >= 1.40) {
       console.log("Olá seja bem vindo");
   } else if (altura <= 1.39 && altura >= 1.20 && vemAcompanhado == "Acompanhado") {
       console.log("Olá seja bem vindo, mas só acompanhado");
   }
    else {
       console.log("Infelizmente você não tem altura ou não está acompanhado")
   }
}

console.log(podeSubir(1.5, "Acompanhado"));
console.log(podeSubir(1.38, "Acompanhado"));
console.log(podeSubir(1.19, "Acompanhado"));

