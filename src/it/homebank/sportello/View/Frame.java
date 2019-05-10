package it.homebank.sportello.View;

import it.homebank.sportello.View.ActionListener.*;
import it.homebank.sportello.View.Panel.AdministratorPanels.AdministratorPanel;
import it.homebank.sportello.View.Panel.AdministratorPanels.NewBankPanel;
import it.homebank.sportello.View.Panel.AdministratorPanels.PendingRequestPanel;
import it.homebank.sportello.View.Panel.AllUser.HomePanel;
import it.homebank.sportello.View.Panel.AllUser.LoginPanel;
import it.homebank.sportello.View.Panel.AllUser.RegistrationPanel;
import it.homebank.sportello.View.Panel.CashierPanels.CashierPanel;
import it.homebank.sportello.View.Panel.CustomerPanels.CustomerPanel;
import it.homebank.sportello.View.Panel.DirectorPanels.DirectorPanel;
import it.homebank.sportello.View.Panel.DirectorPanels.ProductDirPanel;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    //all user panels
    LoginPanel loginPnl = new LoginPanel();
    RegistrationPanel registrationPnl = new RegistrationPanel();
    HomePanel homePnl = new HomePanel();


    //administrator panels
    AdministratorPanel administratorPnl = new AdministratorPanel();
    PendingRequestPanel pendingRequestPnl = new PendingRequestPanel();
    NewBankPanel newBankPnl = new NewBankPanel();

    //director panels
    DirectorPanel directorPnl = new DirectorPanel();
    ProductDirPanel productDirPnl = new ProductDirPanel();


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

        // add all panels

        //all user panels
        centroPnl.add(loginPnl.getLoginPanel());
        centroPnl.add(registrationPnl.getRegistrationPanel());
        centroPnl.add(homePnl.getHomePanel());

        //adminstrator panels
        centroPnl.add(administratorPnl.getAdministratorPanel());
        centroPnl.add(newBankPnl.getNewBankPanel());
        centroPnl.add(pendingRequestPnl.getPendingRequestPanel());

        //director panels
        centroPnl.add(directorPnl.getDirectonPanel());
        centroPnl.add(productDirPnl.getProductDirPanel());

        centroPnl.add(cashierPnl.getCashierPanel());
        centroPnl.add(productDirPnl.getProductDirPanel());



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
        DirectorListener directorListener = new DirectorListener(this);

        //all users listener
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

        //administrator listener
        administratorPnl.getAddNewBankButton().addActionListener(administratorListener);
        administratorPnl.getAddNewBankButton().setActionCommand(administratorListener.NEW_BANK_PANEL);
        administratorPnl.getNewCustomerButton().addActionListener(administratorListener);
        administratorPnl.getNewCustomerButton().setActionCommand(administratorListener.PENDING_CUSTOMER);
        newBankPnl.getConfirmButton().addActionListener(administratorListener);
        newBankPnl.getConfirmButton().setActionCommand(administratorListener.CONFIRM_NEW_BANK);
        newBankPnl.getBackButton().addActionListener(administratorListener);
        newBankPnl.getBackButton().setActionCommand(administratorListener.BANK_FROM_BANK_TO_HOME);
        pendingRequestPnl.getPendingRequestComboBox().addItemListener(administratorListener);
        pendingRequestPnl.getAcceptButton().addActionListener(administratorListener);
        pendingRequestPnl.getAcceptButton().setActionCommand(administratorListener.CONFIRM_NEW_CUSTOMER);
        pendingRequestPnl.getDenyButton().addActionListener(administratorListener);
        pendingRequestPnl.getDenyButton().setActionCommand(administratorListener.DENY_NEW_CUSTOMER);
        pendingRequestPnl.getBackButton().addActionListener(administratorListener);
        pendingRequestPnl.getBackButton().setActionCommand(administratorListener.BACK_FROM_REQUEST_TO_HOME);

        //director listner
        directorPnl.getLogOutButton().addActionListener(directorListener);
        directorPnl.getLogOutButton().setActionCommand(directorListener.LOG_OUT);
        directorPnl.getNewBranchButton().addActionListener(directorListener);
        directorPnl.getNewBranchButton().setActionCommand(directorListener.NEW_BRANCH);
        directorPnl.getServicesButton().addActionListener(directorListener);
        directorPnl.getServicesButton().setActionCommand(directorListener.SERVICES);
        directorPnl.getProductsButton().addActionListener(directorListener);
        directorPnl.getProductsButton().setActionCommand(directorListener.PRODUCTS);
        productDirPnl.getConfirmNewProductButton().addActionListener(directorListener);
        productDirPnl.getConfirmNewProductButton().setActionCommand(directorListener.CONFIRM_NEW_PRODUCT);
        productDirPnl.getDeleteProductButton().addActionListener(directorListener);
        productDirPnl.getDeleteProductButton().setActionCommand(directorListener.DELETE_PRODUCT);
        productDirPnl.getProductsComboBox().addItemListener(directorListener);
        productDirPnl.getBackButton().addActionListener(directorListener);
        productDirPnl.getBackButton().setActionCommand(directorListener.BACK_FROM_PRODUCTS_TO_HOME);






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

    public DirectorPanel getDirectorPnl() {
        return directorPnl;
    }

    public void setDirectorPnl(DirectorPanel directorPnl) {
        this.directorPnl = directorPnl;
    }

    public ProductDirPanel getProductDirPnl() {
        return productDirPnl;
    }

    public void setProductDirPnl(ProductDirPanel productDirPnl) {
        this.productDirPnl = productDirPnl;
    }
}
