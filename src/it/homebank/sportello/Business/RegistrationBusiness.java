package it.homebank.sportello.Business;

import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

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

        Branch tmpBranch = new Branch();
        tmpBranch.findbyName(branch);
        return tmpBranch;
    }

}
