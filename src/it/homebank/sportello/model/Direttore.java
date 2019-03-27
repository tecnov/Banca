package it.homebank.sportello.model;

public class Direttore extends Utente {
    int idDirettore;
    int


    public Direttore(int idUtente, String nome, String cognome, String email, String username, String password) {
        super(idUtente, nome, cognome, email, username, password);
    }
}
