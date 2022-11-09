import { FaTimes } from "react-icons/fa";

const Dragon = ({ dragon, onDelete, onToggle }) => {
  return (
    <div
      className={`dragon ${dragon.favorite ? "favorite" : ""}`}
      onDoubleClick={() => onToggle(dragon.id)}
    >
      <h3>
        {dragon.text}
        <FaTimes
          style={{ color: "red", cursor: "pointer" }}
          onClick={() => onDelete(dragon.id)}
        />
      </h3>
      <p>{dragon.dragonClass}</p>
    </div>
  );
};

export default Dragon;
