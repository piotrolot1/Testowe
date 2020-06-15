public class Zad3 {
    public static void main(String[] args) {

        int a = 6;
        int b = 0;

        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                b += 1;
            }
        }
        if ( b > 2){
            System.out.println( a + " nie jest liczbą pierwszą");
        } else {
            System.out.println(a + " jest liczbą pierwszą");
        }
    }
}

    //3. Napisz program z wykorzystaniem pętli for, który sprawdzi czy dana liczba jest liczbą pierwszą