import PropTypes from "prop-types"; // prop-types para default e validações.
import Button from "./Button"; // Componente filho de Header

const Header = ({ title, onAdd, showAdd }) => {
  return (
    <header className="header">
      <h1>{title}</h1>
      <Button
        color={showAdd ? "red" : "#670bff"}
        text={showAdd ? "Close" : "Add"}
        onClick={onAdd}
      />
    </header>
  );
};

Header.defaultProps = {
  title: "My Dragons",
};

Header.propTypes = {
  title: PropTypes.string.isRequired,
};

export default Header;
