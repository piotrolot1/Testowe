import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RobAzOsiagniesz {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;
        int age = 0;

        try {
           cin = new InputStreamReader(System.in);
           System.out.println("Enter characters, 'a' to quit");
           char c;
           do {
               c = (char) cin.read();
               System.out.println(c);

            }while (c != 'q');
        }finally {
            if(cin != null){
                cin.close();
            }
        }
    }
}

 //try {
 //        Scanner scan = new Scanner(System.in);
 //        System.out.println("Enter characters, 'q' to quit");
 //        do{
 //        age = scan.nextInt();
 //        System.out.println(age);
 //
 //        }while (age != 1);
 //        }finally {