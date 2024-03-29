/*
  Checkpoint 1 - Antonio Henrique Vanucci
  Aplicativo para guardar uma lista de Dragões do
  Filme como treinar o seu Dragão(O Filme Favorito do meu filho).

  Busquei usar componentes ao máximo que minha capacidade permitiu.
  Ao invés de fazer uso de props fiz uso direto do objeto.

  Algumas curiosidades: Fiz uso dos plugins
  ES7+ React/Redux/React-Native snippets
  O plugin acima me ajudou muito, é so digitar "rafce" em um
  componente limpo que já cria uma arrow function com export.

  usei o plugin react-icons para importar  icones

  A identação foi toda corrigida usando o Prettier.
  Emmet também, is a savior. ;)

  Faço uso extensivo do inglês para nomear as variaveis
  por boas praticas(copiando meu professor. rs).


*/

import "./App.css";
import { useState } from "react";
import AddDragon from "./components/AddDragon";
import Dragons from "./components/Dragons";
import Header from "./components/Header";

function App() {
  const [showAddDragon, setShowAddDragon] = useState(false);
  const [dragons, setDragons] = useState([
    {
      id: 1,
      text: "Banguela",
      dragonClass: "Ataque/Furia da Noite",
      image:
        "https://seletronic.com.br/wp-content/uploads/2021/04/banguela-como-treinar-seu-dragao-peixe-tamuata-800x500.jpg",
      favorite: true,
    },
    {
      id: 2,
      text: "Tempestade",
      dragonClass: "Rastreador/Nadder Mortal",
      image:
        "https://assets1.ignimgs.com/thumbs/userUploaded/2018/6/7/httyd-thumb-1528386082323.jpg",
      favorite: true,
    },
    {
      id: 3,
      text: "Dente de Anzol",
      dragonClass: "Pesadelo/Monstruoso",
      favorite: false,
    },
  ]);

  // Add Dragon
  const addDragon = (dragon) => {
    const id = Math.floor(Math.random() * 10000) + 1;
    const newDragon = { id, ...dragon };
    setDragons([...dragons, newDragon]);
  };

  // Delete Dragon
  const deleteDragon = (id) => {
    setDragons(dragons.filter((dragon) => dragon.id !== id));
  };

  // Toggle Favorite
  const toggleFavorite = (id) => {
    setDragons(
      dragons.map((dragon) =>
        dragon.id === id ? { ...dragon, favorite: !dragon.favorite } : dragon
      )
    );
  };

  return (
    <div className="App">
      <Header
        className="header"
        onAdd={() => setShowAddDragon(!showAddDragon)}
        showAdd={showAddDragon}
      />
      {showAddDragon && <AddDragon onAdd={addDragon} />}
      {dragons.length > 0 ? (
        <Dragons
          dragons={dragons}
          onDelete={deleteDragon}
          onToggle={toggleFavorite}
        />
      ) : (
        "No Dragons to show"
      )}
    </div>
  );
}

export default App;
