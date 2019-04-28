package it.homebank.sportello.model;

public class ListaOperazioni {
    private int idOperazione;
    Utente cliente; /* il cliente che ha effettuato l'operaizone */
    private String data;
    private Prodotto prodotto; /*il prodotto acquistato, può essere vuoto se ha fatto un passaggio di soldi */
    private boolean autorizzazioneCassiere;
    ServizioAcquistato Mittente; /*servizi tra i quali si è passato i soldi...*/
    ServizioAcquistato Destinatario;/*...può essere vuoto se ha acquistato un prodotto*/

    public ListaOperazioni(int idOperazione, Utente cliente, String data, Prodotto prodotto, boolean autorizzazioneCassiere, ServizioAcquistato mittente, ServizioAcquistato destinatario) {
        this.idOperazione = idOperazione;
        this.cliente = cliente;
        this.data = data;
        this.prodotto = prodotto;
        this.autorizzazioneCassiere = autorizzazioneCassiere;
        Mittente = mittente;
        Destinatario = destinatario;
    }

    public int getIdOperazione() {
        return idOperazione;
    }

    public void setIdOperazione(int idOperazione) {
        this.idOperazione = idOperazione;
    }

    public Utente getCliente() {
        return cliente;
    }

    public void setCliente(Utente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public boolean isAutorizzazioneCassiere() {
        return autorizzazioneCassiere;
    }

    public void setAutorizzazioneCassiere(boolean autorizzazioneCassiere) {
        this.autorizzazioneCassiere = autorizzazioneCassiere;
    }

    public ServizioAcquistato getMittente() {
        return Mittente;
    }

    public void setMittente(ServizioAcquistato mittente) {
        Mittente = mittente;
    }

    public ServizioAcquistato getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(ServizioAcquistato destinatario) {
        Destinatario = destinatario;
    }
}