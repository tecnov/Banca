package it.homebank.sportello.model;

import it.homebank.sportello.DAO.BranchDAO;

import java.util.ArrayList;

public class Branch {

    int idBranch;
    String name;
    String address;
    String schedule;
    String photo;
    Bank bank; /*indica di quale bank è la filiale*/


    public Branch(int idBranch, String name, String address, String schedule, String photo, Bank bank) {
        this.idBranch = idBranch;
        this.name = name;
        this.bank = bank;
        this.address = address;
        this.schedule = schedule;
        this.photo = photo;
    }

    public Branch() {

    }

    public int getIdBranch() {
        return idBranch;
    }

    public void setIdBranch(int idBranch) {
        this.idBranch = idBranch;
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
        Branch s = sDAO.findbyName(name);
        return s;
    }

    public ArrayList<Branch> findbyIdBank (int idBank) {
        BranchDAO sDAO = new BranchDAO();
        return sDAO.findbyIdBank(idBank);
    }
}
