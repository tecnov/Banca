package View.ActionListen;
import View.Frame;
import View.Panel.RegistrationPanel;
import it.homebank.sportello.Business.RegistrationBusiness;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationListener implements ActionListener {
    private Frame frame;
    private RegistrationBusiness registrationBusiness = new RegistrationBusiness();
    public RegistrationListener(View.Frame frame) {
        this.frame = frame;
    }
    public final static String REGISTER = "Registra utente";
    public final static String COMPLETE = "Completa registrazione";

    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if (sorgenteEvento.equals(REGISTER)){
            String name;


            }

        if (sorgenteEvento.equals(COMPLETE)){

             String name = frame.getRegistrationPnl().getTextName().getText();
             String surname = frame.getRegistrationPnl().getTextName().getText();
             String username = frame.getRegistrationPnl().getTextName().getText();
             String password = frame.getRegistrationPnl().getTextName().getText();
             String email = frame.getRegistrationPnl().getTextName().getText();

             registrationBusiness.registrationCliente("davide", "e", "coglione", "con", "ascella");

             JOptionPane.showMessageDialog(null, "Le abbiamo inviato un email di conferma");
        }
            }
        }



