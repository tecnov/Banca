package it.homebank.sportello.model;

public class PurchasedService {
    private int idPurchasedService;
     private String startDate;
    private String finishDate;
    Service service; /*indica quale service è*/
    User customer; /*chi ha usufruito del service*/


    public PurchasedService(int idPurchasedService, String startDate, String finishDate, Service service, User customer) {
        this.idPurchasedService = idPurchasedService;
         this.startDate = startDate;
        this.finishDate = finishDate;
        this.service = service;
        this.customer = customer;
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
