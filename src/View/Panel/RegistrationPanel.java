package View.Panel;

import javax.swing.*;

public class RegistrationPanel {
    public JPanel registrationPanel;
    public JTextField textUser;
    public JTextField textPassword;
    public JButton confermaButton;
    public JButton backButton;
    public JTextField textName;
    JPanel nordPnl = new JPanel();
    JPanel centerPnl = new JPanel();
    JPanel southPnl = new JPanel();

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

    public JTextField getTextName() {
        return textName;
    }

    public void setTextName(JTextField textName) {
        this.textName = textName;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }
}
