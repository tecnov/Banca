package it.homebank.sportello.View.Panel;

import it.homebank.sportello.model.User;

import javax.swing.*;

public class UserPanel {
    private JPanel userPnl;
    private JLabel Welcometxt;
    private User user = new User();

    public UserPanel() {
        userPnl.getUI();
        userPnl.setVisible(false);
            }

    public JPanel getUserPnl() {
        return userPnl;
    }

    public void setPanel1(JPanel panel1) {
        this.userPnl = panel1;
    }

    public JLabel getWelcometxt() {
        return Welcometxt;
    }

    public void setWelcometxt(JLabel welcometxt) {
        Welcometxt = welcometxt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}