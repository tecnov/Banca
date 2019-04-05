package it.homebank.sportello.model;

public class ListaServizi {
    private int idServizio;
    private ListaProdotti prodotto;
    private String dataInizio;
    private String dataScadenza;

    public int getIdServizio() {
        return idServizio;
    }

    public void setIdServizio(int idServizio) {
        this.idServizio = idServizio;
    }

    public ListaProdotti getProdotto() {
        return prodotto;
    }

    public void setProdotto(ListaProdotti prodotto) {
        this.prodotto = prodotto;
    }

    public String getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
    }

    public String getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(String dataScadenza) {
        this.dataScadenza = dataScadenza;
    }
}
