package it.homebank.sportello.model;

public class Filiale {

    int idFiliale;
    String nome;
    Banca banca; /*indica di quale banca è la filiale*/
    Utente cassiere; /*(indica quale utente è il cassiere della filiale*/
    String indirizzo;
    String orario;
    String collegamentofoto;

    public Filiale(int idFiliale, String nome, Banca banca, Utente cassiere, String indirizzo, String orario, String collegamentofoto) {
        this.idFiliale = idFiliale;
        this.nome = nome;
        this.banca = banca;
        this.cassiere = cassiere;
        this.indirizzo = indirizzo;
        this.orario = orario;
        this.collegamentofoto = collegamentofoto;
    }

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
        return banca;
    }

    public void setBanca(it.homebank.sportello.model.Banca banca) {
        this.banca = banca;
    }

    public it.homebank.sportello.model.Utente getCassiere() {
        return cassiere;
    }

    public void setCassiere(it.homebank.sportello.model.Utente cassiere) {
        this.cassiere = cassiere;
    }
}
