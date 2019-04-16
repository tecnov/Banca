package it.homebank.sportello.Business;

import it.homebank.sportello.model.Utente;

import javax.swing.*;

public class RegistrationBusiness {

    public Utente registrationUtente (String name, String surname, String username, String password, String email, int tipo ){

        Utente tmpRegistrationUtente = new Utente();

        tmpRegistrationUtente.setNome(name);
        tmpRegistrationUtente.setCognome(surname);
        tmpRegistrationUtente.setUsername(username);
        tmpRegistrationUtente.setPassword(password);
        tmpRegistrationUtente.setEmail(email);
        tmpRegistrationUtente.setTipo(tipo);
        JOptionPane.showMessageDialog(null,"La registrazione è avvenuta con successo");
        return (tmpRegistrationUtente);
    }

}
