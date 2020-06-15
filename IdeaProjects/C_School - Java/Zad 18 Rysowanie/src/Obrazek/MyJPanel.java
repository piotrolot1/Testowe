package Obrazek;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class MyJPanel extends JPanel{

    private List<Figura> listaFigur;

    class Akcja extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            Figura f = (Math.random() > 0.5) ? new Kolo(e.getX(), e.getY()) : new Kwadrat(e.getX(), e.getY());
            listaFigur.add(f);
            repaint();
        }
    }

    public MyJPanel() {
        addMouseListener(new Akcja());
        listaFigur = new ArrayList<Figura>();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(Figura f : listaFigur)
            if(f instanceof Kolo) {
                g.setColor(f.getColor());
                g.fillOval(f.getX(), f.getY(), f.getWidth(), f.getHeight());
            }else {
                g.setColor(f.getColor());
                g.fillRect(f.getX(), f.getY(), f.getWidth(), f.getHeight());
            }

    }
}
