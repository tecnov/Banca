package it.homebank.sportello.model;

import it.homebank.sportello.DAO.BankDAO;

public class Bank {
    int idBank;
    String name;
    String address;
    String description;
    String photo;
    User director;

    public Bank(int idBank, String name, String address, String description, String photo, User director) {
        this.idBank = idBank;
        this.name = name;
        this.address = address;
        this.description = description;
        this.photo = photo;
        this.director = director;

    }

    public Bank() {

    }


    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public User getDirector() {
        return director;
    }

    public void setDirector(User director) {
        this.director = director;
    }


    //filtering and search
    public static Bank findbyIdBank(int idBank) {
        BankDAO sDAO = new BankDAO();
        return sDAO.findbyIdBank(idBank);
    }
}
