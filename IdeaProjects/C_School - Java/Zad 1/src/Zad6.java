public class Zad6 {
    public static void main(String[] args) {

        int liczba = 123;
        int sum = 0;

        while (liczba > 0) {

            int cyfra = liczba % 10;
            sum = sum + cyfra;

            liczba = (liczba - cyfra) / 10;

            System.out.println("Suma cyfr : " + sum);

        }
    }
}
// Napisz program wypisujący sumę cyfr danej liczby