// 1- Adiciona ao cartão, o atributo "class" com o valor "cartao"
let cartao = document.querySelector("#cartao ")
cartao.classList.add("cartao")
// 2- Adicione o atributo "src" à imagem com o valor "https://www.youtube.com/img/desktop/yt_1200.png"
let logo = document.getElementById("logo")
logo.setAttribute("src", "https://www.youtube.com/img/desktop/yt_1200.png")
// 3- Remova a classe "titulo-feio" do título do documento
let tituloFeio = document.querySelector(".titulo-feio")
tituloFeio.classList.remove("titulo-feio")
// 4- Verifique se o link para o YouTube tem o atributo href ou não, e imprima esse resultado no console
let linkYouTube = document.getElementById("link_youtube")
console.log(linkYouTube.getAttribute("href"))
// 5- Capture o valor de href do link do Wikipedia e exiba no console
let link_wikipedia = document.getElementById("link_wikipedia")
console.log(link_wikipedia.getAttribute("href"))
