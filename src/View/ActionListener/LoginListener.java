package View.ActionListener;

import View.Frame;
import View.Panel.LoginPanel;
import View.Panel.UserPanel;


import it.homebank.sportello.Business.LoginBusiness;
import it.homebank.sportello.model.User;

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
            User user = l.login(username, password);

            if (user.getIdUser() == 0)
                JOptionPane.showMessageDialog(null, "Registrati");
            else {
                switch (user.getType()) {
                    case (1):
                        loginPanel.getloginPanel().setVisible(false);
                        //TODO administrator panel
                        break;

                    case (2):
                        loginPanel.getloginPanel().setVisible(false);
                        //TODO director panel
                        break;
                    case (3):
                        loginPanel.getloginPanel().setVisible(false);
                        //TODO cashier panel
                        break;
                    case(4):
                        loginPanel.getloginPanel().setVisible(false);
                        //TODO custoner panel
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Devi attendere che l'amministratore ti autorizzi");
                }

            }

        }


        if (sorgenteEvento.equals(BACK)) {
            String username = frame.getLoginPnl().getTextUser().getText();
            frame.getLoginPnl().getloginPanel().setVisible(false);
            frame.getHomePnl().getHomePanel().setVisible(true);

        }

    }
}

