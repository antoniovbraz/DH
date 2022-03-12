// Projeto microondas turbo.
// Desenvolver o menu de 5 itens com tempos predefinidos.

console.log("Olá, obrigado por utilizar o microondas turbo.");
console.log("######");
console.log("########");
console.log("##########");
console.log("O quê deseja preparar?\n");

console.log("1 - Pipoca – 10 segundos\n2 - Macarrão – 8 segundos\n3 - Carne – 15 segundos\n4 - Feijão – 12 segundos\n5 - Brigadeiro – 8 segundos\n")
// 1 - Pipoca – 10 segundos (padrão)
// 2 - Macarrão – 8 segundos (padrão)
// 3 - Carne – 15 segundos (padrão)
// 4 - Feijão – 12 segundos (padrão)
// 5 - Brigadeiro – 8 segundos (padrão) 

function microondas(item, tempo = 0) {
    switch (item) {
        case 1:
            item = "Pipoca"
            tempo = 10;
            console.log("Uma pipoca vai muito bem agora.");
            console.log("Aquecendo por 10 segundos\n");
            break;
        case 2:
            item = "Macarrão"
            tempo = 8;
            console.log("Macarrão al dente saindo.");
            console.log("Aquecendo por 08 segundos\n");
            break;
        case 3:
            item = "Carne"
            tempo = 15;
            console.log("Espero que a visita não seja vegana.\nCarne quentinha saindo.");
            console.log("Aquecendo por 15 segundos\n");
            break;
        case 4:
            item = "Feijão"
            tempo = 12;
            console.log("Hummm, feijão.");
            console.log("Aquecendo por 12 segundos\n");
            break;
        case 5:
            item = "Brigadeiro"
            tempo = 08;
            console.log("Eu adoro um brigadeiro de sobremesa");
            console.log("Aquecendo por 08 segundos\n");
            break;
        default:
            console.log("Não possa esquetar isso, vai que é uma bomba");
            break;
    }
}
console.log("1 - Pipoca Escolhida")
microondas(1);

console.log("3 - Carne Escolhida")
microondas(3);

