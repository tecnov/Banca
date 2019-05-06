package it.homebank.sportello.Business;

import it.homebank.sportello.DAO.BranchDAO;
import it.homebank.sportello.DAO.UserDAO;
import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

import java.util.ArrayList;

public class RegistrationBusiness {

    public User userRegistration( String username, String password, String name, String surname, String email, Branch branchUser){

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



    public Branch findBranchbyName(String branch){

        BranchDAO sDAO = new BranchDAO();
        Branch tmpBranch = sDAO.findbyName(branch);
        return tmpBranch;
    }

    public boolean checkDuplicate(String username) {

        UserDAO sDAO = new UserDAO();
        ArrayList a = sDAO.checkDuplicateUsername(username);
        if(a.size() == 0) return true;
        else return false;
    }

}

