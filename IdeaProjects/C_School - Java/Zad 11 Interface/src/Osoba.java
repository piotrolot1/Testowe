public class Osoba implements IRuch {



    private String imie;
    private String nazwisko;
    private int rokUrodzenia;
    private int predkoscPoruszaniaSie;

    private static EWspolczynnikSzybkosci wspolczynnikSzybkosci = EWspolczynnikSzybkosci.WOLNY;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        super();
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(){
        this.imie=imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(){
        this.nazwisko = nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }
    public void setRokUrodzenia(){
        this.rokUrodzenia = rokUrodzenia;
    }
    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }

    @Override
    public int getPredkosc() {
        return predkoscPoruszaniaSie;
    }

    @Override
    public void wykonajRuch(int iloscJednostek) {
        predkoscPoruszaniaSie += (wspolczynnikSzybkosci.getWspolczynnik()*iloscJednostek);
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Osoba zatrzymała się");
        predkoscPoruszaniaSie = 0;
    }
}
