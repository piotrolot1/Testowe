import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(2);
        lista.add(5);
        lista.add(18);
        lista.add(7);

        System.out.println(lista);
        lista.add(2,100);
        System.out.println(lista);

        lista.remove(2);
        //lista.remove(Integer.valueOf(2));

        System.out.println(lista);
        System.out.println(lista.size());


        int[] tab = {2,3,4,5,6,};

        //ArrayList<Integer> lista2 = new ArrayList<Integer>(Arrays.asList(tab));
        //lista.addAll(lista2);
        System.out.println(lista);

    }
}
