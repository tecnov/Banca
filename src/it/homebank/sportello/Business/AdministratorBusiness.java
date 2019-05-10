package it.homebank.sportello.Business;

import it.homebank.sportello.DAO.UserDAO;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

import java.util.ArrayList;

public class AdministratorBusiness {

    public int numPendingRequest(){
        int i = 0;
        UserDAO s = new UserDAO();
        ArrayList<User> pendingUser = s.findbyAuthentication(i);
        return pendingUser.size();
    }


    public ArrayList<User> pendingUser() {
        int i = 0;
        UserDAO s = new UserDAO();
        ArrayList<User> pendingUser = s.findbyAuthentication(i);
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

    public User newDirector(String username, String password, String name, String surname, String email, Branch branch) {
        User tmpDirector = new User();

        tmpDirector.setUsername(username);
        tmpDirector.setPassword(password);
        tmpDirector.setName(name);
        tmpDirector.setSurname(surname);
        tmpDirector.setEmail(email);
        tmpDirector.setAuthorization(1);
        tmpDirector.setType(2);
        tmpDirector.setBranchUser(branch);
        tmpDirector.registration(tmpDirector);

        return tmpDirector;
    }

    public boolean authorizazion (User user, boolean confirm){
        User s = new User();
        return s.authorization(user, confirm);
    }
    public Branch findBranch(String nameBranch, String nameBank) {
        Branch b = new Branch();
        Bank bb = new Bank();
        bb = bb.findbyName(nameBank);

        return b.findbyIdBankandBranchName(nameBranch, bb.getIdBank());

    }

    public Bank findBank(String nameBank) {
        Bank b = new Bank();
        return b.findbyName(nameBank);
    }
}
