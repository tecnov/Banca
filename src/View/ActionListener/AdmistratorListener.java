package View.ActionListener;

import View.Frame;
import it.homebank.sportello.Business.AdministratorBusiness;
import it.homebank.sportello.model.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdmistratorListener implements ActionListener {
    private Frame frame;



    public AdmistratorListener(Frame frame) {
        this.frame = frame;
    }

    private AdministratorBusiness administratorBusiness = new AdministratorBusiness();

        public final static String NEWBANK = "new bank";
    public final static String PENDINGCUSTOMER = "pending customer";




    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();

        if (sorgenteEvento.equals(PENDINGCUSTOMER)) {
            ArrayList<User> pendingUser = administratorBusiness.pendingUser();


        }


        }
}
