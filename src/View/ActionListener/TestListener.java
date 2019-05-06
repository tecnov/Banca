package View.ActionListener;

import View.Frame;
import View.Panel.TestPanel;
import it.homebank.sportello.Business.RegistrationBusiness;
import it.homebank.sportello.model.Branch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TestListener implements ActionListener {


    private Frame frame;

    public TestPanel testPanel = new TestPanel();

    public TestListener(Frame frame) {
        this.frame = frame;
    }
    private RegistrationBusiness registrationBusiness = new RegistrationBusiness();


    public final static String TEST = "Testalo";


    @Override
    public void actionPerformed(ActionEvent e) {
        String sorgenteEvento = e.getActionCommand();
        if (sorgenteEvento.equals(TEST)) {
            Branch branch;
            String name =frame.getTestPnl().getTextField1().getText();
            String surname =frame.getTestPnl().getTextField2().getText();
            String username =frame.getTestPnl().getTextField3().getText();
            String password =frame.getTestPnl().getTextField4().getText();
            String email =frame.getTestPnl().getTextField5().getText();
            String branchString = frame.getTestPnl().getTextField6().getText();

            branch = registrationBusiness.findBranchbyName(branchString);

            registrationBusiness.userRegistration(name, surname, username, password, email, branch);
        }


    }
}
