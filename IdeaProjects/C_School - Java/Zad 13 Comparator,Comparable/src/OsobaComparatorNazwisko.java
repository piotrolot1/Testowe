import java.util.Comparator;

public class OsobaComparatorNazwisko implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        int wynik = o1.getNazwisko().compareTo(o2.getNazwisko());
        return wynik;
    }
}
