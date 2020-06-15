
import java.util.Random;

enum  Figura {

    DWA(2),
    TRZY(3),
    CZTERY(4),
    PIEC(5),
    SZCESC(6),
    SIEDEM(7),
    OSIEM(8),
    DZIEWIEC(9),
    DZIESIEC(10),
    WALET(11),
    DAMA(12),
    KROL(13),
    AS(14);

    private int figura;

    private Figura(int figura) {
        this.figura = figura;
    }

    public int getWartosc() {
        return figura;
    }

}

enum Kolor {
    TREFL(1),
    KARO(2),
    KIER(3),
    PIK(4);

    private int kolor;

    private Kolor(int kolor) {
        this.kolor = kolor;
    }

    public int getKolor() {
        return kolor;
    }

    static class Karta {

        private Kolor kolor;
        private Figura figura;

        public Karta(Kolor kolor, Figura figura) {
            this.kolor = kolor;
            this.figura = figura;
        }

        public String toString() {
            StringBuilder ka = new StringBuilder();

            ka.append(" dostaje kartę : ");
            ka.append(figura);
            ka.append(" ");
            ka.append(kolor);

            return ka.toString();
        }
    }

    public static class Main {
        public static void main(String[] args) {
            int Osoba = 4;
            int i = 1;

            Karta k1 = new Karta(Kolor.TREFL, Figura.DZIESIEC);

            while (i < Osoba) {
                System.out.println("Osoba nr : " + i + k1);
                i++;
            }
            Karta k5 = new Karta(Kolor.PIK, Figura.AS);
            Karta k2 = new Karta(Kolor.KIER, Figura.DAMA);
            Karta k3 = new Karta(Kolor.TREFL, Figura.OSIEM);


            System.out.println(k5);
            System.out.println(k2);
            System.out.println(k3);
        }
    }
}







