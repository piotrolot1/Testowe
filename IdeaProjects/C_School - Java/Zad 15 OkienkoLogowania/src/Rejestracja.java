import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;


public class Rejestracja extends JPanel {

    static JTextField inputImie;
    static JTextField inputHaslo;
    static String noweImie;
    static String noweHaslo;

    class AkcjaNaTextField implements ActionListener, Serializable {


        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame window = new JFrame("Konto utworzone");

            window.add(new kontoUtworzone());
            window.setVisible(true);
            window.setSize(300,300);
            window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            noweImie = inputImie.getText();
            noweHaslo = inputHaslo.getText();

            System.out.println(noweImie);
            System.out.println(noweHaslo);

            new User (noweImie,noweHaslo);
            User.zapisPlik();
            }
    }
    public Rejestracja(){

        setLayout(null);

        JLabel nick =new JLabel("Imię : ");
        nick.setBounds(50, 30,100,20);
        add(nick);

        inputImie = new JTextField();
        inputImie.setBounds(150, 30,100,20);
        add(inputImie);

        JLabel email = new JLabel("E-mail : ");
        email.setBounds(50,60,100,20);
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(150,60,100,20);
        add(emailTextField);

        JLabel haslo = new JLabel("Hasło :");
        haslo.setBounds(50,90,100,20);
        add(haslo);

        inputHaslo = new JPasswordField();
        inputHaslo.setBounds(150,90,100,20);
        add(inputHaslo);

        JLabel hasloPon =new JLabel("Powtórz hasło :");
        hasloPon.setBounds(50,120,100,20);
        add(hasloPon);

        JTextField hasloPonPol = new JTextField();
        hasloPonPol.setBounds(150,120,100,20);
        add(hasloPonPol);

        JLabel zainteresowanie = new JLabel("Zainteresowania :");
        zainteresowanie.setBounds(50,150,150,20);
        add(zainteresowanie);

        JCheckBox kolarstwo = new JCheckBox("Kolarstwo");
        kolarstwo.setBounds(160, 150,100,20);
        add(kolarstwo);

        JCheckBox java = new JCheckBox("Java");
        java.setBounds(270,150,100,20);
        add(java);

        JCheckBox stolarstwo = new JCheckBox("Stolarstwo");
        stolarstwo.setBounds(360,150,100,20);
        add(stolarstwo);

        JCheckBox technologia = new JCheckBox("Technologia");
        technologia.setBounds(160,180,150, 20);
        add(technologia);

        JCheckBox gotowanie = new JCheckBox("Gotowanie");
        gotowanie.setBounds(270,180,150,20);
        add(gotowanie);


        JLabel plec= new JLabel("Płeć :");
        plec.setBounds(50,210,100,20);
        add(plec);

        JRadioButton kobieta = new JRadioButton("Kobieta");
        kobieta.setBounds(100, 210,100,20);
        add(kobieta);

        JRadioButton mezczyzna = new JRadioButton("Mężczyzna");
        mezczyzna.setBounds(200,210,100,20);
        add(mezczyzna);

        ButtonGroup group = new ButtonGroup(); // Można wybrać tylko raz mężczyzna albo kobieta
        group.add(kobieta);
        group.add(mezczyzna);

        JLabel wyksztalcenieJLabel = new JLabel("Wykształcenie : ");
        wyksztalcenieJLabel.setBounds(50,240,150,20);
        add(wyksztalcenieJLabel);

        String[] wyksz = {"Podstawowe","Średnie","Techniczne","Wyższe"};
        JComboBox wyksztalcenie = new JComboBox(wyksz);
        wyksztalcenie.setBounds(150,240,130,20);
        add(wyksztalcenie);

        JButton wyczysc = new JButton("Wyczyść");
        wyczysc.setBounds(150,280,100,20);
        add(wyczysc);

        JButton zarejestruj = new JButton("Rejestruj");
        zarejestruj.addActionListener(new AkcjaNaTextField());
        zarejestruj.setBounds(280,280,100,20);
        add(zarejestruj);
    }
    public Dimension getPreferredSize(){
        return new Dimension(500,500);

    }
}
