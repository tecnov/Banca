package View.ActionListen;

import View.Frame;
import it.homebank.sportello.Business.loginbusiness;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {

    private Frame frame;
    public LoginListener(Frame frame){
        this.frame = frame;
    }


    public final static String LOGIN = "Conferma loginbusiness";
    public final static String BACK = "Torna indietro";

    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if(sorgenteEvento.equals(LOGIN)) {
            String username = frame.getLoginPnl().getTextUser().getText();
            String password = frame.getLoginPnl().getTextPassword().getText();
            loginbusiness l = new loginbusiness();
                if (l.login(username, password).equals(null))
                    JOptionPane.showMessageDialog(null, "Registrati");
                else {
                    JOptionPane.showMessageDialog(null, "Vaffanculo");
                }
        }
    }
}
