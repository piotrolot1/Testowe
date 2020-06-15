public class Assasin implements IOtrzymaneObrazenia {

    private String imie;
    private int obrazenia;
    private int predkosc;

    private int stanZdrowia1;
    private int stanZdrowia2;

    private static EWspolczynikZdrowia wspolczynikObrazen = EWspolczynikZdrowia.ASSAIN;

    public Assasin(String imie, int obrazenia, int predkosc) {
        this.imie = imie;
        this.obrazenia = obrazenia;
        this.predkosc = predkosc;
    }

    public String getImie() {
        return imie;
    }

    public int getObrazenia() {
        return obrazenia;
    }

    public int getPredkosc() {
        return predkosc;
    }

    @Override
    public String toString() {
        return "Assasin{" +
                "imie='" + imie + '\'' +
                ", obrazenia=" + obrazenia +
                ", predkosc=" + predkosc +
                '}';
    }

    @Override
    public int getStanZdrowia() {
        return stanZdrowia1 = 100;
    }

    @Override
    public int otrzymaneObrazenia(int iloscJednostek) {
        stanZdrowia2 = stanZdrowia2- (wspolczynikObrazen.getWspolczynik()*iloscJednostek);
        return stanZdrowia2;
    }

    @Override
    public int getStanZdrowia2() {
        return stanZdrowia1 + stanZdrowia2;
    }

    @Override
    public void Zdowie() {

    }
}
