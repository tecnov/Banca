package it.homebank.sportello.Business;

import it.homebank.sportello.DAO.ProductDAO;
import it.homebank.sportello.model.Product;

import java.util.ArrayList;

public class DirectorBusiness {


    public ArrayList<Product> bankProducts(int idBank) {

      Product p = new Product();
        return p.findbyIdBank(idBank);
    }
}
