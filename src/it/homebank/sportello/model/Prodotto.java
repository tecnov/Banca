package it.homebank.sportello.model;

public class Prodotto {
    private int idProdotto;
    private Banca banca; /*indica di quale banca è il prodotto*/
    private String nome;
    private String descrizione;
    private int prezzo;
    private String datainizio;
    private String datafine;

    public Prodotto(int idProdotto, Banca banca, String nome, String descrizione, int prezzo, String datainizio, String datafine) {
        this.idProdotto = idProdotto;
        this.banca = banca;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.datainizio = datainizio;
        this.datafine = datafine;
    }

    public int getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }

    public Banca getBanca() {
        return banca;
    }

    public void setBanca(Banca banca) {
        this.banca = banca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public String getDatainizio() {
        return datainizio;
    }

    public void setDatainizio(String datainizio) {
        this.datainizio = datainizio;
    }

    public String getDatafine() {
        return datafine;
    }

    public void setDatafine(String datafine) {
        this.datafine = datafine;
    }
}

