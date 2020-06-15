
public enum EWspolczynnikSzybkosci {

    WOLNY(1),
    SZYBKI(2),
    BARDZO_SZYBKI(3);

    private int wspolczynnik;

    private EWspolczynnikSzybkosci(int wspolczynnik){

        this.wspolczynnik = wspolczynnik;
    }
    public int getWspolczynnik(){

        return this.wspolczynnik;
    }

}
