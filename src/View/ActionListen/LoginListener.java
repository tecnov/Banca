package View.ActionListen;

import View.Frame;
import View.Panel.LoginPanel;
import View.Panel.RegistrationPanel;
import View.Panel.UtentePanel;
import View.Panel.RegistrationPanel;


import it.homebank.sportello.Business.LoginBusiness;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LoginListener implements ActionListener {


    private Frame frame;

    public UtentePanel utentepanel = new UtentePanel();
    public LoginPanel loginPanel = new LoginPanel();
    public RegistrationPanel registrationPanel = new RegistrationPanel();

    public LoginListener(Frame frame) {
        this.frame = frame;
    }



    public final static String LOGIN = "ConfermaLogin";
    //public final static String BACK = "Torna indietro";
    public final static String REGISTER = "Registra";

    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if (sorgenteEvento.equals(LOGIN)) {
            String username = frame.getLoginPnl().getTextUser().getText();
            String password = frame.getLoginPnl().getTextPassword().getText();
            LoginBusiness l = new LoginBusiness();

            if (l.login(username, password).equals(null))
                JOptionPane.showMessageDialog(null, "Registrati");
            else {
                JOptionPane.showMessageDialog(null, "Benvenuto");
                loginPanel.getloginPanel().setVisible(false);
                utentepanel.getUtentePnl().setVisible(true);
            }

            if (l.login(username, password).equals(null))
                JOptionPane.showMessageDialog(null, "Registrati");
            else {
                JOptionPane.showMessageDialog(null, "Benvenuto");
            }

        }

        if(sorgenteEvento.equals(REGISTER)) {
            JOptionPane.showMessageDialog(null,"è pregato di inserire i suoi dati");
            frame.getLoginPnl().getloginPanel().setVisible(false);
            frame.getRegistrationPnl().getRegistrationPanel().setVisible(true);
        }

    }

}
