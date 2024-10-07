package myjavaproject;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class simpleExextendsJFrame {

    public simpleEx() {

        initUI();
    }

    private void initUI() {
        
        setTitle("Simple example");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new simpleEx();
            ex.setVisible(true);
        });
    }
}