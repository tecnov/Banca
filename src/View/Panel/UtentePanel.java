package View.Panel;

import it.homebank.sportello.model.Cliente;
import it.homebank.sportello.model.Utente;

import javax.swing.*;

public class UtentePanel {
    private JPanel utentePnl;
    private JLabel Welcometxt;
    private Utente utente = new Utente();

    public UtentePanel() {
        utentePnl.getUI();
        Welcometxt.setText("Benvenuto " + utente.getNome() + utente.getCognome());
    }

    public JPanel getUtentePnl() {
        return utentePnl;
    }

    public void setPanel1(JPanel panel1) {
        this.utentePnl = panel1;
    }

    public JLabel getWelcometxt() {
        return Welcometxt;
    }

    public void setWelcometxt(JLabel welcometxt) {
        Welcometxt = welcometxt;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
