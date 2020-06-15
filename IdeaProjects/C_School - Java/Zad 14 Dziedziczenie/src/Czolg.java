public class Czolg extends PojazdNaziemny {
    int waga;

    public Czolg(int waga){
        super("A1 Abrams", 100,300);
        this.waga = waga;
    }

    @Override
    public String toString() {
        return "Czolg{" +
                "waga=" + waga +
                ", nazwa='" + nazwa + '\'' +
                ", zadawaneObrazenia=" + zadawaneObrazenia +
                ", zasieg=" + zasieg +
                '}';
    }
}
