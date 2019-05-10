package it.homebank.sportello.View.Panel.CustomerPanels;

import javax.swing.*;

public class CustomerPanel {

    private JPanel customerPanel;
    private JButton activatedServicesButton;
    private JButton earnedProductsButton;
    private JButton addServiceButton;
    private JButton carriedOutOperationsButton;
    private JButton buyNewProductsButton;
    private JButton transferMoneyButton;


    public CustomerPanel() {
        customerPanel.getUI();
        customerPanel.setVisible(false);
    }


    public JPanel getCustomerPanel() {
        return customerPanel;
    }

    public void setCustomerPanel(JPanel customerPanel) {
        this.customerPanel = customerPanel;
    }

    public JButton getActivatedServicesButton() {
        return activatedServicesButton;
    }

    public void setActivatedServicesButton(JButton activatedServicesButton) {
        this.activatedServicesButton = activatedServicesButton;
    }

    public JButton getEarnedProductsButton() {
        return earnedProductsButton;
    }

    public void setEarnedProductsButton(JButton earnedProductsButton) {
        this.earnedProductsButton = earnedProductsButton;
    }

    public JButton getAddServiceButton() {
        return addServiceButton;
    }

    public void setAddServiceButton(JButton addServiceButton) {
        this.addServiceButton = addServiceButton;
    }

    public JButton getCarriedOutOperationsButton() {
        return carriedOutOperationsButton;
    }

    public void setCarriedOutOperationsButton(JButton carriedOutOperationsButton) {
        this.carriedOutOperationsButton = carriedOutOperationsButton;
    }

    public JButton getBuyNewProductsButton() {
        return buyNewProductsButton;
    }

    public void setBuyNewProductsButton(JButton buyNewProductsButton) {
        this.buyNewProductsButton = buyNewProductsButton;
    }

    public JButton getTransferMoneyButton() {
        return transferMoneyButton;
    }

    public void setTransferMoneyButton(JButton transferMoneyButton) {
        this.transferMoneyButton = transferMoneyButton;
    }
}
