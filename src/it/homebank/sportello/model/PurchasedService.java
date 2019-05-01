package it.homebank.sportello.model;

public class PurchasedService {
    private int idPurchasedService;
    Service service; /*indica quale service è*/
    User customer; /*chi ha usufruito del service*/
    private String startDate;
    private String finishDate;

    public PurchasedService(int idPurchasedService, Service service, User customer, String startDate, String finishDate) {
        this.idPurchasedService = idPurchasedService;
        this.service = service;
        this.customer = customer;
        this.startDate = startDate;
        this.finishDate = finishDate;
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

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
}
