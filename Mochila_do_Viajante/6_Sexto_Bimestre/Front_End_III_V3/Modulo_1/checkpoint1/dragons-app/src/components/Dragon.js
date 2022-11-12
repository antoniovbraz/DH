import { FaTimes } from "react-icons/fa";

const Dragon = ({ dragon, onDelete, onToggle }) => {
  return (
    <div
      className={`dragon ${dragon.favorite ? "favorite" : ""} card-main`}
      onDoubleClick={() => onToggle(dragon.id)}
    >
      <img src={dragon.image} alt={dragon.text} />
      <div className="card-infos">
        <div>
          <h3>
            {dragon.text}
            <FaTimes
              style={{ color: "red", cursor: "pointer" }}
              onClick={() => onDelete(dragon.id)}
            />
          </h3>
          <p>{dragon.dragonClass}</p>
        </div>
      </div>
    </div>
  );
};

export default Dragon;
