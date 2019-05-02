package it.homebank.sportello.DAO;

import java.util.ArrayList;

public class RegistrationDAO {
    private static RegistrationDAO instance;

    public static synchronized RegistrationDAO getInstance() {
        if (instance == null)
            instance = new RegistrationDAO();
        return instance;
    }




}
