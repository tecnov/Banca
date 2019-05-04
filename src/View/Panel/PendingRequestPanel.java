package View.Panel;

import javax.swing.*;

public class PendingRequestPanel {
    private JPanel pendingRequestPanel;
    private JComboBox pendingRequestComboBox;
    private JButton acceptButton;
    private JButton denyButton;

    public PendingRequestPanel() {
        pendingRequestPanel.getUI();
        pendingRequestPanel.setVisible(false);

    }

    public JPanel getPendingRequestPanel() {
        return pendingRequestPanel;
    }

    public void setPendingRequestPanel(JPanel pendingRequestPanel) {
        this.pendingRequestPanel = pendingRequestPanel;
    }

    public JComboBox getPendingRequestComboBox() {
        return pendingRequestComboBox;
    }

    public void setPendingRequestComboBox(JComboBox pendingRequestComboBox) {
        this.pendingRequestComboBox = pendingRequestComboBox;
    }

    public JButton getAcceptButton() {
        return acceptButton;
    }

    public void setAcceptButton(JButton acceptButton) {
        this.acceptButton = acceptButton;
    }

    public JButton getDenyButton() {
        return denyButton;
    }

    public void setDenyButton(JButton denyButton) {
        this.denyButton = denyButton;
    }
}



