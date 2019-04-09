package View.Panel;

import it.homebank.sportello.model.Cliente;
import it.homebank.sportello.model.Utente;

import javax.swing.*;

public class utentePanel {
    private JPanel panel1;
    private JLabel Welcometxt;
    private Utente utente = new Utente();
    private void createUIComponents() {


        panel1.getUI();
        Welcometxt.setText("Benvenuto " + utente.getNome() + utente.getCognome());
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
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
