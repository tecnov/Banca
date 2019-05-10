package it.homebank.sportello.model;

public class OperationList {
    private int idOperation;
    private String date;
    private boolean cashierAuthorization;

    User customer;/* il customer che ha effettuato l'operaizone */

    private Product product;               /*il product acquistato, può essere vuoto se ha fatto un passaggio di soldi */
    int price;
    PurchasedService sender;                 /*servizio dal quale sono stati presi i soldi o servizi tra i quali si è passato i soldi...*/
    PurchasedService recipient;              /*...il recipient può essere vuoto se ha acquistato un product*/

    public OperationList(int idOperation, String date, boolean cashierAuthorization, User customer, Product product, int price, PurchasedService sender, PurchasedService recipient) {
        this.idOperation = idOperation;
        this.date = date;
        this.cashierAuthorization = cashierAuthorization;
        this.customer = customer;
        this.product = product;
        this.sender = sender;
        this.recipient = recipient;
    }

    public int getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(int idOperation) {
        this.idOperation = idOperation;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isCashierAuthorization() {
        return cashierAuthorization;
    }

    public void setCashierAuthorization(boolean cashierAuthorization) {
        this.cashierAuthorization = cashierAuthorization;
    }

    public PurchasedService getSender() {
        return sender;
    }

    public void setSender(PurchasedService sender) {
        this.sender = sender;
    }

    public PurchasedService getRecipient() {
        return recipient;
    }

    public void setRecipient(PurchasedService recipient) {
        this.recipient = recipient;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}