public class Zad5 {
    public static void main(String[] args) {

        int i = 2;
        int b = 0;


        for (int a= 1; a < i; a++) {

            if (i % a == 0) {
                b += 1;
            }
        }
        if (b > 2){
            System.out.println("Liczba "+ i + " nie jest pierwszą");

        }else{
            System.out.println("Liczba " + i + " jest liczba pierwsza");
            }
        }


    }

// Napisz program wypisujący komunikat czy konkretna liczba jest liczbą pierwszą