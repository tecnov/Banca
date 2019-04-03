package it.homebank.sportello.Business;

import it.homebank.sportello.model.Utente;

import javax.swing.*;

public class loginbusiness {


    public Utente login(String  username, String  password) {
        Utente utenteLogin = new Utente();
        utenteLogin.login(username,password);
        return utenteLogin;
    }





}
