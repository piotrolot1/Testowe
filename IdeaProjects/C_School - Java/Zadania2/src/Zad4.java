public class Zad4 {

    public static void main(String[] args) {
        int a = 28;
        int i = 1;
        int b = 0;

        while (i < a) {
            if (a % i == 0) {
                b = b + i;
            }
            ++i;
        }

        if (b == a) {
            System.out.println(("Liczba " + a + " jest liczbą doskonałą"));
        }else {
            System.out.println("Liczba " + a + " nie jest liczbą doskonałą");
        }
        }
    }