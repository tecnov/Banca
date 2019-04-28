package View.Panel;

import javax.swing.*;

public class AdministratorPanel {
    public JPanel administratorPnl;

    public JButton newBankButton;
    public JButton newDirectorButton;
    public JButton newCustomerButton;
    public JTextArea number;

    public AdministratorPanel (){
        administratorPnl.getUI();
        administratorPnl.setVisible(false);
    }

    public JPanel getAdministratorPanel() {
        return administratorPnl;
    }

    public void setAdministratorPanel(JPanel administratorPanel) {
        this.administratorPnl = administratorPanel;
    }

    public JButton getAddNewBankButton() {
        return newBankButton;
    }

    public void setAddNewBankButton(JButton addNewBankButton) {
        this.newBankButton = addNewBankButton;
    }

    public JButton getNewDirectorButton() {
        return newDirectorButton;
    }

    public void setNewDirectorButton(JButton newDirectorButton) {
        this.newDirectorButton = newDirectorButton;
    }

    public JButton getNewCustomerButton() {
        return newCustomerButton;
    }

    public void setNewCustomerButton(JButton newCustomerButton) {
        this.newCustomerButton = newCustomerButton;
    }

    public JTextArea getNumber() {
        return number;
    }

    public void setNumber(JTextArea number) {
        this.number = number;
    }
}
