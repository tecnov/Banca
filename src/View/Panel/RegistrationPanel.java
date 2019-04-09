package View.Panel;

import javax.swing.*;

public class RegistrationPanel {
    private JPanel registrationPanel;
    private JTextField textUser;
    private JTextField textPassword;
    private JButton confermaButton;
    private JTextField textField1;

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
}
