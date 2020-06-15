package Szachownica;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Szachownica");
        MyJPanel2 myJpanel2 = new MyJPanel2();
        window.add(myJpanel2);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
    }
}
