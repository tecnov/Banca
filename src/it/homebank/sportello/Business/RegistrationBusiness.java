package it.homebank.sportello.Business;

import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

public class RegistrationBusiness {


    public User userRegistration(String name, String surname, String username, String password, String email, int type, Branch branch){

        User tmpUserRegistration = new User();

        tmpUserRegistration.setName(name);
        tmpUserRegistration.setSurname(surname);
        tmpUserRegistration.setUsername(username);
        tmpUserRegistration.setPassword(password);
        tmpUserRegistration.setEmail(email);
        tmpUserRegistration.setType(type);
        tmpUserRegistration.setBranchUser(branch);
        tmpUserRegistration.registration(tmpUserRegistration);
        //JOptionPane.showMessageDialog(null,"La registration è avvenuta con successo");
        return (tmpUserRegistration);
    }
    public Branch findBranchbyName(String branch){

        Branch tmpBranch = new Branch();
        tmpBranch.findbyName(branch);
        return tmpBranch;
    }

}
