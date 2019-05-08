package it.homebank.sportello.View.Panel.AdministratorPanels;

import javax.swing.*;

public class PendingRequestPanel {
    private JPanel pendingRequestPanel;
    private JComboBox pendingRequestComboBox;
    private JButton acceptButton;
    private JButton denyButton;
    private JLabel customersLabel;
    private JTextArea userInformationTextArea;
    private JButton BackButton;


    public PendingRequestPanel() {
        pendingRequestPanel.getUI();
        pendingRequestPanel.setVisible(false);

    }

    public JPanel getPendingRequestPanel() {
        return pendingRequestPanel;
    }

    public void setPendingRequestPanel(JPanel pendingRequestPanel) {
        this.pendingRequestPanel = pendingRequestPanel;
    }

    public JComboBox getPendingRequestComboBox() {
        return pendingRequestComboBox;
    }

    public void setPendingRequestComboBox(JComboBox pendingRequestComboBox) {
        this.pendingRequestComboBox = pendingRequestComboBox;
    }

    public JButton getAcceptButton() {
        return acceptButton;
    }

    public void setAcceptButton(JButton acceptButton) {
        this.acceptButton = acceptButton;
    }

    public JButton getDenyButton() {
        return denyButton;
    }

    public void setDenyButton(JButton denyButton) {
        this.denyButton = denyButton;
    }

    public JLabel getCustomersLabel() {
        return customersLabel;
    }

    public void setCustomersLabel(JLabel customersLabel) {
        this.customersLabel = customersLabel;
    }

    public JTextArea getUserInformationTextArea() {
        return userInformationTextArea;
    }

    public JButton getBackButton() {
        return BackButton;
    }

    public void setBackButton(JButton backButton) {
        BackButton = backButton;
    }

    public void setUserInformationTextArea(JTextArea userInformationTextArea) {
        this.userInformationTextArea = userInformationTextArea;

    }
}





