package src;

import src.gui.Ventana;

import javax.swing.*;

public class principal {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            new Ventana().setVisible(true);
        });

    }
}
