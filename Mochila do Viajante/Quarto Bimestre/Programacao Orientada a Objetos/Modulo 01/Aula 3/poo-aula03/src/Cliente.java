public class Cliente {
  private Integer numeroCliente;
  private String nome;
  private Double divida = 0.0;

  public Cliente(Integer num, String cliente) {
    this.numeroCliente = num;
    this.nome = cliente;
  }

  public void setNumeroCliente(Integer numero) {
    this.numeroCliente = numero;
  }

  public Integer getNumeroCliente() {
    return this.numeroCliente;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setDivida(Double valor) {
    this.divida = valor;
  }

  public Double getDivida() {
    return this.divida * 1.1;
  }

  public void aumentarDivida(Double valor) {
    setDivida(this.divida + valor);
  }

  public void pagarDivida(Double valor) {
    if (this.divida <= 0) {
      System.out.println("Sua divida já está paga!");
    } else {
      setDivida(this.divida - valor);
    }
  }
}
