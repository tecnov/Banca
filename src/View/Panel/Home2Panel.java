package View.Panel;

import javax.swing.*;

public class Home2Panel {
    public JPanel home2Panel;
    private JComboBox allBank;
    private JComboBox branchOfBank;
    private JButton loginButton;
    private JButton registrationButton;
    private JLabel jLabelBank;
    private JLabel jLabelBranch;

    public Home2Panel() {
       home2Panel.getUI();
        home2Panel.setVisible(true);

    }

    public JPanel getHome2Panel() {
        return home2Panel;
    }

    public void setHome2Panel(JPanel home2Panel) {
        this.home2Panel = home2Panel ;
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
