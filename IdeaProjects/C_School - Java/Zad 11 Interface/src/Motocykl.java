public class Motocykl implements IRuch {

    private String marka;
    private int rocznik;
    private double waga;
    private int predkoscPoruszaniaSie;
    private int stanPaliwa;

    private static EWspolczynnikSzybkosci wspolczynnikSzybkosci = EWspolczynnikSzybkosci.BARDZO_SZYBKI;
    private static EStanPaliwa wspolczynnikPaliwa = EStanPaliwa.FULLMOTO;

    public Motocykl(String marka, int rocznik, double waga){
        this.marka=marka;
        this.rocznik = rocznik;
        this.waga = waga;
    }
    public String getMarka(){
        return marka;
    }
    public void setMarka(){
        this.marka =marka;
    }
    public int getRocznik(){
        return rocznik;
    }
    public void setRocznik(){
        this.rocznik = rocznik;
    }
    public double getWaga(){
        return waga;
    }
    public void setWaga(){
        this.waga= waga;
    }

    @Override
    public String toString() {
        return "Motocykl{" +
                "marka='" + marka + '\'' +
                ", rocznik=" + rocznik +
                ", waga=" + waga +
                '}';
    }

    public int getPredkosc(){

        return predkoscPoruszaniaSie;
    }

    public void wykonajRuch(int iloscJednostek){
        predkoscPoruszaniaSie += (wspolczynnikSzybkosci.getWspolczynnik()*iloscJednostek);
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Motocyk zatrzymał się.");
        predkoscPoruszaniaSie = 0;
    }

    //@Override
    //public int getStanPaliwa() {
    //    return stanPaliwa;
    //}
    //
    //@Override
    //public int paliwoPelne() {
    //    System.out.println("Paliwo pełne");
    //    return stanPaliwa =40;
    //}
    //
    //@Override
    //public int zerowaniePaliwa() {
    //    System.out.println("Wyzerowanie Paliwa");
    //    return stanPaliwa = 0;
    //}
    //
    //@Override
    //public void ponowneZatankowanie(int iloscJednostek2) {
    //    System.out.println("Ponowne zatankowanie");
    //    stanPaliwa += (wspolczynnikPaliwa.getWspolczynikPaliwa()*iloscJednostek2);
    //
    //}

}
