package View;

import View.ActionListen.LoginListener;
import View.ActionListen.RegistrationListener;
import View.ActionListen.TestListener;
import View.Panel.LoginPanel;
import View.Panel.RegistrationPanel;
import View.Panel.TestPanel;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    LoginPanel loginPnl = new LoginPanel();
    RegistrationPanel registrationPnl = new RegistrationPanel();
    TestPanel testPnl = new TestPanel();

    /**
     * Serve a costruire l'interfaccia
     */
    JPanel rootPanel = new JPanel();
    JPanel nordPnl = new JPanel();
    JPanel centroPnl = new JPanel();
    JPanel sudPnl = new JPanel();
    JPanel eastPnl = new JPanel();
    JPanel westPnl = new JPanel();
    JFrame view = new JFrame();



    public Frame() {
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setPreferredSize(new Dimension(1300,700));
        view.setLocation(35,25);
        rootPanel.setLayout(new BorderLayout());

        //TODO aggiungere tutti i pannelli

        centroPnl.add(loginPnl.getloginPanel());
        centroPnl.add(registrationPnl.getRegistrationPanel());
        centroPnl.add(testPnl.getTestPanel());


        rootPanel.add(centroPnl, BorderLayout.CENTER);
        rootPanel.add(sudPnl, BorderLayout.SOUTH);
        rootPanel.add(nordPnl, BorderLayout.NORTH);
        rootPanel.add(eastPnl, BorderLayout.EAST);
        rootPanel.add(westPnl, BorderLayout.WEST);
        view.setContentPane(rootPanel);
        view.setVisible(true);
        view.pack();







        //TODO Action Listener

        LoginListener loginListener = new LoginListener(this);
        RegistrationListener registrationListener = new RegistrationListener(this);
        TestListener testListener = new TestListener(this);

        loginPnl.getConfermaButton().addActionListener(loginListener);
        loginPnl.getConfermaButton().setActionCommand(loginListener.LOGIN);
        loginPnl.getRegistratiButton().addActionListener(loginListener);
        loginPnl.getRegistratiButton().setActionCommand(loginListener.REGISTER);
        testPnl.getTestButton().addActionListener(testListener);
        testPnl.getTestButton().setActionCommand(testListener.TEST);
    }




    public JPanel getCentroPnl() {
        return centroPnl;
    }

    public LoginPanel getLoginPnl() {
        return loginPnl;
    }
    public RegistrationPanel getRegistrationPnl() {
        return registrationPnl;
    }

    public void show() {
        view.setVisible(true);
    }
}
