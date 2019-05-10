package it.homebank.sportello.View.ActionListener;

import it.homebank.sportello.Business.DirectorBusiness;
import it.homebank.sportello.Business.LoginBusiness;
import it.homebank.sportello.View.Frame;
import it.homebank.sportello.model.Product;
import it.homebank.sportello.model.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class DirectorListener implements ActionListener, ItemListener {

    private Frame frame;

    public DirectorListener (Frame frame) {
        this.frame = frame;
    }

    DirectorBusiness directorBusiness = new DirectorBusiness();

    //first panel
    public final static String PRODUCTS = "Ssee all products";
    public final static String SERVICES = "see all services";
    public final static String NEW_BRANCH = "create new branch";
    public final static String LOG_OUT = "log out ";

    //Product Panel
    public final static String DELETE_PRODUCT = "delete product";
    public final static String CONFIRM_NEW_PRODUCT = "add new product";
    public final static String BACK_FROM_PRODUCTS_TO_HOME = "back from products panel to home panel";


    @Override
    public void actionPerformed(ActionEvent e) {

        String sorgenteEvento = e.getActionCommand();


        if (sorgenteEvento.equals(PRODUCTS)) {//va al pannello dei prodotti
            frame.getDirectorPnl().getDirectonPanel().setVisible(false);
            frame.getProductDirPnl().getProductDirPanel().setVisible(true);

            frame.getProductDirPnl().getProductsComboBox().removeAllItems();
            Product p = new Product();



            LoginBusiness l = new LoginBusiness();
            User user = l.login(frame.getLoginPnl().getTextUser().getText(), frame.getLoginPnl().getTextPassword().getText());

            frame.getProductDirPnl().getProductsComboBox().addItem(null);
            ArrayList<Product> products = p.findbyIdBank(user.getBranchUser().getBank().getIdBank());
            for (int i = 0; i < products.size(); i++) {
                frame.getProductDirPnl().getProductsComboBox().addItem(products.get(i).getName());
            }
        }//va al pannello dei prodotti

        if (sorgenteEvento.equals(DELETE_PRODUCT)){

        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == frame.getProductDirPnl().getProductsComboBox()){
            frame.getProductDirPnl().getProductInformationTextArea().removeAll();

            LoginBusiness l = new LoginBusiness();
            User director = l.login(frame.getLoginPnl().getTextUser().getText(), frame.getLoginPnl().getTextPassword().getText());

            int i = frame.getProductDirPnl().getProductsComboBox().getSelectedIndex() - 1;
            ArrayList<Product> products = directorBusiness.bankProducts(director.getBranchUser().getBank().getIdBank());


            if (i>=0) {
                Product selectedProduct = products.get(i);
                String a;
                if (selectedProduct.getPrice() == -1)
                {a = "Il prezzo è a scelta dell'utente";}
                else { a = String.valueOf(selectedProduct.getPrice());}

                frame.getProductDirPnl().getProductInformationTextArea().setText("Product name: "+selectedProduct.getName()+
                        "\n description "+ selectedProduct.getDescription() +"\nPrice: "+ a+ "\n variable: " + selectedProduct.getVariable());
            }
        }

    }
    }

