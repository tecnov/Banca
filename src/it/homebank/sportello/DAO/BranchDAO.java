package it.homebank.sportello.DAO;

import it.homebank.sportello.dbConnection.DbConnection;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

import java.util.ArrayList;

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
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Branch WHERE name='" + name + "' ");
        if(result.size() == 0) return null;
        String[] riga = result.get(0);
        s.setIdBranch(Integer.parseInt(riga[0]));
        s.setName(riga[1]);
        s.setAddress(riga[2]);
        s.setSchedule(riga[3]);
        s.setPhoto(riga[4]);
        s.setBank(d.findbyIdBank(Integer.parseInt(riga[5])));

        return s;
    }

    public Branch findbyIdBranch(int idBranch) {
        Branch s = new Branch();
        Bank d = new Bank();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Branch WHERE idBranch='" + idBranch + "' ");
        if(result.size() == 0) return null;
        String[] riga = result.get(0);
        s.setIdBranch(Integer.parseInt(riga[0]));
        s.setName(riga[1]);
        s.setAddress(riga[2]);
        s.setSchedule(riga[3]);
        s.setPhoto(riga[4]);
        s.setBank(d.findbyIdBank(Integer.parseInt(riga[5])));
        return s;
    }

    public Branch fingbyIdBank(int idBank) {
        Branch s = new Branch();
        Bank d = new Bank();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Branch WHERE idBranch='" + idBank + "' ");
        if(result.size() == 0) return null;
        String[] riga = result.get(0);
        s.setIdBranch(Integer.parseInt(riga[0]));
        s.setName(riga[1]);
        s.setAddress(riga[2]);
        s.setSchedule(riga[3]);
        s.setPhoto(riga[4]);
        s.setBank(d.findbyIdBank(Integer.parseInt(riga[5])));
        return s;
    }
}
