package View;

import View.ActionListen.LoginListener;
import View.Panel.loginPanel;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    loginPanel loginPnl = new loginPanel();


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



        rootPanel.add(centroPnl, BorderLayout.CENTER);
        rootPanel.add(sudPnl, BorderLayout.SOUTH);
        rootPanel.add(nordPnl, BorderLayout.NORTH);
        rootPanel.add(eastPnl, BorderLayout.EAST);
        rootPanel.add(westPnl, BorderLayout.WEST);
        view.setContentPane(rootPanel);
        view.setVisible(true);
        view.pack();







        //TODO Action Listener

        LoginListener login = new LoginListener(this);

        loginPnl.getConfermaButton().addActionListener(login);
        loginPnl.getConfermaButton().setActionCommand(login.LOGIN);
        loginPnl.getRegistratiButton().addActionListener(login);
        loginPnl.getRegistratiButton().setActionCommand(login.REGISTER);
    }




    public JPanel getCentroPnl() {
        return centroPnl;
    }

    public loginPanel getLoginPnl() {
        return loginPnl;
    }

    public void show() {
        view.setVisible(true);
    }
}
