​ class Wirus {
        String nazwa;
        int poziomZagrozenia;
        int szybkoscRozprzestrzeniania;
        boolean czyKomputerowy;

       // public String toString() {
       //     return "Nazwa: " + nazwa; // nazwa drukuje sie cala ktora jest ponieżej w nazwie
        }​

    public class Main {​
        public static void main(String[] args) {
            Wirus koronawirus = new Wirus();
            koronawirus.nazwa = "Koronawirus";
            koronawirus.poziomZagrozenia = 9;
            koronawirus.szybkoscRozprzestrzeniania = 8;
            koronawirus.czyKomputerowy = false;

            Wirus rootkit = new Wirus();
            rootkit.nazwa = "rootkit";
            rootkit.czyKomputerowy = true;
            rootkit.poziomZagrozenia = 7;
            rootkit.szybkoscRozprzestrzeniania = 1;

            System.out.println(koronawirus); //
            System.out.println(rootkit);

        }
    }



