import javax.swing.*;

public class kontoUtworzone extends  JPanel {

    public kontoUtworzone () {
        setLayout(null);

        JLabel kontoZalozone = new JLabel("Twoje konto zostało utworzone.");
        kontoZalozone.setBounds(50,100,250,40);
        add(kontoZalozone);
    }
}
