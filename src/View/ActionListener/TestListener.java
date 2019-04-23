package View.ActionListen;

import View.Frame;
import View.Panel.TestPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TestListener implements ActionListener {


    private Frame frame;

    public TestPanel testPanel = new TestPanel();

    public TestListener(Frame frame) {
        this.frame = frame;
    }


    public final static String TEST = "Testalo";


    @Override
    public void actionPerformed(ActionEvent e) {
        String sorgenteEvento = e.getActionCommand();
        if (sorgenteEvento.equals(TEST)) {

        }
    }
}
