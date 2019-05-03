package it.homebank.sportello.model;

public class Service {
    private int idService;
    private String name;
    private String description;
    private int interest;
    private int duration;
    Bank bank; /*di quale bank è il service*/


    public Service(int idService, String name, String description, int interest, int duration, Bank bank) {
        this.idService = idService;
        this.name = name;
        this.description = description;
        this.interest = interest;
        this.duration = duration;
        this.bank = bank;

    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
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

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
