import java.util.*;
import java.util.HashMap;
import java.util.Set;

public class Zajecia {
    public static void main(String[] args) {

     ArrayList<Integer> lista = new ArrayList<Integer>();

     lista.add(2);
     lista.add(5);
     lista.add(18);
     lista.add(7);
     lista.add(18);
     lista.add(7);
     lista.add(18);
     lista.add(7);
//
//
//		System.out.println(lista);
//		lista.add(2, 100);
//		System.out.println(lista);
//		lista.remove(Integer.valueOf(2));
//
//		System.out.println(lista);
//		System.out.println(lista.size());
//
//		Integer[] tab = { 2, 3, 4, 5, 6, 7, 8 };
//
//		ArrayList<Integer> lista2 = new ArrayList<Integer>(Arrays.asList(tab));
//		lista.addAll(lista2);
//
//		System.out.println(lista);
//
//		System.out.println(lista.contains(18));
//
//		lista.removeAll(lista2);
//
//		System.out.println(lista);
//
//
//		System.out.println(lista.get(4));
//		lista.get(-1);
//
//
      HashSet<Integer> zbior = new HashSet<Integer>();

      zbior.add(4);
      zbior.add(10);
      zbior.add(40);
      zbior.add(42);

      HashSet<Integer> zbior2 = new HashSet<Integer>(lista);

      //System.out.println(zbior);
      //System.out.println(zbior2);

	//	System.out.println(zbior.size());

		Iterator<Integer> it = zbior.iterator();

       // System.out.println(it);
	//	while(it.hasNext()) {
	//		System.out.println(it.next());
	//	}


		zbior.forEach(System.out::println);
//		zbior.forEach(e -> System.out.println(e));

//		TreeSet<Integer> tree = new TreeSet<Integer>(zbior2);
//
//		System.out.println(tree);

        // TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        //
        // map.put(4, "Czworka");
        // map.put(2, "Dwójka");
        // map.put(19, "Coś");
        // map.put(-5, "Ujemna");
//	// map.put(null, "Komputer");
        // map.put(2, "Trójka");
        // map.put(20, null);
        // map.put(21, null);
        //
        // TreeMap<String, Integer> map2 = new TreeMap<String, Integer>();
        //
        // map2.put("ń", 6);
        // map2.put("Żółć", 50);
        // map2.put("n", 6);
        // map2.put("ćma", 2);
        // map2.put("2cma", 3);
        //
        //
        //
        // System.out.println(map2);
//		System.out.println(map.get(1));


        // Tworzymy stringa
        // zapisujemy go w pliku słowo pod słowem
        // odczytujemy słowa na liste

//		1. wypisz ilość różnych słów
//		2. posortuj alfabetycznie
//		3. posortuj od nakrótszego do najdłuższego
//		4.
		}
}
