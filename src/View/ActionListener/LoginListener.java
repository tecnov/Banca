package View.ActionListener;

import View.Frame;
import View.Panel.LoginPanel;
import View.Panel.UserPanel;


import it.homebank.sportello.Business.LoginBusiness;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LoginListener implements ActionListener {


    private Frame frame;

    public UserPanel utentepanel = new UserPanel();
    public LoginPanel loginPanel = new LoginPanel();


    public LoginListener(Frame frame) {
        this.frame = frame;
    }


    public final static String LOGIN = "ConfermaLogin";
    public final static String BACK = "Torna indietro";

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
                utentepanel.getUserPnl().setVisible(true);
            }

           /* if (l.login(username, password).equals(null))
                JOptionPane.showMessageDialog(null, "Registrati");
            else {
                JOptionPane.showMessageDialog(null, "Benvenuto");
            }*/

        }


        if (sorgenteEvento.equals(BACK)) {
            String username = frame.getLoginPnl().getTextUser().getText();
            frame.getLoginPnl().getloginPanel().setVisible(false);
            frame.getHomePnl().getHomePnl().setVisible(true);

        }

    }
}

