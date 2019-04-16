package it.homebank.sportello.model;

import it.homebank.sportello.DAO.UtenteDAO;

public class Utente {

    private int idUtente;
    private String username;
    private String password;
    private String nome;
    private String cognome;
    private String email;
    private int tipo;
    Filiale filialeutente;


    public Utente(){

    }

    public Utente(int idUtente, String nome, String cognome, String email, String username, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Filiale getFilialeutente() {
        return filialeutente;
    }

    public void setFilialeutente(Filiale filialeutente) {
        this.filialeutente = filialeutente;
    }




    public Utente login ( String username, String password) {
        UtenteDAO sDAO = new UtenteDAO();
        return sDAO.login(username,password);
    }

}
