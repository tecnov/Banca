package it.homebank.sportello.model;

public class Direttore extends Utente {
    int idDirettore;
    int idBanca;

    public Direttore(int idUtente, String nome, String cognome, String email, String username, String password) {
        super(idUtente, nome, cognome, email, username, password);
    }

    public int getIdDirettore() {
        return idDirettore;
    }

    public void setIdDirettore(int idDirettore) {
        this.idDirettore = idDirettore;
    }

    public int getIdBanca() {
        return idBanca;
    }

    public void setIdBanca(int idBanca) {
        this.idBanca = idBanca;
    }
}
