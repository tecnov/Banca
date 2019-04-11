package it.homebank.sportello.Business;

import it.homebank.sportello.model.Cliente;
import it.homebank.sportello.model.Utente;

import javax.swing.*;

public class RegistrationBusiness {

    public Cliente registrationCliente (String name, String surname, String username, String password, String email ){

        Cliente tmpRegistrationCliente = new Cliente();

        tmpRegistrationCliente.setNome(name);
        tmpRegistrationCliente.setCognome(surname);
        tmpRegistrationCliente.setUsername(username);
        tmpRegistrationCliente.setPassword(password);
        tmpRegistrationCliente.setEmail(email);
        JOptionPane.showMessageDialog(null,"La registrazione è avvenuta con successo");
        return (tmpRegistrationCliente);
    }

}
