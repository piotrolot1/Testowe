import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tank tank1 = new Tank("Barbarzynca",30,30);
        Mag mag1 = new Mag("Gandalf",50,40);
        Assasin assasin1 = new Assasin("Legolas", 40,50);

        IOtrzymaneObrazenia elementyobrazenia[] ={tank1,mag1,assasin1};

        String lista = Arrays.toString(elementyobrazenia);

        char[] lista1 = lista.toCharArray();
        System.out.println(lista1);
        System.out.println(" ");

        for (IOtrzymaneObrazenia o : elementyobrazenia){
            System.out.println("Stan początkowy zdrowia : " + o.getStanZdrowia());
            System.out.println("Otrzymane obrażenia : " + o.otrzymaneObrazenia(10));
            System.out.println("Stan zdrowia po uderzeniu : "+o.getStanZdrowia2());
            System.out.println(" ");
        }
    }
}
