package gestionauto;

import javax.swing.*;

public class ConducteurForm {
    private JTextField textField1;
    private JTextField textField2;
    private JButton AJOUTERButton;
    private JButton ANNULERButton;
    private JPanel conducteur;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Véhicule");
        frame.setContentPane(new ConducteurForm().conducteur);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
