import Dragon from "./Dragon";
function Dragons({ dragons, onDelete, onToggle }) {
  return (
    <div className="cards">
      {dragons.map((dragon) => (
        <Dragon
          key={dragon.id}
          dragon={dragon}
          onDelete={onDelete}
          onToggle={onToggle}
        />
      ))}
    </div>
  );
}

export default Dragons;
