package View;

import View.ActionListener.*;
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
    TestPanel testPnl = new TestPanel();
    PendingRequestPanel pendingRequestPanel = new PendingRequestPanel();
    Home2Panel home2Panel = new Home2Panel();

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

        centroPnl.add(loginPnl.getloginPanel());
        centroPnl.add(registrationPnl.getRegistrationPanel());
        centroPnl.add(homePnl.getHomePnl());
        centroPnl.add(administratorPnl.getAdministratorPanel());
        centroPnl.add(cashierPnl.getCashierPanel());
        centroPnl.add(cashierPnl.getCashierPanel());
        centroPnl.add(testPnl.getTestPanel());
        centroPnl.add(home2Panel.getHome2Panel());




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
        TestListener testListener = new TestListener(this);
        Home2Listener home2Listener = new Home2Listener(this);

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
        testPnl.getTestButton().addActionListener(testListener);
        testPnl.getTestButton().setActionCommand(testListener.TEST);
        home2Panel.getLoginButton().addActionListener(home2Listener);
        home2Panel.getLoginButton().setActionCommand(home2Listener.LOGIN);

    }


    public Home2Panel getHome2Panel() {
        return home2Panel;
    }

    public void setHome2Panel(Home2Panel home2Panel) {
        this.home2Panel = home2Panel;
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

    public TestPanel getTestPnl() {
        return testPnl;
    }

    public void setTestPnl(TestPanel testPnl) {
        this.testPnl = testPnl;
    }

    public void setLoginPnl(LoginPanel loginPnl) {
        this.loginPnl = loginPnl;
    }

    public void setRegistrationPnl(RegistrationPanel registrationPnl) {
        this.registrationPnl = registrationPnl;
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

    public PendingRequestPanel getPendingRequestPanel() {
        return pendingRequestPanel;
    }

    public void setPendingRequestPanel(PendingRequestPanel pendingRequestPanel) {
        this.pendingRequestPanel = pendingRequestPanel;
    }
}
