package it.homebank.sportello.Business;

import it.homebank.sportello.model.User;

public class LoginBusiness {


    public User login(String  username, String  password) {
        User userLogin = User.login(username,password);
        return userLogin;
    }





}
