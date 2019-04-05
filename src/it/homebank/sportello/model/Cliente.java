package it.homebank.sportello.model;

public class Cliente extends Utente {
  private  int idCliente;
  private  int idProdotto;
  private  int idServizio;


  public int getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }

  public int getIdProdotto() {
    return idProdotto;
  }

  public void setIdProdotto(int idProdotto) {
    this.idProdotto = idProdotto;
  }

  public int getIdServizio() {
    return idServizio;
  }

  public void setIdServizio(int idServizio) {
    this.idServizio = idServizio;
  }
}
