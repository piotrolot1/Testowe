import java.util.Arrays;
import java.util.Random;

public class KopiaTablicy {
    public static void main(String[] args) {


        int [] tab = new int [10];

        for (int i = 0; i<tab.length; i++){

            tab[i] = (int)(Math.random()*21);


        }
        System.out.println(Arrays.toString(tab));
        int [] tab1 = new int [10];

        System.arraycopy(tab,0,tab1,0,10);

        System.out.println(Arrays.toString(tab1));
    }
}
