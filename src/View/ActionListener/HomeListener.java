package View.ActionListener;

import View.Frame;
import View.Panel.RegistrationPanel;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeListener implements ActionListener  {

    private Frame frame;
    public final static String REGISTER = "Registra";
    public final static String LOGIN = "Apri login";
    public RegistrationPanel registrationPanel = new RegistrationPanel();


    public HomeListener(View.Frame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sorgenteEvento = e.getActionCommand();

        if (sorgenteEvento.equals(REGISTER)) {
            JOptionPane.showMessageDialog(null, "è pregato di inserire i suoi dati");
            frame.getHomePnl().getHomePnl().setVisible(false);
            frame.getRegistrationPnl().getRegistrationPanel().setVisible(true);
        }

        if (sorgenteEvento.equals(LOGIN)) {
            frame.getHomePnl().getHomePnl().setVisible(false);
            frame.getLoginPnl().getloginPanel().setVisible(true);

        }
    }
}
