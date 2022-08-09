package gestionauto;

import javax.swing.*;

public class userForm {
    private JPanel user;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JComboBox comboBox1;
    private JButton AJOUTERButton;
    private JButton ANNULERButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Utilisateur");
        frame.setContentPane(new userForm().user);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
