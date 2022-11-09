import Dragon from "./Dragon";
function Dragons({ dragons, onDelete, onToggle }) {
  return (
    <>
      {dragons.map((dragon) => (
        <Dragon
          key={dragon.id}
          dragon={dragon}
          onDelete={onDelete}
          onToggle={onToggle}
        />
      ))}
    </>
  );
}

export default Dragons;
