import { useState } from "react";

const AddDragon = ({ onAdd }) => {
  const [text, setText] = useState("");
  const [dragonClass, setDragonsClass] = useState("");
  const [image, setImage] = useState("");
  const [favorite, setFavorite] = useState(false);

  const onSubmit = (e) => {
    e.preventDefault();

    if (!text) {
      alert("Please add a Dragon");
      return;
    }

    onAdd({ text, dragonClass, image, favorite });

    setText("");
    setDragonsClass("");
    setImage("");
    setFavorite(false);
  };

  return (
    <form className="add-form" onSubmit={onSubmit}>
      <div className="form-control">
        <label>Dragon: </label>
        <input
          type="text"
          placeholder="Add Dragon"
          value={text}
          onChange={(e) => setText(e.target.value)}
        />
      </div>
      <div className="form-control">
        <label>Dragons Class: </label>
        <input
          type="text"
          placeholder="Add Dragon Class"
          value={dragonClass}
          onChange={(e) => setDragonsClass(e.target.value)}
        />
      </div>
      <div className="form-control">
        <label>Dragon Image: </label>
        <input
          type="text"
          placeholder="Add Image"
          value={image}
          onChange={(e) => setImage(e.target.value)}
        />
      </div>
      <div className="form-control form-control-check">
        <label>Set as Favorite: </label>
        <input
          type="checkbox"
          checked={favorite}
          value={favorite}
          onChange={(e) => setFavorite(e.currentTarget.checked)}
        />
      </div>

      <input type="submit" value="Save Dragon" />
    </form>
  );
};

export default AddDragon;
