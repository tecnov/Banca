package it.homebank.sportello.model;

import it.homebank.sportello.DAO.UserDAO;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class User {

    private int idUser;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private int type;
    private int authorization;  // se 0 non ancora autenticato. se 1 il cliente è autenticato
    private Branch branchUser; /*indica a quale filiale appartiene il cliente, se il cliente è di tipo 3 è sia cliente che cassiere */
                                /*se il direttore è di tipo 3 è sia cliente che direttore*/


    public User(int idUser, String username, String password, String name, String surname, String email, int type, int authorization ,Branch branchUser) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.type = type;
        this.authorization = authorization;
        this.branchUser = branchUser;
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

    public int getAuthorization() {
        return authorization;
    }

    public void setAuthorization(int authorization) {
        this.authorization = authorization;
    }


    //filtering and search
    public static User findbyIdUser(int idUser) {
        UserDAO sDAO = new UserDAO();
        return sDAO.findbyIdUser(idUser);
    }






    //function
    public boolean registration(User user) { /*questa funzione aggiunge un user senza autorizzazione e di tipo cliente*/
        UserDAO sDAO = new UserDAO();
        return sDAO.getInstance().create(user);
    }

    public static User login (String username, String password) {
        UserDAO sDAO = new UserDAO();
        User tmpUser = sDAO.login(username, password);
        return tmpUser;
    }

    public boolean authorization (User user, boolean confirm){
        UserDAO sDAO = new UserDAO();
        if (confirm == true ) {
            return sDAO.confirm(user);
        }
        else
            {return sDAO.delete(user);}

    }
}
