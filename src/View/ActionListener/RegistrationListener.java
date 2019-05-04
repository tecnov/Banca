package View.ActionListener;
import View.Frame;
import it.homebank.sportello.Business.RegistrationBusiness;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationListener implements ActionListener {
    private Frame frame;
    private RegistrationBusiness registrationBusiness = new RegistrationBusiness();
    public RegistrationListener(View.Frame frame) {
        this.frame = frame;
    }
    public final static String REGISTER = "Registra utente";
    public final static String COMPLETE = "Completa registration";
    public final static String BACK = "Torna indietro";

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
             String CAP = frame.getRegistrationPnl().getTextName().getText();

             JOptionPane.showMessageDialog(null, "Le abbiamo inviato un email di conferma");
        }

        if (sorgenteEvento.equals(BACK)) {
            frame.getRegistrationPnl().getRegistrationPanel().setVisible(false);
            frame.getHomePnl().getHomePnl().setVisible(true);
        }

            }
        }



