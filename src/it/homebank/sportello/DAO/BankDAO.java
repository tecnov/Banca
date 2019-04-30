package it.homebank.sportello.DAO;

import it.homebank.sportello.dbConnection.DbConnection;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.User;

import java.util.ArrayList;

public class BankDAO {
    private static BankDAO instance;
    public static synchronized BankDAO getInstance() {
        if(instance == null)
            instance = new BankDAO();
        return instance;
    }



    public Bank findbyIdBank(int idBank) {
        Bank s = new Bank();
        User u = new User();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Banca WHERE idBank='" + idBank + "' ");
        if (result.size() == 0) return null;
        String[] riga = result.get(0);
        s.setIdBank(Integer.parseInt(riga[1]));
        s.setName(riga[2]);
        s.setDirector(u.findbyIdUser(Integer.parseInt(riga[3]))); //TODO
        s.setAddress(riga[4]);
        s.setDescription(riga[5]);
        s.setPhoto(riga[6]);
        return s;


    }
}