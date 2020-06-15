import java.lang.reflect.Array;

public class WyciaganieSlowZString {

    public static void main(String[] args) {

        String greeting = "Hello this is just an example";

        int end = 0;


        for (int i=0; i<3; i++) {
            end = greeting.indexOf(' ', end) +1;

        }

        String Z = greeting.substring(0, end - 1);

        System.out.println(Z);
    }
}

