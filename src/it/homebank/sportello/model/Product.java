package it.homebank.sportello.model;

import it.homebank.sportello.DAO.ProductDAO;

import java.util.ArrayList;

public class Product {
    private int idProduct;
    private String name;
    private int price;
    private String description;
    private String variable;
    private Bank bank; /*indica di quale bank è il prodotto*/


    public Product(int idProduct, String name, int price, String description, String variable, Bank bank) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.description = description;
        this.variable = variable;
        this.bank = bank;
    }

    public Product() {

    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }


    public ArrayList<Product> findbyIdBank(int idBank) {
        ProductDAO sDAO = new ProductDAO();
        return sDAO.findbyIdBank(idBank);
    }

}

