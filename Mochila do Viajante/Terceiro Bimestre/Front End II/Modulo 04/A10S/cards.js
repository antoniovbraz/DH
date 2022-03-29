// create the card div, add it to the document and set a class
const cardsDiv = document.createElement( "div" );
document.body.appendChild( cardsDiv );
cardsDiv.setAttribute( "class", "cards" );

// create de card it self and appended to the card div
const cardCategory = document.createElement( "div" );
cardsDiv.appendChild( cardCategory );
cardCategory.setAttribute("class","card-category");

// add style to the card-category div
cardCategory.setAttribute("style", "background-image: linear-gradient(rgba(0,0,0,0.3), rgba(0,0,0,0.3)), url(https://raw.githubusercontent.com/lewagon/fullstack-images/master/uikit/lunch.jpg)");
// add the text of the card
cardCategory.appendChild( document.createTextNode( "Comida 1" ) );
