import com.sun.org.apache.xml.internal.serializer.OutputPropertyUtils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZapisPlikow {
    public static void main(String[] args)throws IOException {

        String sciezkaKatalogu = "//Users//danny//Documents//Zdjęcia//";
        String nazwaPliku = "Nowy";

       File file = new File( sciezkaKatalogu + nazwaPliku);
        //System.out.println(file.delete());

        PrintWriter output = new PrintWriter("//Users//danny//Documents//Kurs C_School//PlikiDoKursu//"+ "Nowy");
        String nowyPlik = new String();


        nowyPlik = " dopisuje 2 plik";
        nazwaPliku = nowyPlik;
        output.print("dupa");

        output.print(nowyPlik);
        //Scanner scanner = new Scanner(file);
        System.out.println(nowyPlik);



        output.close();


    }
}
