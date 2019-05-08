package it.homebank.sportello.View.Panel.AllUser;

import javax.swing.*;

public class HomePanel {
    public JPanel homePanel;
    private JComboBox allBank;
    private JComboBox branchOfBank;
    private JButton loginButton;
    private JButton registrationButton;
    private JLabel jLabelBank;
    private JLabel jLabelBranch;

    public HomePanel() {
       homePanel.getUI();
        homePanel.setVisible(true);

    }

    public JPanel getHomePanel() {
        return homePanel;
    }

    public void setHomePanel(JPanel homePanel) {
        this.homePanel = homePanel;
    }

    public JComboBox getAllBank() {
        return allBank;
    }

    public void setAllBank(JComboBox allBank) {
        this.allBank = allBank;
    }

    public JComboBox getBranchOfBank() {
        return branchOfBank;
    }

    public void setBranchOfBank(JComboBox branchOfBank) {
        this.branchOfBank = branchOfBank;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JButton getRegistrationButton() {
        return registrationButton;
    }

    public void setRegistrationButton(JButton registrationButton) {
        this.registrationButton = registrationButton;
    }

    public JLabel getjLabelBank() {
        return jLabelBank;
    }

    public void setjLabelBank(JLabel jLabelBank) {
        this.jLabelBank = jLabelBank;
    }

    public JLabel getjLabelBranch() {
        return jLabelBranch;
    }

    public void setjLabelBranch(JLabel jLabelBranch) {
        this.jLabelBranch = jLabelBranch;
    }
}
