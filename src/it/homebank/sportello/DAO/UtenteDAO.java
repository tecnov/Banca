package it.homebank.sportello.DAO;

import it.homebank.sportello.dbConnection.DbConnection;
import it.homebank.sportello.model.Utente;
import java.util.ArrayList;
import java.util.Iterator;


public class UtenteDAO {


    private static UtenteDAO instance;
    public static synchronized UtenteDAO getInstance() {
        if(instance == null)    
            instance = new UtenteDAO();
        return instance;
    }

    public ArrayList<Utente> findAll() {

        ArrayList<Utente> registrato = new ArrayList<Utente>();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM utente WHERE tipo='Tesserato'");
        Iterator<String[]> i = result.iterator();

        while(i.hasNext()){ //continua ad incrementare finché non trova l'elemento successivo oppure se l'elemento successivo è un'eccezione
            String[] riga = i.next();
            Utente s = new Utente();
            s.setIdUtente(Integer.parseInt(riga[0]));
            s.setUsername(riga[1]);
            s.setPassword(riga[2]);
            s.setNome(riga[3]);
            s.setCognome(riga[4]);
            s.setEmail(riga[5]);
            s.setTipo(Integer.parseInt(riga[6]));
            registrato.add(s);}
        return registrato;
    }

    public Utente login(String username, String password) {

        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM utente WHERE username='"+username+"' AND password='"+password+"'");

        if(result == null) return null;

        Utente s = new Utente();
        String[] riga = result.get(0);
        s.setIdUtente(Integer.parseInt(riga[0]));
        s.setUsername(riga[1]);
        s.setPassword(riga[2]);
       // s.setNome(riga[3]);
       // s.setCognome(riga[4]);
       // s.setEmail(riga[5]);
       // s.setTipo(riga[6]);
        return s;
    }

    public boolean create( Utente utente){

        String sql = "INSERT INTO 'utente' ('username', 'password', 'nome', 'cognome', 'email', 'tipo' VALUES ( '"+ utente.getUsername() +"', '"+ utente.getPassword() +"', '"+utente.getNome().replaceAll("'","`")+"', '"+utente.getCognome().replaceAll("'","`")+"', '"+utente.getEmail()+"', '"+utente.getFilialeutente()+"')";

      return DbConnection.getInstance().eseguiAggiornamento(sql);

    }
}
