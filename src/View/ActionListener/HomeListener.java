package View.ActionListener;

import View.Frame;
import it.homebank.sportello.Business.RegistrationBusiness;
import it.homebank.sportello.model.Bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class HomeListener implements ActionListener {
    private Frame frame;

    public HomeListener(Frame frame) {
        this.frame = frame;
    }
    private RegistrationBusiness registrationBusiness = new RegistrationBusiness();


    public final static String LOGIN = "Login";
    public final static String REGISTRATION = "new registration";


    @Override
    public void actionPerformed(ActionEvent e) {


        String sorgenteEvento = e.getActionCommand();


        if (sorgenteEvento.equals(REGISTRATION)) {
            frame.getHomePnl().getAllBank().removeAllItems();
            Bank bank = new Bank();
            ArrayList<Bank> banks = bank.findAll();
            frame.getRegistrationPnl().getBankComboBox().addItem(null);
            for (int i = 0; i < banks.size(); i++) {
                frame.getRegistrationPnl().getBankComboBox().addItem(banks.get(i).getName());
            }

            frame.getHomePnl().getHomePanel().setVisible(false);
            frame.getRegistrationPnl().getRegistrationPanel().setVisible(true);

        }

        if (sorgenteEvento.equals(LOGIN)) {
            frame.getHomePnl().getHomePanel().setVisible(false);
            frame.getLoginPnl().getLoginPanel().setVisible(true);
        }


        }

}

