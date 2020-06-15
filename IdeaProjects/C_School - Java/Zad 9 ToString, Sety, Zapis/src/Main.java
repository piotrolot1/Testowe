import sun.font.TrueTypeFont;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//        Quad quad1 = new Quad ("Yamaha", "Sting", true, -500);
//        Quad quad2 = new Quad("Suzuki", "Hornet",false, 1000);
        Quad2 quad3= new Quad2("Zmyślona",100,-2000,50);
        Quad2 quad4 = new Quad2("Suzuki",200,100,500);
        Quad2 quad5 = new Quad2("yamaha",200,11,22);
        Quad2 quad6 = new Quad2 ("kymko",100,11,22);

//        System.out.println(quad1);
//        System.out.println(quad2);
//        System.out.println();
//        System.out.println(" ");
        System.out.println(quad3);
        System.out.println(quad4);
    }
}
