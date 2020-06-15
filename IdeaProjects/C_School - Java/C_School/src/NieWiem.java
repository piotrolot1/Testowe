import java.util.Arrays;

public class NieWiem {

    public static void main(String[] args) {

        int [] tab = new int[10];
        int suma = 0;


        for (int i = 0; i < tab.length; i++){

            if ( i % 2 == 0){
                tab[i] = i;
                suma += i;

            }else{
                tab[i] = -1;
            }
        }


        System.out.println(Arrays.toString(tab));
        System.out.println(suma);

    }
}
