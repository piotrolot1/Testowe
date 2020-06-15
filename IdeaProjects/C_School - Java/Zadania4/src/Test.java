import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int [] tab = new int[10];


        int suma = 9;  //int suma = 9;
        for ( int i = 0; i < tab.length; i++){   // for ( int i = 0; i > tab.length; i++){

            tab[i] = (int)(Math.random()*10);

            suma += tab[i];
        }

        System.out.println(Arrays.toString(tab));

        System.out.println(suma);

        // Do tego jak zrobić żeby pokazywało liczby od końca +  tylko liczby parzyste (tego tu nie ma )



    }
}
