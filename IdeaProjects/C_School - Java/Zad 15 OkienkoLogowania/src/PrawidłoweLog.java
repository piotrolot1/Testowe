import javax.swing.*;

public class PrawidłoweLog extends JPanel {

    public PrawidłoweLog(){
        setLayout(null);

        JLabel zalogowane = new JLabel("Udało ci się zalogować.");
        zalogowane.setBounds(65,100,200,50);
        add(zalogowane);
    }
}
