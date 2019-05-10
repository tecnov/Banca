package it.homebank.sportello.model;

public class PurchasedService {
    private int idPurchasedService;
    private String startDate;
    private float balance;
    Service service; /*indica quale service è*/
    User customer; /*chi ha usufruito del service*/


    public PurchasedService(int idPurchasedService, String startDate, float balance, Service service, User customer) {
        this.idPurchasedService = idPurchasedService;
        this.startDate = startDate;
        this.service = service;
        this.customer = customer;
        this.balance = balance;
    }

    public int getIdPurchasedService() {
        return idPurchasedService;
    }

    public void setIdPurchasedService(int idPurchasedService) {
        this.idPurchasedService = idPurchasedService;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public String setStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
