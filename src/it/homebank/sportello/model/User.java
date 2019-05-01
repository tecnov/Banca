package it.homebank.sportello.model;

import View.Panel.UserPanel;
import it.homebank.sportello.DAO.BankDAO;
import it.homebank.sportello.DAO.UserDAO;

public class User {

    private int idUser;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private int type;
    private Branch branchUser;



    public User(int idUser, String name, String surname, String email, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Branch getBranchUser() {
        return branchUser;
    }

    public void setBranchUser(Branch branchUser) {
        this.branchUser = branchUser;
    }



    //filtering and search

    public static User findbyIdUser(int idUser) {
        UserDAO sDAO = new UserDAO();
        return sDAO.findbyIdUser(idUser);
    }





    //function
    public boolean registration(User user) {
        UserDAO sDAO = new UserDAO();
        return UserDAO.getInstance().create(user);
    }

    public static User login (String username, String password) {
        UserDAO sDAO = new UserDAO();
        return sDAO.login(username,password);
    }


}
