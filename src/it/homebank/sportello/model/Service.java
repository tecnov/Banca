package it.homebank.sportello.model;

public class Service {
    private int idService;
    private String name;
    private String description;
    private int type; //1 se è un investimento, 2 se è a pagamento
    private int interest;
    private String duration;
    Bank bank; /*di quale bank è il service*/


    public Service(int idService, String name, String description, int type, int interest, String duration, Bank bank) {
        this.idService = idService;
        this.name = name;
        this.description = description;
        this.interest = interest;
        this.duration = duration;
        this.bank = bank;
        this.type = type;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
