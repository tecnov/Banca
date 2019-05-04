package View.ActionListener;
import View.Frame;
import it.homebank.sportello.Business.RegistrationBusiness;
import it.homebank.sportello.model.Branch;
import it.homebank.sportello.model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationListener implements ActionListener {
    private Frame frame;
    private RegistrationBusiness registrationBusiness = new RegistrationBusiness();
    public RegistrationListener(View.Frame frame) {
        this.frame = frame;
    }
    public final static String COMPLETE = "Complete registration";
    public final static String BACK = "Torna indietro";

    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();


        if (sorgenteEvento.equals(COMPLETE)){
             User user = new User();
             Branch branch = new Branch();
             String username = frame.getRegistrationPnl().getTextUsername().getText();
             String password = frame.getRegistrationPnl().getTextPassword().getText();
             String name = frame.getRegistrationPnl().getTextName().getText();
             String surname = frame.getRegistrationPnl().getTextSurname().getText();
             String email = frame.getRegistrationPnl().getTextEmail().getText();
             String branchString = frame.getRegistrationPnl().getTextBranchString().getText();

             branch = registrationBusiness.findBranchbyName(branchString);



             registrationBusiness.userRegistration(username, password, name, surname, email, branch);

             JOptionPane.showMessageDialog(null, "Le abbiamo inviato un email di conferma");
        }

        if (sorgenteEvento.equals(BACK)) {
            frame.getRegistrationPnl().getRegistrationPanel().setVisible(false);
            frame.getHomePnl().getHomePnl().setVisible(true);
        }

            }
        }



