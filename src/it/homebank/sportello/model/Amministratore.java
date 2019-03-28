package it.homebank.sportello.model;

public class Amministratore {
    private int idAmministratore;
    private String password;

    public Amministratore() {

    }

    public Amministratore(int idAmministratore) {
        this.idAmministratore = idAmministratore;
    }


    public int getIdAmministratore() {
        return idAmministratore;
    }

    public void setIdAmministratore(int idAmministratore) {
        this.idAmministratore = idAmministratore;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}