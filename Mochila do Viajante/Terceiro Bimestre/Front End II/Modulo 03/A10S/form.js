const buttonCopy = document.querySelector("#add_card");

buttonCopy.addEventListener("click", function (e) {
  e.preventDefault();
  const titulo = document.querySelector("#titleField").value;
  console.log(titulo);
  const descricao = document.querySelector("#descriptionField").value;
  console.log(descricao);
  const imgUrl = document.querySelector("#linkField").value;
  console.log(imgUrl);

  if (titulo == "" || descricao == "" || imgUrl == "") {
    alert("Preencha todos os campos!");
  } else {
    const main = document.getElementById("id-main");
    const cardsDiv = document.createElement("div");
    cardsDiv.setAttribute("class", "cards");

    // create de card it self and appended to the card div
    const cardCategory = document.createElement("div");
    cardCategory.setAttribute("class", "card-category");

    // add style to the card-category div
    cardCategory.setAttribute(
      "style",
      `background-image: linear-gradient(rgba(0,0,0,0.3), rgba(0,0,0,0.3)), url(${imgUrl})`
    );
    // add the text of the card
    cardCategory.appendChild(document.createTextNode(titulo));

    cardsDiv.appendChild(cardCategory);
    main.appendChild(cardsDiv);
  }
});
