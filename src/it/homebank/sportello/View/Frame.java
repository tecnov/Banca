package it.homebank.sportello.View;

import it.homebank.sportello.View.ActionListener.*;
import it.homebank.sportello.View.Panel.*;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    LoginPanel loginPnl = new LoginPanel();
    RegistrationPanel registrationPnl = new RegistrationPanel();
    AdministratorPanel administratorPnl = new AdministratorPanel();
    CashierPanel cashierPnl = new CashierPanel();
    CustomerPanel customerPnl = new CustomerPanel();
    PendingRequestPanel pendingRequestPnl = new PendingRequestPanel();
    HomePanel homePnl = new HomePanel();
    NewBankPanel newBankPnl = new NewBankPanel();

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

        // add all panel

        centroPnl.add(loginPnl.getLoginPanel());
        centroPnl.add(registrationPnl.getRegistrationPanel());
        centroPnl.add(administratorPnl.getAdministratorPanel());
        centroPnl.add(cashierPnl.getCashierPanel());
        centroPnl.add(homePnl.getHomePanel());
        centroPnl.add(newBankPnl.getNewBankPanel());



        rootPanel.add(centroPnl, BorderLayout.CENTER);
        rootPanel.add(sudPnl, BorderLayout.SOUTH);
        rootPanel.add(nordPnl, BorderLayout.NORTH);
        rootPanel.add(eastPnl, BorderLayout.EAST);
        view.setContentPane(rootPanel);
        view.setVisible(true);
        view.pack();







        // Action Listener

        LoginListener loginListener = new LoginListener(this);
        RegistrationListener registrationListener = new RegistrationListener(this);
        HomeListener homeListener = new HomeListener(this);
        AdministratorListener administratorListener = new AdministratorListener(this);

        loginPnl.getLogButton().addActionListener(loginListener);
        loginPnl.getLogButton().setActionCommand(loginListener.LOGIN);
        loginPnl.getBackButton().addActionListener(loginListener);
        loginPnl.getBackButton().setActionCommand(loginListener.BACK);
        registrationPnl.getBackButton().addActionListener(registrationListener);
        registrationPnl.getBackButton().setActionCommand(registrationListener.BACK);
        registrationPnl.getConfirmButton().addActionListener(registrationListener);
        registrationPnl.getConfirmButton().setActionCommand(registrationListener.CONFIRM);
        registrationPnl.getBankComboBox().addItemListener(registrationListener);
        homePnl.getLoginButton().addActionListener(homeListener);
        homePnl.getLoginButton().setActionCommand(homeListener.LOGIN);
        homePnl.getRegistrationButton().addActionListener(homeListener);
        homePnl.getRegistrationButton().setActionCommand(homeListener.REGISTRATION);
        administratorPnl.getAddNewBankButton().addActionListener(administratorListener);
        administratorPnl.getAddNewBankButton().setActionCommand(administratorListener.NEWBANKPANEL);
        newBankPnl.getConfirmButton().addActionListener(administratorListener);
        newBankPnl.getConfirmButton().setActionCommand(administratorListener.CONFIRM);
    }




    public JPanel getCentroPnl() {
        return centroPnl;
    }

    public LoginPanel getLoginPnl() {
        return loginPnl;
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


    public void setLoginPnl(LoginPanel loginPnl) {
        this.loginPnl = loginPnl;
    }

    public void setRegistrationPnl(RegistrationPanel registrationPnl) {
        this.registrationPnl = registrationPnl;
    }

    public RegistrationPanel getRegistrationPnl() {
        return registrationPnl;
    }


    public CashierPanel getCashierPnl() {
        return cashierPnl;
    }

    public void setCashierPnl(CashierPanel cashierPnl) {
        this.cashierPnl = cashierPnl;
    }

    public CustomerPanel getCustomerPnl() {
        return customerPnl;
    }

    public void setCustomerPnl(CustomerPanel customerPnl) {
        this.customerPnl = customerPnl;
    }

    public PendingRequestPanel getPendingRequestPnl() {
        return pendingRequestPnl;
    }

    public void setPendingRequestPnl(PendingRequestPanel pendingRequestPnl) {
        this.pendingRequestPnl = pendingRequestPnl;
    }

    public NewBankPanel getNewBankPnl() {
        return newBankPnl;
    }

    public void setNewBankPnl(NewBankPanel newBankPnl) {
        this.newBankPnl = newBankPnl;
    }
}
