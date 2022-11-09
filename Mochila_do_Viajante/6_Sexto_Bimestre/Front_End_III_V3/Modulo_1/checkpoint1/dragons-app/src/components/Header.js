import PropTypes from "prop-types"; // prop-types para default e validações.
import Button from "./Button"; // Componente filho de Header

const Header = ({ title }) => {
  const onClick = () => {
    console.log("Click");
  };
  return (
    <header className="header">
      <h1>{title}</h1>
      <Button color="green" text="Add" onClick={onClick} />
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
