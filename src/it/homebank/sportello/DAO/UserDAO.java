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
        Branch b = new Branch();
        if (result.size() == 0) return null;
        String[] riga = result.get(0);
        s.setIdUser(Integer.parseInt(riga[0]));
        s.setUsername(riga[1]);
        s.setPassword(riga[2]);
        s.setName(riga[3]);
        s.setSurname(riga[4]);
        s.setEmail(riga[5]);
        s.setType(Integer.parseInt(riga[6]));
        s.setBranchUser(b.findbyIdBranch(Integer.parseInt(riga[7])));
        return s;
    }


    public User login(String username, String password) {

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"'");

        if(result == null) return null;
        Branch b = new Branch();
        User s = new User();
        String[] riga = result.get(0);
        s.setIdUser(Integer.parseInt(riga[0]));
        s.setUsername(riga[1]);
        s.setPassword(riga[2]);
        s.setName(riga[3]);
        s.setSurname(riga[4]);
        s.setEmail(riga[5]);
        s.setType(Integer.parseInt(riga[6]));
        s.setBranchUser(b.findbyIdBranch(Integer.parseInt(riga[7])));
        return s;
    }


    public boolean create( User user){
        Branch branch;
         int idBranch;
        branch = user.getBranchUser();
        idBranch = branch.getIdBrach();



        String sql = "INSERT INTO `User` (`username`, `password`, `name`, `surname`, `email`, `type`, `Branch_idBranch`) VALUES ( '"+ user.getUsername() +"', '"+ user.getPassword() +"', '"+ user.getName() +"', '"+ user.getSurname() +"', '"+ user.getEmail()+"', '"+ user.getType()+"', '"+ idBranch+"')";

      return DbConnection.getInstance().eseguiAggiornamento(sql);

    }


}
