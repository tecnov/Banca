package it.homebank.sportello.View.ActionListener;

import it.homebank.sportello.Business.RegistrationBusiness;
import it.homebank.sportello.View.Frame;
import it.homebank.sportello.Business.AdministratorBusiness;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class AdministratorListener implements ActionListener, ItemListener {


    private Frame frame;


    public AdministratorListener(Frame frame) {
        this.frame = frame;
    }

    private AdministratorBusiness administratorBusiness = new AdministratorBusiness();

        //first panel
    public final static String NEW_BANK_PANEL = "new bank panel";
    public final static String PENDING_CUSTOMER = "pending customer";
        //Bank Panel
    public final static  String CONFIRM_NEW_BANK = "confirm new bank";
    public final static String BANK_FROM_BANK_TO_HOME = "bank from bank to home";

        //Request customer
    public final static  String CONFIRM_NEW_CUSTOMER = "confirm new customer";
    public final static  String DENY_NEW_CUSTOMER = "deny new customer";
    public final static  String BACK_FROM_REQUEST_TO_HOME = "back from request to home";



    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if (sorgenteEvento.equals(PENDING_CUSTOMER)) {//va al pannello per l'accettaizne degli utenti
            frame.getPendingRequestPnl().getPendingRequestComboBox().removeAll();
            ArrayList<User> pendingUsers = administratorBusiness.pendingUser();
            frame.getPendingRequestPnl().getPendingRequestComboBox().addItem(null);

            for (int i = 0; i < pendingUsers.size(); i++) {
                frame.getPendingRequestPnl().getPendingRequestComboBox().addItem(""+pendingUsers.get(i).getName()+ " "+ pendingUsers.get(i).getSurname());
            }
            frame.getAdministratorPnl().getAdministratorPanel().setVisible(false);
            frame.getPendingRequestPnl().getPendingRequestPanel().setVisible(true);
        }//va al pannello per l'accettaizne degli utenti

        if (sorgenteEvento.equals(NEW_BANK_PANEL)){ // va al pannello creazione di nuove banche
            frame.getAdministratorPnl().getAdministratorPanel().setVisible(false);
            frame.getNewBankPnl().getNewBankPanel().setVisible(true);
        }// va al pannello creazione di nuove banche

        if (sorgenteEvento.equals(CONFIRM_NEW_BANK)) { //conferma nuova banca con direttore e prima filiale


            AdministratorBusiness administratorBusiness = new AdministratorBusiness();
            RegistrationBusiness registrationBusiness = new RegistrationBusiness();
            String nameBank = frame.getNewBankPnl().getNameBankTextField().getText();
            String addressBank = frame.getNewBankPnl().getAddressBankTextField().getText();
            String descriptionBank = frame.getNewBankPnl().getDescriptionBankTextField().getText();
            String photoPathBank = frame.getNewBankPnl().getPhotoBankTextField().getText();

            if (!registrationBusiness.checkDuplicateBankName(nameBank))
                JOptionPane.showMessageDialog(null, "Nome della banca già esistente");
            else if (nameBank.equals(null)) JOptionPane.showMessageDialog(null, "Inserisci il nome della banca");
            //TODO aggiungi else if per i campi vuoti anche dopo

            else administratorBusiness.createNewBank(nameBank, addressBank, descriptionBank, photoPathBank);


            String nameBrach = frame.getNewBankPnl().getBranchNameTextField().getText();
            String addressBranch = frame.getNewBankPnl().getAddressBranchTextField().getText();
            String scheduleBranch = frame.getNewBankPnl().getScheduleTextField().getText();
            String photoBranch = frame.getNewBankPnl().getPhotoBranchTextField().getText();
            Bank bank =  Bank.findbyName(nameBank);
            administratorBusiness.createBranchBank(nameBrach, addressBranch, scheduleBranch, photoBranch, bank);

            String username = frame.getNewBankPnl().getUsernameTextField().getText();
            String password = frame.getNewBankPnl().getPasswordTextField().getText();
            String name = frame.getNewBankPnl().getNameTextField().getText();
            String surname = frame.getNewBankPnl().getSurnameTextField().getText();
            String email = frame.getNewBankPnl().getEmailTextField().getText();
            Branch branch = Branch.findbyName(nameBrach);

            if (!registrationBusiness.checkDuplicateUsername(username)) {
                JOptionPane.showMessageDialog(null, "Username già esistente");
            } else {
                administratorBusiness.newDirector(username, password, name, surname, email, branch);
            }
        }//conferma nuova banca con direttore e prima filiale



        if (sorgenteEvento.equals(BANK_FROM_BANK_TO_HOME)){ //torna dal pannello nuova banca al pannello del direttore
            int num = administratorBusiness.numPendingRequest();
            if (num != 0) frame.getAdministratorPnl().getNewCustomerButton().setEnabled(true);
            frame.getAdministratorPnl().getNewCustomerButton().setText("new Customer ("+num+ ")");

            frame.getAdministratorPnl().getAdministratorPanel().setVisible(true);
            frame.getNewBankPnl().getNewBankPanel().setVisible(false);

        }//torna dal pannello nuova banca al pannello del amminsitratore

        if (sorgenteEvento.equals(CONFIRM_NEW_CUSTOMER)){ //assegna autorizzazioni
            int i =frame.getPendingRequestPnl().getPendingRequestComboBox().getSelectedIndex() -1 ;
            ArrayList<User> pendingUser = administratorBusiness.pendingUser();
            User selectedPendingUser = pendingUser.get(i);
            administratorBusiness.authorizazion(selectedPendingUser, true);

           // frame.getPendingRequestPnl().getPendingRequestComboBox().setSelectedIndex(-1);
            frame.getPendingRequestPnl().getPendingRequestComboBox().removeAllItems();
            frame.getPendingRequestPnl().getUserInformationTextArea().setText(null);

            ArrayList<User> pendingUsers = administratorBusiness.pendingUser();
            frame.getPendingRequestPnl().getPendingRequestComboBox().addItem(null);

            for (int a = 0; a < pendingUsers.size(); a++) {
                frame.getPendingRequestPnl().getPendingRequestComboBox().addItem(""+pendingUsers.get(a).getName()+ " "+ pendingUsers.get(a).getSurname());
            }

        }//assegna autorizzazioni

        if (sorgenteEvento.equals(DENY_NEW_CUSTOMER)){ //rifiuta autorizzazione
            int i =frame.getPendingRequestPnl().getPendingRequestComboBox().getSelectedIndex() -1 ;
            ArrayList<User> pendingUser = administratorBusiness.pendingUser();
            User selectedPendingUser = pendingUser.get(i);
            administratorBusiness.authorizazion(selectedPendingUser, false);

            frame.getPendingRequestPnl().getUserInformationTextArea().setText(null);
           // frame.getPendingRequestPnl().getPendingRequestComboBox().setSelectedIndex(-1);
            frame.getPendingRequestPnl().getPendingRequestComboBox().removeAllItems();

            ArrayList<User> pendingUsers = administratorBusiness.pendingUser();
            frame.getPendingRequestPnl().getPendingRequestComboBox().addItem(null);

            for (int a = 0; a < pendingUsers.size(); a++) {
                frame.getPendingRequestPnl().getPendingRequestComboBox().addItem(""+pendingUsers.get(a).getName()+ " "+ pendingUsers.get(a).getSurname());
            }
        }//rifiuta autorizzazione

        if (sorgenteEvento.equals(BACK_FROM_REQUEST_TO_HOME)){//torna dal pannello registrazioni ala home dell'amministraotre
            int num = administratorBusiness.numPendingRequest();
            frame.getAdministratorPnl().getNewCustomerButton().setEnabled(false);
            if (num != 0) frame.getAdministratorPnl().getNewCustomerButton().setEnabled(true);
            frame.getAdministratorPnl().getNewCustomerButton().setText("new Customer ("+num+ ")");

            frame.getAdministratorPnl().getAdministratorPanel().setVisible(true);
            frame.getPendingRequestPnl().getPendingRequestPanel().setVisible(false);

        }//torna dal pannello registrazioni ala home dell'amministraotre
    }



        @Override
    public void itemStateChanged(ItemEvent e) {


        if (e.getSource() == frame.getPendingRequestPnl().getPendingRequestComboBox()) {

            int i =frame.getPendingRequestPnl().getPendingRequestComboBox().getSelectedIndex() - 1 ;
            frame.getPendingRequestPnl().getUserInformationTextArea().removeAll();
            ArrayList<User> pendingUser = administratorBusiness.pendingUser();
            if (i >=0) {
                User selectedPendingUser = pendingUser.get(i);
                frame.getPendingRequestPnl().getUserInformationTextArea().setText("Name: " + selectedPendingUser.getName() +
                        "\nSurname " + selectedPendingUser.getSurname() + "\nUsername: " + selectedPendingUser.getUsername() +
                        "\nPassword: " + selectedPendingUser.getPassword() + "\nEmail: " + selectedPendingUser.getEmail() +
                        "\nBank: " + selectedPendingUser.getBranchUser().getBank().getName() +
                        "\nBranch: " + selectedPendingUser.getBranchUser().getName() + "\n");
            }
        }

    }
}

