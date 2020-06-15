import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelPierwszy1 extends JPanel {
    JFrame ramkaGlowna;
    JTextField input;

    class AkcjaNaPrzycisku implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("dhakfjhad");
        }
    }
    class AkcjaNaEtykiecie implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("jestem klikniety");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("jestem przycisniety");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("zwolnilem klikniecie");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Najechałem na element");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Zjechalem z elementu");
        }
    }
    class AkcjaNaTextField implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame window = new JFrame("Moje drugie gui");

            window.setSize(200,200);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);

            ramkaGlowna.setVisible(false);
            ramkaGlowna.dispose();

            String str = input.getText(); // Zabiera tekst z naszej aplikacji teraz trzeba zapisać w txt na pulpit
            System.out.println(str);
        }
    }
    public PanelPierwszy1(JFrame ramka){
        this.ramkaGlowna = ramka;

        setLayout(null);

        JButton klawisz = new JButton("Zaloguj");
        klawisz.addActionListener(new AkcjaNaTextField());
        klawisz.setBounds(100,50,100,50);
        add(klawisz);

        JLabel etykieta = new JLabel("etykieta");
        etykieta.addMouseListener(new AkcjaNaEtykiecie());

        etykieta.setBounds(300,50,100,20);
        add(etykieta);

        input = new JTextField();
        input.setBounds(300,300,100,30);
        add(input);

    }

    public Dimension getPreferredSize(){
        return new Dimension(500,500);
    }


}