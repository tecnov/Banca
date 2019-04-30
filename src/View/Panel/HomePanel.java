package View.Panel;
import javax.swing.*;



public class HomePanel {
    public JPanel homePanel;


    public JButton loginButton;
    public JButton registrationButton;
    private JButton lavoraConNoiButton;





    public HomePanel () {
        homePanel.getUI();
        homePanel.setVisible(false);
    }


    public JPanel getHomePnl() {
        return homePanel;
    }

    public void setHomePnl(JPanel homePnl) {
        this.homePanel = homePnl;
    }


    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JButton getRegistrationButton() {
        return registrationButton;
    }

    public void setRegistrationButton(JButton registrationButton) {
        this.registrationButton = registrationButton;
    }


    public JPanel getHomePanel() {
        return homePanel;
    }

    public void setHomePanel(JPanel homePanel) {
        this.homePanel = homePanel;
    }

    public JButton getLavoraConNoiButton() {
        return lavoraConNoiButton;
    }

    public void setLavoraConNoiButton(JButton lavoraConNoiButton) {
        this.lavoraConNoiButton = lavoraConNoiButton;
    }
}
