package it.homebank.sportello.View.Panel.AdministratorPanels;

import javax.swing.*;

public class NewBankPanel {   //gestito dal AdministratorListener
    public JPanel newBankPanel;
    private JLabel insertUsernameLabel;
    private JLabel insertPasswordLabel;
    private JLabel insertNameLabel;
    private JLabel insertSurnameLabel;
    private JLabel insertEmailLabel;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JTextField nameTextField;
    private JTextField surnameTextField;
    private JTextField emailTextField;
    private JLabel insertNameBankLabel;
    private JTextField nameBankTextField;
    private JTextField addressBankTextField;
    private JTextField descriptionBankTextField;
    private JTextField photoBankTextField;
    private JTextField branchNameTextField;
    private JTextField addressBranchTextField;
    private JTextField scheduleTextField;
    private JTextField photoBranchTextField;
    private JLabel directorLabel;
    private JLabel bankLabel;
    private JLabel branchLabel;
    private JButton confirmButton;
    private JButton backButton;


    public NewBankPanel() {
        newBankPanel.getUI();
        newBankPanel.setVisible(false);
    }

    public JPanel getNewBankPanel() {
        return newBankPanel;
    }

    public void setNewBankPanel(JPanel newBankPanel) {
        this.newBankPanel = newBankPanel;
    }

    public JLabel getInsertUsernameLabel() {
        return insertUsernameLabel;
    }

    public void setInsertUsernameLabel(JLabel insertUsernameLabel) {
        this.insertUsernameLabel = insertUsernameLabel;
    }

    public JLabel getInsertPasswordLabel() {
        return insertPasswordLabel;
    }

    public void setInsertPasswordLabel(JLabel insertPasswordLabel) {
        this.insertPasswordLabel = insertPasswordLabel;
    }

    public JLabel getInsertNameLabel() {
        return insertNameLabel;
    }

    public void setInsertNameLabel(JLabel insertNameLabel) {
        this.insertNameLabel = insertNameLabel;
    }

    public JLabel getInsertSurnameLabel() {
        return insertSurnameLabel;
    }

    public void setInsertSurnameLabel(JLabel insertSurnameLabel) {
        this.insertSurnameLabel = insertSurnameLabel;
    }

    public JLabel getInsertEmailLabel() {
        return insertEmailLabel;
    }

    public void setInsertEmailLabel(JLabel insertEmailLabel) {
        this.insertEmailLabel = insertEmailLabel;
    }

    public JTextField getUsernameTextField() {
        return usernameTextField;
    }

    public void setUsernameTextField(JTextField usernameTextField) {
        this.usernameTextField = usernameTextField;
    }

    public JTextField getPasswordTextField() {
        return passwordTextField;
    }

    public void setPasswordTextField(JTextField passwordTextField) {
        this.passwordTextField = passwordTextField;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public JTextField getSurnameTextField() {
        return surnameTextField;
    }

    public void setSurnameTextField(JTextField surnameTextField) {
        this.surnameTextField = surnameTextField;
    }

    public JTextField getEmailTextField() {
        return emailTextField;
    }

    public void setEmailTextField(JTextField emailTextField) {
        this.emailTextField = emailTextField;
    }

    public JLabel getInsertNameBankLabel() {
        return insertNameBankLabel;
    }

    public void setInsertNameBankLabel(JLabel insertNameBankLabel) {
        this.insertNameBankLabel = insertNameBankLabel;
    }

    public JTextField getNameBankTextField() {
        return nameBankTextField;
    }

    public void setNameBankTextField(JTextField nameBankTextField) {
        this.nameBankTextField = nameBankTextField;
    }

    public JTextField getAddressBankTextField() {
        return addressBankTextField;
    }

    public void setAddressBankTextField(JTextField addressBankTextField) {
        this.addressBankTextField = addressBankTextField;
    }

    public JTextField getDescriptionBankTextField() {
        return descriptionBankTextField;
    }

    public void setDescriptionBankTextField(JTextField descriptionBankTextField) {
        this.descriptionBankTextField = descriptionBankTextField;
    }

    public JTextField getPhotoBankTextField() {
        return photoBankTextField;
    }

    public void setPhotoBankTextField(JTextField photoBankTextField) {
        this.photoBankTextField = photoBankTextField;
    }

    public JTextField getBranchNameTextField() {
        return branchNameTextField;
    }

    public void setBranchNameTextField(JTextField branchNameTextField) {
        this.branchNameTextField = branchNameTextField;
    }

    public JTextField getAddressBranchTextField() {
        return addressBranchTextField;
    }

    public void setAddressBranchTextField(JTextField addressBranchTextField) {
        this.addressBranchTextField = addressBranchTextField;
    }

    public JTextField getScheduleTextField() {
        return scheduleTextField;
    }

    public void setScheduleTextField(JTextField scheduleTextField) {
        this.scheduleTextField = scheduleTextField;
    }

    public JTextField getPhotoBranchTextField() {
        return photoBranchTextField;
    }

    public void setPhotoBranchTextField(JTextField photoBranchTextField) {
        this.photoBranchTextField = photoBranchTextField;
    }

    public JLabel getDirectorLabel() {
        return directorLabel;
    }

    public void setDirectorLabel(JLabel directorLabel) {
        this.directorLabel = directorLabel;
    }

    public JLabel getBankLabel() {
        return bankLabel;
    }

    public void setBankLabel(JLabel bankLabel) {
        this.bankLabel = bankLabel;
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
