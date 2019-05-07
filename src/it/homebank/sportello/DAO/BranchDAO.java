package it.homebank.sportello.DAO;

import it.homebank.sportello.dbConnection.DbConnection;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

import javax.swing.*;
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
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Branch WHERE name='" + name + "' ");
        if(result.size() == 0)  {  JOptionPane.showMessageDialog(null,"Nessuna filiale con questo nome");}
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


    public ArrayList<Branch> findbyIdBank(int idBank) {

        ArrayList<Branch> branch = new ArrayList<>();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Branch WHERE Bank_idBank='" + idBank + "' ");
        Iterator<String[]> i = result.iterator();

        while (i.hasNext()) { //continua ad incrementare finché non trova l'elemento successivo oppure se l'elemento successivo è un'eccezione
            String[] riga = i.next();
            Branch s = new Branch();
            Bank d = new Bank();
            s.setIdBranch(Integer.parseInt(riga[0]));
            s.setName(riga[1]);
            s.setAddress(riga[2]);
            s.setSchedule(riga[3]);
            s.setPhoto(riga[4]);
            s.setBank(d.findbyIdBank(Integer.parseInt(riga[5])));
            branch.add(s);

        }
        return branch;
    }

    public boolean create(Branch branch) {

        Bank bank;
        int idBank;
        bank = branch.getBank();
        idBank = bank.getIdBank();


        String sql = "INSERT INTO `branch` (`name`, `address`, `schedule`, `photo`, `Bank_idBank`) VALUES ('"+ branch.getName() +"', '"+ branch.getAddress() +"', '"+ branch.getSchedule() +"', '"+ branch.getPhoto() +"', '"+ idBank +"');";

        return DbConnection.getInstance().eseguiAggiornamento(sql);


    }
}
