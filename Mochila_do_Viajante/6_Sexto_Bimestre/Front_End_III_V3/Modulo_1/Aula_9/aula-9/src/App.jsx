const App = () => {
  const [numero, setNumero] = useState(10);

  const incrementar = () => {
    setNumero(numero + 1);
  };

  return (
    <div>
      <h1>Número atual: {numero}</h1>
      <button onClick={incrementar}>Incrementar</button>
    </div>
  );
};

export default App;
