import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Logowanie extends JPanel {
    static JTextField inputImie1;
    static JTextField inputHaslo1;
    static String wpiszImie3;
    static String wpiszHaslo3;

    class AkcjaNaJTextField implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame window = new JFrame("Strona do rejestracji DA");

            window.add(new Rejestracja());
            window.setSize(500, 500);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);

            // window.setVisible(false);
            // window.dispose();
        }
    }

    class AkcjaNaJTextFieldZleLogowanie implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame windowZlyLogin = new JFrame("Nie poprawny login.");

            windowZlyLogin.add(new NiepoprawneLogowanie());
            windowZlyLogin.setSize(300, 300);
            windowZlyLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            windowZlyLogin.setVisible(true);
        }
    }


    class AkcjaNaJTexFieldZLogin implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame windowZalogowany = new JFrame("Zalogowano");


            windowZalogowany.add(new PrawidłoweLog());
            windowZalogowany.setSize(300, 300);
            windowZalogowany.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            windowZalogowany.setVisible(true);

            wpiszImie3 = inputImie1.getText();
            wpiszHaslo3 = inputHaslo1.getText();
            System.out.println(wpiszImie3);
            System.out.println(wpiszHaslo3);


            //if (User.veryfikacja(User.loginverwa,wpiszImie3))
            //    System.out.println("Nowy sposob udało sie ");

            User.veryfikacja(User.loginverwa, wpiszImie3);
        }
    }

    public Logowanie() {
        setLayout(null);


        // for (int i =0; i<10;i++){
        //     JButton zaloguj = new JButton("Zaloguj");
        //     zaloguj.setBounds(250,400,100,50);
        //     add(zaloguj);
        // }

        JButton zaloguj = new JButton("Zaloguj");


            zaloguj.addActionListener(new AkcjaNaJTexFieldZLogin());
           // zaloguj.addActionListener(new AkcjaNaJTextFieldZleLogowanie());
           // zaloguj.addActionListener(new AkcjaNaJTexFieldZLogin());
            zaloguj.setBounds(250, 350, 100, 50);
            add(zaloguj);

            JButton wyczysc = new JButton("Wyczyść");
            wyczysc.setBounds(150, 350, 100, 50);
            add(wyczysc);

            JLabel login = new JLabel("Login : ");
            login.setBounds(150, 105, 100, 20);
            add(login);

            inputImie1 = new JTextField();
            inputImie1.setBounds(200, 100, 150, 30);
            add(inputImie1);

            JLabel haslo = new JLabel("Hasło : ");
            haslo.setBounds(150, 135, 100, 20);
            add(haslo);

            inputHaslo1 = new JTextField();
            inputHaslo1.setBounds(200, 130, 150, 30);
            add(inputHaslo1);

            JButton rejestracja = new JButton("Zarejestruj");
            rejestracja.addActionListener(new AkcjaNaJTextField());
            rejestracja.setBounds(210, 400, 100, 30);
            add(rejestracja);

        }
        public Dimension getPreferredSize () {
            return new Dimension(500, 500);

        }
    }
