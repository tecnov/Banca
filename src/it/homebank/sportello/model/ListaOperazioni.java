package it.homebank.sportello.model;

public class ListaOperazioni {
    private int idOperazione;
    private String data;
    private Cliente mittente;
    private Cliente beneficiario;
    private ListaServizi servizio;
    private ListaProdotti prodotto;
    private String dataOperazione;
    private boolean autorizzazione;
    private Cassiere cassiere;


    public int getIdOperazione() {
        return idOperazione;
    }

    public void setIdOperazione(int idOperazione) {
        this.idOperazione = idOperazione;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getMittente() {
        return mittente;
    }

    public void setMittente(Cliente mittente) {
        this.mittente = mittente;
    }

    public Cliente getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Cliente beneficiario) {
        this.beneficiario = beneficiario;
    }

    public ListaServizi getServizio() {
        return servizio;
    }

    public void setServizio(ListaServizi servizio) {
        this.servizio = servizio;
    }

    public ListaProdotti getProdotto() {
        return prodotto;
    }

    public void setProdotto(ListaProdotti prodotto) {
        this.prodotto = prodotto;
    }

    public String getDataOperazione() {
        return dataOperazione;
    }

    public void setDataOperazione(String dataOperazione) {
        this.dataOperazione = dataOperazione;
    }

    public boolean isAutorizzazione() {
        return autorizzazione;
    }

    public void setAutorizzazione(boolean autorizzazione) {
        this.autorizzazione = autorizzazione;
    }

    public Cassiere getCassiere() {
        return cassiere;
    }

    public void setCassiere(Cassiere cassiere) {
        this.cassiere = cassiere;
    }
}
