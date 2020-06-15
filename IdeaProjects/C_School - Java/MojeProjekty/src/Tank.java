public class Tank implements IOtrzymaneObrazenia{

    private String imie;
    private int obrazenia;
    private int predkosc;

    private int stanZdrowia;
    private int stanZdrowia2;

    private static EWspolczynikZdrowia wspolczynikZdrowia = EWspolczynikZdrowia.TANK;


    public Tank(String imie, int obrazenia, int predkosc) {
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

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setObrazenia(int obrazenia) {
        this.obrazenia = obrazenia;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "imie='" + imie + '\'' +
                ", obrazenia='" + obrazenia + '\'' +
                ", predkosc='" + predkosc + '\'' +
                '}';
    }

    @Override
    public int getStanZdrowia() {
        return  stanZdrowia= 100;
    }

    @Override
    public int otrzymaneObrazenia(int iloscJednostek) {
        stanZdrowia2 -= (wspolczynikZdrowia.getWspolczynik()*iloscJednostek);
        return stanZdrowia2;
    }

    @Override
    public int getStanZdrowia2() {
        return stanZdrowia2 = stanZdrowia+stanZdrowia2;
    }

    @Override
    public void Zdowie() {
       stanZdrowia = 0;;
    }
}
