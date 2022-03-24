let formulario = document.querySelector("form");
formulario.addEventListener("submit", function (event) {
  event.preventDefault();
});

const nome_comida = document.getElementsByName("food-name");
