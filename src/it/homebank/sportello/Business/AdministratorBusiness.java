package it.homebank.sportello.Business;

import it.homebank.sportello.DAO.UserDAO;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

import java.util.ArrayList;

public class AdministratorBusiness {

    public int numPendingRequest(){
        UserDAO s = new UserDAO();
        ArrayList<User> pendingUser = UserDAO.findbyAuthorization();
        return pendingUser.size();
    }


    public ArrayList<User> pendingUser() {
        UserDAO s = new UserDAO();
        ArrayList<User> pendingUser = UserDAO.findbyAuthorization();
        return pendingUser;

    }

    public Bank createNewBank(String nameBank, String addressBank, String descriptionBank, String photoPathBank) {

        Bank tmpBankRegistration = new Bank();

        tmpBankRegistration.setName(nameBank);
        tmpBankRegistration.setAddress(addressBank);
        tmpBankRegistration.setDescription(descriptionBank);
        tmpBankRegistration.setPhoto(photoPathBank);
        tmpBankRegistration.createNewBank(tmpBankRegistration);

        return (tmpBankRegistration);
        }

    public Branch createBranchBank(String name, String address, String schedule, String photo, Bank bank) {

        Branch tmpBranchRegistration = new Branch();

        tmpBranchRegistration.setName(name);
        tmpBranchRegistration.setAddress(address);
        tmpBranchRegistration.setSchedule(schedule);
        tmpBranchRegistration.setPhoto(photo);
        tmpBranchRegistration.setBank(bank);
        tmpBranchRegistration.createNewBranch(tmpBranchRegistration);

        return tmpBranchRegistration;
    }
}
