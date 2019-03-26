package it.homebank.sportello.model;

public class Amministratore extends Persona {
    private int idAmministratore;

    public Amministratore() {

    }

    public Amministratore(int idAmministratore) {
        this.idAmministratore = idAmministratore;
    }

    public Amministratore(String nome, String cognome, String email, String username, String password, int idAmministratore) {
        super(nome, cognome, email, username, password);
        this.idAmministratore = idAmministratore;
    }

    public int getIdAmministratore() {
        return idAmministratore;
    }

    public void setIdAmministratore(int idAmministratore) {
        this.idAmministratore = idAmministratore;
    }
}
