import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Panel logowania DA");

        window.add(new Logowanie());

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
        User.odczytPlik();
        //window.dispose();


    }
}
