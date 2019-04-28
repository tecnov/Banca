package View;

import View.ActionListener.HomeListener;
import View.ActionListener.LoginListener;
import View.ActionListener.RegistrationListener;
import View.Panel.*;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    HomePanel homePnl = new HomePanel();
    LoginPanel loginPnl = new LoginPanel();
    RegistrationPanel registrationPnl = new RegistrationPanel();
    AdministratorPanel administratorPnl = new AdministratorPanel();
    CashierPanel cashierPnl = new CashierPanel();
    CustomerPanel customerPnl = new CustomerPanel();

    /**
     * Serve a costruire l'interfaccia
     */
    JPanel rootPanel = new JPanel();
    JPanel nordPnl = new JPanel();
    JPanel centroPnl = new JPanel();
    JPanel eastPnl = new JPanel();
    JPanel sudPnl = new JPanel();
    JFrame view = new JFrame();



    public Frame() {
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setPreferredSize(new Dimension(1300,700));
        view.setLocation(35,25);
        rootPanel.setLayout(new BorderLayout());

        //TODO aggiungere tutti i pannelli

        centroPnl.add(loginPnl.getloginPanel());
        centroPnl.add(registrationPnl.getRegistrationPanel());
        centroPnl.add(homePnl.getHomePnl());
        centroPnl.add(administratorPnl.getAdministratorPanel());
        centroPnl.add(cashierPnl.getCashierPanel());
        centroPnl.add(cashierPnl.getCashierPanel());



        rootPanel.add(centroPnl, BorderLayout.CENTER);
        rootPanel.add(sudPnl, BorderLayout.SOUTH);
        rootPanel.add(nordPnl, BorderLayout.NORTH);
        rootPanel.add(eastPnl, BorderLayout.EAST);
        view.setContentPane(rootPanel);
        view.setVisible(true);
        view.pack();







        //TODO Action Listener

        LoginListener loginListener = new LoginListener(this);
        RegistrationListener registrationListener = new RegistrationListener(this);
        HomeListener homeListener = new HomeListener(this);
        loginPnl.getConfermaButton().addActionListener(loginListener);
        loginPnl.getConfermaButton().setActionCommand(loginListener.LOGIN);
        loginPnl.getBackButton().addActionListener(loginListener);
        loginPnl.getBackButton().setActionCommand(loginListener.BACK);
        registrationPnl.getBackButton().addActionListener(registrationListener);
        registrationPnl.getBackButton().setActionCommand(registrationListener.BACK);
        homePnl.getRegistrationButton().addActionListener(homeListener);
        homePnl.getRegistrationButton().setActionCommand(homeListener.REGISTER);
        homePnl.getLoginButton().addActionListener(homeListener);
        homePnl.getLoginButton().setActionCommand(homeListener.LOGIN);

    }




    public JPanel getCentroPnl() {
        return centroPnl;
    }

    public LoginPanel getLoginPnl() {
        return loginPnl;
    }
    public RegistrationPanel getRegistrationPnl() {
        return registrationPnl;
    }

    public void show() {
        view.setVisible(true);
    }

    public HomePanel getHomePnl() {
        return homePnl;
    }

    public void setHomePnl(HomePanel homePnl) {
        this.homePnl = homePnl;
    }

    public AdministratorPanel getAdministratorPnl() {
        return administratorPnl;
    }

    public void setAdministratorPnl(AdministratorPanel administratorPnl) {
        this.administratorPnl = administratorPnl;
    }
}
