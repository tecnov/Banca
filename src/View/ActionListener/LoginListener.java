package View.ActionListener;

import View.Frame;
import View.Panel.LoginPanel;
import View.Panel.UserPanel;


import it.homebank.sportello.Business.AdministratorBusiness;
import it.homebank.sportello.Business.LoginBusiness;
import it.homebank.sportello.model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LoginListener implements ActionListener {


    private Frame frame;

    public UserPanel utentePnl = new UserPanel();
    public LoginPanel loginPnl = new LoginPanel();


    public LoginListener(Frame frame) {
        this.frame = frame;
    }
    private AdministratorBusiness administratorBusiness = new AdministratorBusiness();


    public final static String LOGIN = "ConfermaLogin";
    public final static String BACK = "Torna indietro";

    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if (sorgenteEvento.equals(LOGIN)) {
            String username = frame.getLoginPnl().getTextUser().getText();
            String password = frame.getLoginPnl().getTextPassword().getText();
            try {
                LoginBusiness l = new LoginBusiness();
                User user = l.login(username, password);


                if (user.getAuthorization() == 1) {
                    switch (user.getType()) {
                        case (1):
                            frame.getLoginPnl().getLoginPanel().setVisible(false);
                             frame.getAdministratorPnl().getAdministratorPanel().setVisible(true);

                            int num = administratorBusiness.numPendingRequest();
                            if (num != 0) frame.getAdministratorPnl().getNewCustomerButton().setEnabled(true);
                            frame.getAdministratorPnl().getNewCustomerButton().setText("new Customer ("+num+ ")");
                            break;

                        case (2):
                            frame.getLoginPnl().getLoginPanel().setVisible(false);
                            //TODO director panel
                            break;
                        case (3):
                            frame.getLoginPnl().getLoginPanel().setVisible(false);
                            //TODO cashier panel
                            break;
                        case (4):
                            frame.getLoginPnl().getLoginPanel().setVisible(false);
                            //TODO custoner panel
                            break;
                    }

                } else JOptionPane.showMessageDialog(null, "Attendi che l'amministratore ti autorizzi");

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Credenziali errate. Se non sei ancora cliente, registrati.");
            }
        }

        if (sorgenteEvento.equals(BACK)) {
            frame.getLoginPnl().getLoginPanel().setVisible(false);
            frame.getHomePnl().getHomePanel().setVisible(true);

        }

        }

}

