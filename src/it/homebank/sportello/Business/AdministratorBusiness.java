package it.homebank.sportello.Business;

import it.homebank.sportello.DAO.UserDAO;
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
}
