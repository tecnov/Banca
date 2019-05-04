package View.Panel;

import javax.swing.*;

public class RegistrationPanel {
    public JPanel registrationPanel;
    public JTextField textUsername;
    public JTextField textPassword;
    public JTextField textSurname;
    public JTextField textEmail;
    public JTextField textBranchString;
    public JTextField textName;
    public JButton completeButton;
    public JButton backButton;
    JPanel nordPnl = new JPanel();
    JPanel centerPnl = new JPanel();
    JPanel southPnl = new JPanel();

    public RegistrationPanel() {
        registrationPanel.getUI();
        registrationPanel.setVisible(true);
    }

    public JPanel getRegistrationPanel() {
        return registrationPanel;
    }

    public void setRegistrationPanel(JPanel registrationPanel) {
        this.registrationPanel = registrationPanel;
    }

    public JTextField getTextUsername() {
        return textUsername;
    }

    public void setTextUsername(JTextField textUsername) {
        this.textUsername = textUsername;
    }

    public JTextField getTextPassword() {
        return textPassword;
    }

    public void setTextPassword(JTextField textPassword) {
        this.textPassword = textPassword;
    }

    public JButton getConfermaButton() {
        return completeButton;
    }

    public void setConfermaButton(JButton confermaButton) {
        this.completeButton = confermaButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JTextField getTextSurname() {
        return textSurname;
    }

    public void setTextSurname(JTextField textSurname) {
        this.textSurname = textSurname;
    }

    public JTextField getTextEmail() {
        return textEmail;
    }

    public void setTextEmail(JTextField textEmail) {
        this.textEmail = textEmail;
    }

    public void setTextBranchString(JTextField textBranchString) {
        this.textBranchString = textBranchString;
    }

    public JTextField getTextName() {
        return textName;
    }

    public void setTextName(JTextField textName) {
        this.textName = textName;
    }

    public JTextField getTextBranchString() {
        return textBranchString;
    }
}
