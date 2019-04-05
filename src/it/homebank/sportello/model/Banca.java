package it.homebank.sportello.model;

public class Banca {
    int idBanca;
    String nome;
    String indirizzo;
    String descrizione;
    String fotoRappresentativa;
    Direttore Direttore;

    public int getIdBanca() {
        return idBanca;
    }

    public void setIdBanca(int idBanca) {
        this.idBanca = idBanca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getFotoRappresentativa() {
        return fotoRappresentativa;
    }

    public void setFotoRappresentativa(String fotoRappresentativa) {
        this.fotoRappresentativa = fotoRappresentativa;
    }

    public it.homebank.sportello.model.Direttore getDirettore() {
        return Direttore;
    }

    public void setDirettore(it.homebank.sportello.model.Direttore direttore) {
        Direttore = direttore;
    }
}
