package it.homebank.sportello.model;

public class Product {
    private int idProduct;
    private String name;
    private String description;

    private int price;

    private Bank bank; /*indica di quale bank è il prodotto*/


    public Product(int idProduct, String name, String description, int price, String startDate, String finishDate, Bank bank) {
        this.idProduct = idProduct;
        this.name = name;
        this.description = description;
        this.price = price;
        this.bank = bank;

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


}

