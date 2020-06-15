package Obrazek;

import java.awt.*;

public class Kolo extends Figura {

    public Kolo(int x, int y) {
        super(x, y, (int)(Math.random() * 100), (int)(Math.random() * 100), new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));
    }

}