package View.ActionListener;

import View.Frame;
import View.Panel.Home2Panel;
import it.homebank.sportello.DAO.BankDAO;
import it.homebank.sportello.model.Bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Home2Listener implements ActionListener {
    private Frame frame;

    public Home2Listener(Frame frame) {
        this.frame = frame;
    }

    public final static String LOGIN = "Login";
    public final static String REGISTRATION = "new registration";


    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        frame.getHome2Panel().getAllBank().removeAllItems();
        Bank bank = new Bank();
        ArrayList <Bank> banki = bank.findAll() ;
        for (int i = 0; i < banki.size(); i++) {
            frame.getHome2Panel().getAllBank().addItem(banki.get(i).getName());
        }

        if (sorgenteEvento.equals(LOGIN)) {
        }

    }
}
