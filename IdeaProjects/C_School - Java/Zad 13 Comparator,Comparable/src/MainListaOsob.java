import java.util.*;

public class MainListaOsob  {

    public static void main(String[] args) {

        Osoba[] tablicaOsob = new Osoba[6];

        tablicaOsob[0] = new Osoba("Tomek", "Kowalski", 18);
        tablicaOsob[1] = new Osoba("Jan", "Rozmaryn", 22);
        tablicaOsob[2] = new Osoba("Sergiusz", "Cyliński", 20);
        tablicaOsob[3] = new Osoba("Patryk", "Niewidosmi", 30);
        tablicaOsob[4] = new Osoba("Agnieszka", "Smith", 45);
        tablicaOsob[5] = new Osoba("Robert", "Żórawski", 43);

        List<Osoba> listaOsob = Arrays.asList(tablicaOsob);

        //for (Osoba o : tablicaOsob)
           // System.out.println(o);


        //Collections.sort(listaOsob);

        //System.out.println(listaOsob);

        //Collections.sort(listaOsob,new OsobaComparatorWiek());
        //for (Osoba o : listaOsob)
        //    System.out.println(o);

        Collections.sort(listaOsob,new OsobaComparatorNazwisko());
        for (Osoba o : listaOsob)
            System.out.println(o);


    }
}

