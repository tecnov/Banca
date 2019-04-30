package it.homebank.sportello.DAO;

import it.homebank.sportello.dbConnection.DbConnection;
import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

import java.util.ArrayList;
import java.util.Iterator;


public class UserDAO {


    private static UserDAO instance;
    public static synchronized UserDAO getInstance() {
        if(instance == null)    
            instance = new UserDAO();
        return instance;
    }

    public ArrayList<User> findAll() {

        ArrayList<User> registrato = new ArrayList<User>();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM user ");
        Iterator<String[]> i = result.iterator();

        while(i.hasNext()){ //continua ad incrementare finché non trova l'elemento successivo oppure se l'elemento successivo è un'eccezione
            String[] riga = i.next();
            User s = new User();
            Branch b = new Branch();
            s.setIdUser(Integer.parseInt(riga[0]));
            s.setUsername(riga[1]);
            s.setPassword(riga[2]);
            s.setName(riga[3]);
            s.setSurname(riga[4]);
            s.setEmail(riga[5]);
            s.setType(Integer.parseInt(riga[6]));
            s.setBranchUser(b.findbyIdBranch(Integer.parseInt(riga[7])));
            registrato.add(s);}
        return registrato;
    }

    public User findbyIdUser(int idUser) {
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM User WHERE idUser='" + idUser + "' ");
        User s = new User();
        if (result.size() == 0) return null;
        String[] riga = result.get(0);
        s.setIdUser(Integer.parseInt(riga[0]));
        s.setUsername(riga[1]);
        s.setPassword(riga[2]);
        s.setName(riga[3]);
        s.setSurname(riga[4]);
        s.setEmail(riga[5]);
        s.setType(Integer.parseInt(riga[6]));
        return s;
    }


    public User login(String username, String password) {

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"'");

        if(result == null) return null;

        User s = new User();
        String[] riga = result.get(0);
        s.setIdUser(Integer.parseInt(riga[0]));
        s.setUsername(riga[1]);
        s.setPassword(riga[2]);
        s.setName(riga[3]);
        s.setSurname(riga[4]);
        s.setEmail(riga[5]);
        s.setType(Integer.parseInt(riga[6]));
        return s;
    }


    public boolean create( User user){

        String sql = "INSERT INTO 'user' ('username', 'password', 'nome', 'cognome', 'email', 'tipo' VALUES ( '"+ user.getUsername() +"', '"+ user.getPassword() +"', '"+ user.getName().replaceAll("'","`")+"', '"+ user.getSurname().replaceAll("'","`")+"', '"+ user.getEmail()+"', '"+ user.getType()+"', '"+ user.getBranchUser()+"')";

      return DbConnection.getInstance().eseguiAggiornamento(sql);

    }


}
