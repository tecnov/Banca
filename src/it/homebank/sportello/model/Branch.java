package it.homebank.sportello.model;

import it.homebank.sportello.DAO.BranchDAO;

public class Branch {

    int idBrach;
    String name;
    String address;
    String schedule;
    String photo;
    Bank bank; /*indica di quale bank è la filiale*/


    public Branch(int idBrach, String name, String address, String schedule, String photo, Bank bank) {
        this.idBrach = idBrach;
        this.name = name;
        this.bank = bank;
        this.address = address;
        this.schedule = schedule;
        this.photo = photo;
    }

    public Branch() {

    }

    public int getIdBrach() {
        return idBrach;
    }

    public void setIdBrach(int idBrach) {
        this.idBrach = idBrach;
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

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }


    //filtering and search

    public Branch findbyIdBranch(int idBranch) {
        BranchDAO sDAO = new BranchDAO();
        return sDAO.findbyIdBranch(idBranch);
    }
    public Branch findbyName(String name) {
        BranchDAO sDAO = new BranchDAO();
        return sDAO.findbyName(name);
    }
}
