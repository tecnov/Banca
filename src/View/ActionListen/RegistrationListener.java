package View.ActionListen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationListener implements ActionListener {
    private Frame frame;
    public RegistrationListener(View.Frame frame) {
        this.frame = frame;
    }
    public final static String REGISTER = "Registra utente";
    public final static String COMPLETE = "Completa registrazione";

    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if (sorgenteEvento.equals(REGISTER)){
            String nome = frame.getName();

        }

    }
}
