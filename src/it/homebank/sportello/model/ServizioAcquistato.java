package it.homebank.sportello.model;

public class ServizioAcquistato {
    private int idServizioAcquistato;
    Servizio servizio; /*indica quale servizio è*/
    Utente cliente; /*chi ha usufruito del servizio*/
    private String datainizio;
    private String datafine;

    public ServizioAcquistato(int idServizioAcquistato, Servizio servizio, Utente cliente, String datainizio, String datafine) {
        this.idServizioAcquistato = idServizioAcquistato;
        this.servizio = servizio;
        this.cliente = cliente;
        this.datainizio = datainizio;
        this.datafine = datafine;
    }

    public int getIdServizioAcquistato() {
        return idServizioAcquistato;
    }

    public void setIdServizioAcquistato(int idServizioAcquistato) {
        this.idServizioAcquistato = idServizioAcquistato;
    }

    public Servizio getServizio() {
        return servizio;
    }

    public void setServizio(Servizio servizio) {
        this.servizio = servizio;
    }

    public Utente getCliente() {
        return cliente;
    }

    public void setCliente(Utente cliente) {
        this.cliente = cliente;
    }

    public String getDatainizio() {
        return datainizio;
    }

    public void setDatainizio(String datainizio) {
        this.datainizio = datainizio;
    }

    public String getDatafine() {
        return datafine;
    }

    public void setDatafine(String datafine) {
        this.datafine = datafine;
    }
}
