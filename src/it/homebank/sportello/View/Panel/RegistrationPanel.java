package it.homebank.sportello.View.Panel;

import javax.swing.*;

public class RegistrationPanel {
    private JPanel registrationPanel;
    private JTextField usernameField;
    private JTextField nameField;
    private JPasswordField passwordField;
    private JTextField surnameField;
    private JTextField emailField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel emailLabel;
    private JComboBox bankComboBox;
    private JLabel bankLabel;
    private JComboBox branchComboBox;
    private JLabel branchLabel;
    private JButton confirmButton;
    private JButton backButton;

    public RegistrationPanel() {
        registrationPanel.getUI();
        registrationPanel.setVisible(false);
    }


    public JPanel getRegistrationPanel() {
        return registrationPanel;
    }

    public void setRegistrationPanel(JPanel registrationPanel) {
        this.registrationPanel = registrationPanel;
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(JTextField usernameField) {
        this.usernameField = usernameField;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public void setNameField(JTextField nameField) {
        this.nameField = nameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JTextField getSurnameField() {
        return surnameField;
    }

    public void setSurnameField(JTextField surnameField) {
        this.surnameField = surnameField;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public void setEmailField(JTextField emailField) {
        this.emailField = emailField;
    }

    public JLabel getUsernameLabel() {
        return usernameLabel;
    }

    public void setUsernameLabel(JLabel usernameLabel) {
        this.usernameLabel = usernameLabel;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JLabel getSurnameLabel() {
        return surnameLabel;
    }

    public void setSurnameLabel(JLabel surnameLabel) {
        this.surnameLabel = surnameLabel;
    }

    public JLabel getEmailLabel() {
        return emailLabel;
    }

    public void setEmailLabel(JLabel emailLabel) {
        this.emailLabel = emailLabel;
    }

    public JComboBox getBankComboBox() {
        return bankComboBox;
    }

    public void setBankComboBox(JComboBox bankComboBox) {
        this.bankComboBox = bankComboBox;
    }

    public JLabel getBankLabel() {
        return bankLabel;
    }

    public void setBankLabel(JLabel bankLabel) {
        this.bankLabel = bankLabel;
    }

    public JComboBox getBranchComboBox() {
        return branchComboBox;
    }

    public void setBranchComboBox(JComboBox branchComboBox) {
        this.branchComboBox = branchComboBox;
    }

    public JLabel getBranchLabel() {
        return branchLabel;
    }

    public void setBranchLabel(JLabel branchLabel) {
        this.branchLabel = branchLabel;
    }

    public JButton getConfirmButton() {
        return confirmButton;
    }

    public void setConfirmButton(JButton confirmButton) {
        this.confirmButton = confirmButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }
}
