import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class IndexZwierzat {

        public static void main(String[] args) throws IOException {

            String sciezkaKatalogu = "//Users//danny//Documents//Kurs C_School//PlikiDoKursu//";
            String nazwaPliku1 = "Litery.txt";
            String nazwaPliku2 = "Pupile.txt";
            String nazwaPliku3 = "IndexZwierzat.txt";

            File file = new File(sciezkaKatalogu + nazwaPliku1);
            File file1 = new File(sciezkaKatalogu + nazwaPliku2);

            PrintWriter output = new PrintWriter(sciezkaKatalogu + nazwaPliku3);

            Scanner scanner = new Scanner(file);
            Scanner scanner2 = new Scanner(file1);

            while(scanner.hasNextLine() || scanner2.hasNextLine())
                if(scanner.hasNextLine() && scanner2.hasNextLine())
                    output.println(scanner.nextLine() +" "+ scanner2.nextLine());
                else if (scanner.hasNextLine())
                    output.println(scanner.nextLine());
                else if (scanner2.hasNextLine())
                    output.println(scanner2.nextLine());

                output.close();
                scanner.close();
                scanner2.close();
        }
    }

