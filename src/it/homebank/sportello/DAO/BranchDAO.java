package it.homebank.sportello.DAO;

import it.homebank.sportello.dbConnection.DbConnection;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

import java.util.ArrayList;
import java.util.Iterator;

public class BranchDAO {

    private static BranchDAO instance;

    public static synchronized BranchDAO getInstance() {
        if (instance == null)
            instance = new BranchDAO();
        return instance;

    }
    public Branch findbyName(String name) {
        Branch s = new Branch();
        Bank d = new Bank();
        User u = new User();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Branch WHERE name='" + name + "' ");
        if(result.size() == 0) return null;
        String[] riga = result.get(0);
        s.setIdBrach(Integer.parseInt(riga[0]));
        s.setName(riga[1]);
        s.setBank(d.findbyIdBank(Integer.parseInt(riga[2])));
        s.setCashier(u.findbyIdUser(Integer.parseInt(riga[3])));
        s.setAddress(riga[4]);
        s.setSchedule(riga[5]);
        s.setPhoto(riga[6]);
        return s;
    }

    public Branch findbyIdBranch(int idBranch) {
        Branch s = new Branch();
        Bank d = new Bank();
        User u = new User();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Branch WHERE idBranch='" + idBranch + "' ");
        if(result.size() == 0) return null;
        String[] riga = result.get(0);
        s.setIdBrach(Integer.parseInt(riga[0]));
        s.setName(riga[1]);
        s.setBank(d.findbyIdBank(Integer.parseInt(riga[2])));
        s.setCashier(u.findbyIdUser(Integer.parseInt(riga[3])));
        s.setAddress(riga[4]);
        s.setSchedule(riga[5]);
        s.setPhoto(riga[6]);
        return s;
    }
}
