package it.homebank.sportello.model;

public class Filiale {
    int idFiliale;

    String nome;
    String indirizzo;
    String orario;
    String collegamentofoto;
    Banca Banca;
    Cassiere Cassiere;

    public int getIdFiliale() {
        return idFiliale;
    }

    public void setIdFiliale(int idFiliale) {
        this.idFiliale = idFiliale;
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

    public String getOrario() {
        return orario;
    }

    public void setOrario(String orario) {
        this.orario = orario;
    }

    public String getCollegamentofoto() {
        return collegamentofoto;
    }

    public void setCollegamentofoto(String collegamentofoto) {
        this.collegamentofoto = collegamentofoto;
    }

    public it.homebank.sportello.model.Banca getBanca() {
        return Banca;
    }

    public void setBanca(it.homebank.sportello.model.Banca banca) {
        Banca = banca;
    }

    public it.homebank.sportello.model.Cassiere getCassiere() {
        return Cassiere;
    }

    public void setCassiere(it.homebank.sportello.model.Cassiere cassiere) {
        Cassiere = cassiere;
    }
}
