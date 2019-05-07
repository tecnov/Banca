package it.homebank.sportello.DAO;

import it.homebank.sportello.dbConnection.DbConnection;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.User;

import java.util.ArrayList;
import java.util.Iterator;

public class BankDAO {
    private static BankDAO instance;
    public static synchronized BankDAO getInstance() {
        if(instance == null)
            instance = new BankDAO();
        return instance;
    }

    public ArrayList<Bank> findAll() {

        ArrayList<Bank> bank = new ArrayList<>();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Bank");
        Iterator<String[]> i = result.iterator();

        while (i.hasNext()) { //continua ad incrementare finché non trova l'elemento successivo oppure se l'elemento successivo è un'eccezione
            String[] riga = i.next();
            Bank s = new Bank();
            s.setIdBank(Integer.parseInt(riga[0]));
            s.setName(riga[1]);
            s.setAddress(riga[2]);
            s.setDescription(riga[3]);
            s.setPhoto(riga[4]);
            bank.add(s);
        }
        return bank;
    }


    public Bank findbyIdBank(int idBank) {
        Bank s = new Bank();
        User u = new User();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Bank WHERE idBank='" + idBank + "' ");
        if (result.size() == 0) return null;
        String[] riga = result.get(0);
        s.setIdBank(Integer.parseInt(riga[0]));
        s.setName(riga[1]);
        s.setAddress(riga[2]);
        s.setDescription(riga[3]);
        s.setPhoto(riga[4]);
        return s;


    }

    public Bank findbyName(String nameBank) {
        Bank s = new Bank();
        User u = new User();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Bank WHERE name='" + nameBank + "' ");
        if (result.size() == 0) return null;
        String[] riga = result.get(0);
        s.setIdBank(Integer.parseInt(riga[0]));
        s.setName(riga[1]);
        s.setAddress(riga[2]);
        s.setDescription(riga[3]);
        s.setPhoto(riga[4]);
        return s;

    }

    public boolean create(Bank bank) {

        String sql = "INSERT INTO `Bank` (`name`, `address`, `description`, `photo`) VALUES ( '"+ bank.getName() +"', '"+ bank.getAddress() +"', '"+ bank.getDescription() +"', '"+ bank.getPhoto() +"')";

        return DbConnection.getInstance().eseguiAggiornamento(sql);

    }

    public ArrayList<String[]> checkDuplicateName(String name) {

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Bank WHERE name='" + name + "'");
        return result;
    }
}