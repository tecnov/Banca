package View.Panel;

import javax.swing.*;

public class loginPanel {
    private JPanel loginPanel;
    private JTextField textUser;
    private JTextField textPassword;
    private JButton confermaButton;
    private JButton registratiButton;



    public loginPanel() {
        loginPanel.getUI();
        loginPanel.setVisible(true);
    }

    public JPanel getloginPanel() {
        return loginPanel;
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public void setLoginPanel(JPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    public JTextField getTextUser() {
        return textUser;
    }

    public void setTextUser(JTextField textUser) {
        this.textUser = textUser;
    }

    public JTextField getTextPassword() {
        return textPassword;
    }

    public void setTextPassword(JTextField textPassword) {
        this.textPassword = textPassword;
    }

    public JButton getConfermaButton() {
        return confermaButton;
    }

    public void setConfermaButton(JButton confermaButton) {
        this.confermaButton = confermaButton;
    }

    public JButton getRegistratiButton() {
        return registratiButton;
    }

    public void setRegistratiButton(JButton registratiButton) {
        this.registratiButton = registratiButton;
    }
}
