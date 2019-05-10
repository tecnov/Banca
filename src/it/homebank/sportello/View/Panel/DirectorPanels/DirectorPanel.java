package it.homebank.sportello.View.Panel.DirectorPanels;

import javax.swing.*;

public class DirectorPanel {
    private JPanel directonPanel;
    private JButton newBranchButton;
    private JButton productsButton;
    private JButton servicesButton;
    private JButton logOutButton;

    public DirectorPanel() {
        directonPanel.getUI();
        directonPanel.setVisible(false);

    }

    public JPanel getDirectonPanel() {
        return directonPanel;
    }

    public void setDirectonPanel(JPanel directonPanel) {
        this.directonPanel = directonPanel;
    }

    public JButton getNewBranchButton() {
        return newBranchButton;
    }

    public void setNewBranchButton(JButton newBranchButton) {
        this.newBranchButton = newBranchButton;
    }

    public JButton getProductsButton() {
        return productsButton;
    }

    public void setProductsButton(JButton productsButton) {
        this.productsButton = productsButton;
    }

    public JButton getServicesButton() {
        return servicesButton;
    }

    public void setServicesButton(JButton servicesButton) {
        this.servicesButton = servicesButton;
    }

    public JButton getLogOutButton() {
        return logOutButton;
    }

    public void setLogOutButton(JButton logOutButton) {
        this.logOutButton = logOutButton;
    }
}
