package it.homebank.sportello.View.Panel.DirectorPanels;

import javax.swing.*;

public class ProductDirPanel {
    private JPanel productDirPanel;
    private JTextArea productInformationTextArea;
    private JButton deleteProductButton;
    private JComboBox productsComboBox;
    private JLabel productLabel;
    private JTextField nameField;
    private JTextField priceField;
    private JTextField descriptionField;
    private JCheckBox variablePriceCheckBox;
    private JLabel nameLabel;
    private JLabel priceLabel;
    private JLabel descriptionLabel;
    private JLabel variableLable;
    private JTextField variableField;
    private JButton confirmNewProductButton;
    private JLabel newProductLabel;
    private JButton backButton;
    private JScrollPane test;

    public ProductDirPanel() {
        productDirPanel.getUI();
        productDirPanel.setVisible(false);

    }

    public JPanel getProductDirPanel() {
        return productDirPanel;
    }

    public void setProductDirPanel(JPanel productDirPanel) {
        this.productDirPanel = productDirPanel;
    }

    public JTextArea getProductInformationTextArea() {
        return productInformationTextArea;
    }

    public void setProductInformationTextArea(JTextArea productInformationTextArea) {
        this.productInformationTextArea = productInformationTextArea;
    }

      public JButton getDeleteProductButton() {
        return deleteProductButton;
    }

    public void setDeleteProductButton(JButton deleteProductButton) {
        this.deleteProductButton = deleteProductButton;
    }

    public JComboBox getProductsComboBox() {
        return productsComboBox;
    }

    public void setProductsComboBox(JComboBox productsComboBox) {
        this.productsComboBox = productsComboBox;
    }

    public JLabel getProductLabel() {
        return productLabel;
    }

    public void setProductLabel(JLabel productLabel) {
        this.productLabel = productLabel;
    }

    public JTextField getNameField() {
        return nameField;
    }

    public void setNameField(JTextField nameField) {
        this.nameField = nameField;
    }

    public JTextField getPriceField() {
        return priceField;
    }

    public void setPriceField(JTextField priceField) {
        this.priceField = priceField;
    }

    public JTextField getDescriptionField() {
        return descriptionField;
    }

    public void setDescriptionField(JTextField descriptionField) {
        this.descriptionField = descriptionField;
    }

    public JCheckBox getVariablePriceCheckBox() {
        return variablePriceCheckBox;
    }

    public void setVariablePriceCheckBox(JCheckBox variablePriceCheckBox) {
        this.variablePriceCheckBox = variablePriceCheckBox;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JLabel getPriceLabel() {
        return priceLabel;
    }

    public void setPriceLabel(JLabel priceLabel) {
        this.priceLabel = priceLabel;
    }

    public JLabel getDescriptionLabel() {
        return descriptionLabel;
    }

    public void setDescriptionLabel(JLabel descriptionLabel) {
        this.descriptionLabel = descriptionLabel;
    }

    public JLabel getVariableLable() {
        return variableLable;
    }

    public void setVariableLable(JLabel variableLable) {
        this.variableLable = variableLable;
    }

    public JTextField getVariableField() {
        return variableField;
    }

    public void setVariableField(JTextField variableField) {
        this.variableField = variableField;
    }

    public JButton getConfirmNewProductButton() {
        return confirmNewProductButton;
    }

    public JScrollPane getTest() {
        return test;
    }

    public void setTest(JScrollPane test) {
        this.test = test;
    }

    public void setConfirmNewProductButton(JButton confirmNewProductButton) {
        this.confirmNewProductButton = confirmNewProductButton;

    }

    public JLabel getNewProductLabel() {
        return newProductLabel;
    }

    public void setNewProductLabel(JLabel newProductLabel) {
        this.newProductLabel = newProductLabel;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }
}
