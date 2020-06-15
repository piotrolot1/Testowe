import org.w3c.dom.ls.LSOutput;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dinozaur[] tablicaDinozaurow = new Dinozaur[5];

        tablicaDinozaurow[0] =new Dinozaur("Tyranozaur",10,70);
        tablicaDinozaurow[1] = new Dinozaur("Pterodaktyl",3,40);
        tablicaDinozaurow[2] = new Dinozaur("Sterodaktyl",2,100);
        tablicaDinozaurow[3] = new Dinozaur("Javozaur", 10,40);
        tablicaDinozaurow[4] = new Dinozaur("Dino", 0,1000);

        List<Dinozaur>listaDinozaurow = Arrays.asList(tablicaDinozaurow);

        System.out.println(Arrays.toString(tablicaDinozaurow));

        for (Dinozaur d : tablicaDinozaurow)
            System.out.println(d);

        Arrays.sort(tablicaDinozaurow);
        //Collections.sort(listaDinozaurow, new Dinozaur.DinozaurComparatorPoziomStrasznosci());

        for(Dinozaur d :listaDinozaurow)
            System.out.println(d);

    }

}
