import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("Moja pierwsza aplikacja GUI");

        window.add(new PanelPierwszy1(window));

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
    }
}
