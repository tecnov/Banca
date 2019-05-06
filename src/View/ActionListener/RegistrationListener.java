package View.ActionListener;

import View.Frame;
import it.homebank.sportello.Business.RegistrationBusiness;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.Branch;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;


public class RegistrationListener implements ActionListener, ItemListener {


    private Frame frame;


    public RegistrationListener(Frame frame) {
        this.frame = frame;
    }
    private RegistrationBusiness registrationBusiness = new RegistrationBusiness();


    public final static String CONFIRM = "confirm registration";
    public final static String BACK = "come back";

    @Override
    public void actionPerformed(ActionEvent e) {
        String sorgenteEvento = e.getActionCommand();


        if (sorgenteEvento.equals(CONFIRM)) {


            String username = frame.getRegistrationPnl().getUsernameField().getText();
            String password = frame.getRegistrationPnl().getPasswordField().getText();
            String name = frame.getRegistrationPnl().getNameField().getText();
            String surname = frame.getRegistrationPnl().getSurnameField().getText();
            String email = frame.getRegistrationPnl().getEmailField().getText();
            String branchString = (String) frame.getRegistrationPnl().getBranchComboBox().getSelectedItem();
            if (registrationBusiness.checkDuplicate(username) == false) {
                JOptionPane.showMessageDialog(null, "Username già esistente");
            } else {

                Branch branch = registrationBusiness.findBranchbyName(branchString);
                registrationBusiness.userRegistration(name, surname, username, password, email, branch);
                   JOptionPane.showMessageDialog(null, "La sua richiesta verrà analizzata dall'amministratore");

            }
        }
        if (sorgenteEvento.equals(BACK)) {
            frame.getRegistrationPnl().getRegistrationPanel().setVisible(false);
            frame.getHomePnl().getHomePanel().setVisible(true);
        }


        }

    @Override
    public void itemStateChanged(ItemEvent e) {


        if (e.getSource() == frame.getRegistrationPnl().getBankComboBox()) {

            String bankName = (String) frame.getRegistrationPnl().getBankComboBox().getSelectedItem();
            Branch s = new Branch();
            Bank b = Bank.findbyName(bankName);
            ArrayList<Branch> branches = s.findbyIdBank(b.getIdBank());
            frame.getRegistrationPnl().getBranchComboBox().removeAllItems();
            frame.getRegistrationPnl().getBranchComboBox().addItem(null);
            for (int i = 0; i < branches.size(); i++) {
                frame.getRegistrationPnl().getBranchComboBox().addItem(branches.get(i).getName());
            }
        }
    }
}
