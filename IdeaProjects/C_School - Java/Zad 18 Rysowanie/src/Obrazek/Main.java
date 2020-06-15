package Obrazek;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Rysunek");
        MyJPanel myJpanel = new MyJPanel();
        window.add(myJpanel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();

    }
}
