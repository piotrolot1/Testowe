import javax.swing.*;

public class NiepoprawneLogowanie extends JPanel {

    public NiepoprawneLogowanie(){
        setLayout(null);

        JLabel nieLog = new JLabel ("Nie poprawne dane do logowania.");
        nieLog.setBounds(65,100,200,50);
        add(nieLog);

    }

}
