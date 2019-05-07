package it.homebank.sportello.View.Panel;

import javax.swing.*;

public class CashierPanel {
    public JPanel cashierPanel;
    private JTextField textField1;
    private JLabel idClienteLabel;
    private JButton confirmButton;
    private JButton operationRequestsButton;


    public CashierPanel () {
        cashierPanel.getUI();
        cashierPanel.setVisible(false);
    }


    public JPanel getCashierPanel() {
        return cashierPanel;
    }

    public void setCashierPanel(JPanel cashierPanel) {
        this.cashierPanel = cashierPanel;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JLabel getIdClienteLabel() {
        return idClienteLabel;
    }

    public void setIdClienteLabel(JLabel idClienteLabel) {
        this.idClienteLabel = idClienteLabel;
    }

    public JButton getConfirmButton() {
        return confirmButton;
    }

    public void setConfirmButton(JButton confirmButton) {
        this.confirmButton = confirmButton;
    }

    public JButton getOperationRequestsButton() {
        return operationRequestsButton;
    }

    public void setOperationRequestsButton(JButton operationRequestsButton) {
        this.operationRequestsButton = operationRequestsButton;
    }
}
