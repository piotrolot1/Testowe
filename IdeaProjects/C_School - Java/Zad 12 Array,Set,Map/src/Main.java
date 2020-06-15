import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.Collection;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String a = "Epidendrozaur";
        String b = "awa";
        String c = "zraar";
        String d = "wooor";
        //String [] words = {"dupa","duapa","aajdadi"};

        PrintWriter zapisPlik = new PrintWriter("dino.txt");
        // File file = new File("dino.txt");

        // Scanner zapis1 = new Scanner(file);
        //
        // while(zapis1.hasNextLine()){

        //     String line2= zapis1.nextLine();
        //     zapisPlik.println(line2);
        //     //ArrayList<String> line2 =new ArrayList<>();
        //     zapisPlik.close();
        // }
        // zapis1.close();


        zapisPlik.println(a);
        zapisPlik.println(b);
        zapisPlik.println(c);
        zapisPlik.println(d);
        //zapisPlik.println(" ");
        //zapisPlik.println(Arrays.toString(words));
        zapisPlik.close();


        File file = new File("dino.txt");
        Scanner odczyt = new Scanner(file);
        int ilosc = 0;

        TreeSet<String> dom = new TreeSet<>();

        while (odczyt.hasNextLine()) {
            String line = odczyt.nextLine();

            dom.add(line);
            ilosc += 1;

            //System.out.println(dom.size());
            //System.out.println(Arrays.toString(words));
            //System.out.println(dom.size());
          // Iterator<Integer> it = dom.iterator;
          //
          // while(it.hasNext()) {
          //     System.out.println(it.next());
          // }
          //
          // zbior.forEach(System.out::println);

        }

        System.out.println(dom);
        System.out.println(dom.size());



        //   TreeMap <String> nowyDom = new TreeMap();

    //    nowyDom.put(1,"awa");

    }
}




