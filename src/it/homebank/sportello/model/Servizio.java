package it.homebank.sportello.model;

public class Servizio {
    private int idServizio;
    Banca banca; /*di quale banca è il servizio*/
    private String nome;
    private String descrizione;
    private int interessi;
    private int durata;

    public Servizio(int idServizio, Banca banca, String nome, String descrizione, int interessi, int durata) {
        this.idServizio = idServizio;
        this.banca = banca;
        this.nome = nome;
        this.descrizione = descrizione;
        this.interessi = interessi;
        this.durata = durata;
    }

    public int getIdServizio() {
        return idServizio;
    }

    public void setIdServizio(int idServizio) {
        this.idServizio = idServizio;
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

    public int getInteressi() {
        return interessi;
    }

    public void setInteressi(int interessi) {
        this.interessi = interessi;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
