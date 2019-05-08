package it.homebank.sportello.View.Panel.AllUser;

import javax.swing.*;

public class LoginPanel {
    public JPanel loginPanel;
    public JTextField textPassword;
    public JTextField textUsername;
    public JButton logButton;
    public JButton backButton;


    public LoginPanel() {
        loginPanel.getUI();
        loginPanel.setVisible(false);
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public void setLoginPanel(JPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    public JTextField getTextUser() {
        return textUsername;
    }

    public void setTextUser(JTextField textUsername) {
        this.textUsername= textUsername;
    }

    public JTextField getTextPassword() {
        return textPassword;
    }

    public void setTextPassword(JTextField textPassword) {
        this.textPassword = textPassword;
    }

    public JButton getLogButton() {
        return logButton;
    }

    public void setLogButton(JButton logButton) {
        this.logButton = logButton;
    }


    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }
}
