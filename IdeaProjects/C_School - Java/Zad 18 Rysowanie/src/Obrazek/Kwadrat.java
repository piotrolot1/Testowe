package Obrazek;

import java.awt.Color;

public class Kwadrat extends Figura {

    public Kwadrat(int x, int y) {
        super(x, y, (int)(Math.random() * 100), (int)(Math.random() * 100), new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));

    }
}
