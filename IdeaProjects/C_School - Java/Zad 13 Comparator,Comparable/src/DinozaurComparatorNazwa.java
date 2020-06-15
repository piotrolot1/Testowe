import java.util.Comparator;

public class DinozaurComparatorNazwa implements Comparator<Dinozaur> {

    public int compare(Dinozaur o1, Dinozaur o2){
        return o1.getNazwa().compareTo(o2.getNazwa());
    }
}
