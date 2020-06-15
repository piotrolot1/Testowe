package Animacja;


import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

class MyJPanel extends JPanel{

    class Pilka{
        int x;
        int y;
        int dx = 3;
        int dy = 2;
        int srednica = 40;

        public Pilka(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }

    }

    Pilka p = new Pilka(0, 0);

    public MyJPanel() {

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(p.x, p.y, p.srednica, p.srednica);

    }

    public void animacja() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            p.x += p.dx;
            p.y += p.dy;

            repaint();

        }
    }
}
