package gestionauto;

import javax.swing.*;

public class PiecesForm {
    private JTextField textField1;
    private JTextField textField2;
    private JPanel piece;
    private JButton AJOUTERButton;
    private JButton ANNULER;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Piece");
        frame.setContentPane(new PiecesForm().piece);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
