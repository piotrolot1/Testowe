public class Hulajnoga implements IPojazdyMechaniczne{

    private String nazwa;
    private String kola;
    private int cena;
    private int predkoscPoruszaniaSie;
    private int stanPaliwa;

    private static EWspolczynnikSzybkosci wspolczynnikSzybkosci = EWspolczynnikSzybkosci.WOLNY;
    private static EStanPaliwa wspolczynikPaliwa = EStanPaliwa.PELNY;


    public Hulajnoga(String nazwa, String kola, int cena) {
        this.nazwa = nazwa;
        this.kola = kola;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }
    public String getKola() {
        return kola;
    }
    public int getCena() {
        return cena;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setKola(String kola) {
        this.kola = kola;
    }
    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Hulajnoga{" +
                "nazwa='" + nazwa + '\'' +
                ", kola='" + kola + '\'' +
                ", cena=" + cena +
                '}';
    }

    @Override
    public int paliwoPelne() {
        return stanPaliwa=30;
    }

    @Override
    public int getStanPaliwa() {
        return stanPaliwa;
    }
    @Override
    public int zerowaniePaliwa() {
        System.out.println(" ");
        return stanPaliwa;
    }

    @Override
    public void ponowneZatankowanie(int iloscJednostek2) {
    }



    @Override
    public boolean samochodDobry() {
        System.out.println("Hulajnoga jest w dobrym stanie.");
        return true;
    }

    @Override
    public boolean samochodZepsuty() {
        System.out.println("Hulajnoga zepsuła się.");
        return false;
    }

    @Override
    public void naprawaSamochodu() {
        if ( samochodZepsuty() == false){
            System.out.println("Naprawiono Hulajnoge");
        }

    }
}
