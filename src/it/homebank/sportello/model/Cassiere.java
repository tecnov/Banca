package it.homebank.sportello.model;

public class Cassiere extends Utente {
    int idCassiere;
    Filiale filiale;

    public int getIdCassiere() {
        return idCassiere;
    }

    public void setIdCassiere(int idCassiere) {
        this.idCassiere = idCassiere;
    }

    public it.homebank.sportello.model.Filiale getFiliale() {
        return filiale;
    }

    public void setFiliale(it.homebank.sportello.model.Filiale filiale) {
        filiale = filiale;
    }
}
