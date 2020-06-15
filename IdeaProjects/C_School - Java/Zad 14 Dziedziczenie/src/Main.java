import java.util.*;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap <String, PojazdNaziemny> hashMap = new HashMap<String, PojazdNaziemny>();


        hashMap.put("czołg1",new Czolg(2000));
        hashMap.put("czolg2",new Czolg(500));
        hashMap.put("pojazd1",new PojazdNaziemny("Audi A3",30,1001));

        System.out.println(hashMap);

        Set<String> set = hashMap.keySet();

        Iterator<String> it = set.iterator();

        while (it.hasNext()) System.out.println((hashMap.get(it.next()).getNumer()));

        //while (it.hasNext()) System.out.println((hashMap.get(it.next()).getNumer()));

    }
}
