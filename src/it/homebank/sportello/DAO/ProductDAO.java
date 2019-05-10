package it.homebank.sportello.DAO;


import it.homebank.sportello.dbConnection.DbConnection;
import it.homebank.sportello.model.Bank;
import it.homebank.sportello.model.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductDAO {
        private static it.homebank.sportello.DAO.ProductDAO instance;
        public static synchronized it.homebank.sportello.DAO.ProductDAO getInstance() {
            if(instance == null)
                instance = new it.homebank.sportello.DAO.ProductDAO();
            return instance;
        }


    public ArrayList<Product> findbyIdBank(int idBank) {

        ArrayList<Product> products = new ArrayList<>();
        ArrayList<String[]> result = DbConnection.getInstance().eseguiQuery("SELECT * FROM Product WHERE bank_idBank= '"+ idBank +"'");
        Iterator<String[]> i = result.iterator();
        Bank d = new Bank();

        while (i.hasNext()) { //continua ad incrementare finché non trova l'elemento successivo oppure se l'elemento successivo è un'eccezione
            String[] riga = i.next();
            Product s = new Product();
            s.setIdProduct(Integer.parseInt(riga[0]));
            s.setName(riga[1]);
            if (riga[2] == null) s.setPrice(-1);
            else s.setPrice(Integer.parseInt(riga[2]));
            s.setDescription(riga[3]);
            s.setVariable(riga[4]);
            s.setBank(d.findbyIdBank(Integer.parseInt(riga[5])));
            products.add(s);
        }
        return products;



    }
}
