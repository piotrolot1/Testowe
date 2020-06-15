import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {

        Scanner nowy = new Scanner(System.in);
        System.out.println("Jak masz na imię ? ");

        String imie = nowy.nextLine();
        System.out.println("Twoje imię to " + imie);
        nowy.nextLine();
        

        System.out.println(" ile masz lat ? ");
        int lat = nowy.nextInt();

        System.out.println(" masz tyle lat " + lat);

        int rok = nowy.nextInt();
        System.out.println("rok wynosi " +rok);
    }
}
