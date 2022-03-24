// create the card div, add it to the document and set a class
const main = document.getElementById("id-main");
const cardsDiv = document.createElement("div");
cardsDiv.setAttribute("class", "cards");

// create de card it self and appended to the card div
const cardCategory = document.createElement("div");
cardCategory.setAttribute("class", "card-category");

// add style to the card-category div
cardCategory.setAttribute(
  "style",
  "background-image: linear-gradient(rgba(0,0,0,0.3), rgba(0,0,0,0.3)), url(https://raw.githubusercontent.com/lewagon/fullstack-images/master/uikit/lunch.jpg)"
);

// add the text of the card
cardCategory.appendChild(document.createTextNode("Comida 1"));

// second card
// create de card it self and appended to the card div
const cardCategory2 = document.createElement("div");
cardCategory2.setAttribute("class", "card-category");

// add style to the card-category div
cardCategory2.setAttribute(
  "style",
  "background-image: linear-gradient(rgba(0,0,0,0.3), rgba(0,0,0,0.3)), url(https://raw.githubusercontent.com/lewagon/fullstack-images/master/uikit/lunch.jpg)"
);

// add the text of the card
cardCategory2.appendChild(document.createTextNode("Comida 2"));
cardsDiv.appendChild(cardCategory);
cardsDiv.appendChild(cardCategory2);
main.appendChild(cardsDiv);
