package it.homebank.sportello.Business;

import it.homebank.sportello.DAO.BranchDAO;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

import java.util.ArrayList;

public class RegistrationBusiness {


    public User userRegistration(String username, String password, String name, String surname, String email, Branch branchUser){

        User tmpUserRegistration = new User();

        tmpUserRegistration.setName(name);
        tmpUserRegistration.setSurname(surname);
        tmpUserRegistration.setUsername(username);
        tmpUserRegistration.setPassword(password);
        tmpUserRegistration.setEmail(email);
        tmpUserRegistration.setBranchUser(branchUser);
        tmpUserRegistration.registration(tmpUserRegistration);
        return (tmpUserRegistration);
    }


    //sbagliato
    public Branch findBranchbyName(String branch){

        BranchDAO sDAO = new BranchDAO();
        Branch tmpBranch = sDAO.findbyName(branch);
        return tmpBranch;
    }

    public boolean checkDuplicateUsername(String username) {

        User u = new User();

        if(u.findbyUsername(username) ==  null) return true;
        else return false;
    }

    public boolean checkDuplicateBankName(String name) {

        Bank b = new Bank();

        if(b.findbyName(name) == null) return true;
        else return false;
    }

    public Branch findBranch(String nameBranch, String nameBank) {
        Branch b = new Branch();
        Bank bb = new Bank();
        bb = bb.findbyName(nameBank);

        return b.findbyIdBankandBranchName(nameBranch, bb.getIdBank());

    }

    public ArrayList<Branch> findBranchs(int idBank) {
        Branch b = new Branch();
        return b.findbyIdBank(idBank);
    }

    public Bank findBank(String bankName) {
        Bank b = new Bank();
        return b.findbyName(bankName);
    }

    public ArrayList<Bank> findAllBanks() {
        Bank b = new Bank();
        return b.findAll();
    }
}


