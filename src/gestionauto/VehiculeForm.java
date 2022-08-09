package gestionauto;

import javax.swing.*;

public class VehiculeForm {
    private JPanel vehicule;
    private JTextField textField1;
    private JButton AJOUTERButton;
    private JButton ANNULERButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Véhicule");
        frame.setContentPane(new VehiculeForm().vehicule);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
