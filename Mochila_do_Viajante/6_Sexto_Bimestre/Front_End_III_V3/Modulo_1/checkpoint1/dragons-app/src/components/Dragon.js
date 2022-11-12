import { FaTimes } from "react-icons/fa";

const Dragon = ({ dragon, onDelete, onToggle }) => {
  return (
    <div className="cards">
      <div
        className={`dragon ${dragon.favorite ? "favorite" : ""} card-main`}
        onDoubleClick={() => onToggle(dragon.id)}
      >
        <h3>
          {dragon.text}
          <FaTimes
            style={{ color: "red", cursor: "pointer" }}
            onClick={() => onDelete(dragon.id)}
          />
        </h3>
        <div className="card-infos">
          <p>{dragon.dragonClass}</p>
        </div>
      </div>
    </div>
  );
};

export default Dragon;
