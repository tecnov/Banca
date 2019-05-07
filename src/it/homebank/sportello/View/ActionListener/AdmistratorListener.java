package it.homebank.sportello.View.ActionListener;

import it.homebank.sportello.Business.RegistrationBusiness;
import it.homebank.sportello.View.Frame;
import it.homebank.sportello.Business.AdministratorBusiness;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdmistratorListener implements ActionListener {
    private Frame frame;



    public AdmistratorListener(Frame frame) {
        this.frame = frame;
    }

    private AdministratorBusiness administratorBusiness = new AdministratorBusiness();

        //first panel
    public final static String NEWBANKPANEL = "new bank panel";
    public final static String PENDINGCUSTOMER = "pending customer";
    public final static  String CONFIRM = "confirm new bank";
    public final static String BACKB2H = "banck from bank to home";


    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if (sorgenteEvento.equals(PENDINGCUSTOMER)) {
            ArrayList<User> pendingUser = administratorBusiness.pendingUser();
        }//

        if (sorgenteEvento.equals(NEWBANKPANEL)){
            frame.getAdministratorPnl().getAdministratorPanel().setVisible(false);
            frame.getNewBankPnl().getNewBankPanel().setVisible(true);
        }//

        if (sorgenteEvento.equals(CONFIRM)){

            Bank bank = new Bank();

            AdministratorBusiness administratorBusiness = new AdministratorBusiness();
            RegistrationBusiness registrationBusiness = new RegistrationBusiness();

            String nameBank = frame.getNewBankPnl().getNameBankTextField().getText();
            String addressBank = frame.getNewBankPnl().getAddressBankTextField().getText();
            String descriptionBank = frame.getNewBankPnl().getDescriptionBankTextField().getText();
            String photoPathBank = frame.getNewBankPnl().getPhotoBankTextField().getText();

            if (registrationBusiness.checkDuplicateBankName(nameBank) == false) {
                JOptionPane.showMessageDialog(null, "Nome della banca già esistente");
            } else { bank = administratorBusiness.createNewBank(nameBank, addressBank, descriptionBank, photoPathBank);}


            String nameBrach = frame.getNewBankPnl().getBranchNameTextField().getText();
            String addressBranch = frame.getNewBankPnl().getAddressBranchTextField().getText();
            String scheduleBranch = frame.getNewBankPnl().getScheduleTextField().getText();
            String photoBranch = frame.getNewBankPnl().getPhotoBranchTextField().getText();

            administratorBusiness.createBranchBank(nameBrach, addressBranch, scheduleBranch, photoBranch, bank);



            String username = frame.getNewBankPnl().getUsernameTextField().getText();
            String password = frame.getNewBankPnl().getPasswordTextField().getText();
            String name = frame.getNewBankPnl().getNameTextField().getText();
            String surname = frame.getNewBankPnl().getSurnameTextField().getText();
            String email = frame.getNewBankPnl().getEmailTextField().getText();

            administratorBusiness.newDirector(username, password, name, surname, email);
        }


    }
}
