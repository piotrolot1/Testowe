package Szachownica;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MyJPanel2 extends JPanel {

    public Figura Figura;
    private List<Figura> listaFigur;

    public MyJPanel2(){
        listaFigur = new ArrayList<>();
        listaFigur.add(Figura);
        repaint();
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for(Figura k : listaFigur)
            g.setColor(g.getColor());
        g.fillRect(0,0,10,10);

            }

    public Dimension getPreferredSize(){
        return new Dimension(500,500);
    }

}
