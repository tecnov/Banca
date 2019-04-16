package View.Panel;

import javax.swing.*;

public class TestPanel {
    private JPanel testPanel;
    private JButton testButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public TestPanel() {
        testPanel.getUI();
        testPanel.setVisible(true);
    }


    public JPanel getTestPanel() {
        return testPanel;
    }

    public void setTestPanel(JPanel testPanel) {
        this.testPanel = testPanel;
    }

    public JButton getTestButton() {
        return testButton;
    }

    public void setTestButton(JButton testButton) {
        this.testButton = testButton;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }
}
