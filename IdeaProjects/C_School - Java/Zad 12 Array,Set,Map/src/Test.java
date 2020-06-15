import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {

        Map<Integer, String> employees = new TreeMap<>();
        employees.put(111, "Jan Kowalski");
        employees.put(333, "Wojciech Kowalski");
        employees.put(222, "Kasia Piotrowska");
        employees.put(555, "Anna Zawadzka");
        employees.put(444, "Jan Kowalski");

        //System.out.println("Ilość pracowników: " + employees.size());

        Set<Integer> keySet = employees.keySet();
        System.out.println("Klucze:\n" + keySet);

        Collection<String> values = employees.values();
        System.out.println("Wartości:\n" + values);

        Set<Entry<Integer,String>> entrySet = employees.entrySet();
        for(Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}