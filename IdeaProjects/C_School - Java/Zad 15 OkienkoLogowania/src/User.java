import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class User implements Serializable {


    private String login;
    private String password;
    private static HashMap<String, String> users = new HashMap<>();
    private static String verLog = Logowanie.wpiszImie3;
    public  static Set loginverwa = users.keySet();

    public User(String login, String password) {

        this.login = login;
        this.password = password;
        users.put(login, password);
        zapisPlik();
    }

    public static void odczytPlik() {

        try {
            FileInputStream fis = new FileInputStream("danelogowania.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            HashMap<String, String> lista = (HashMap<String, String>) ois.readObject();

            users = lista;
            //System.out.println(lista);

            //if ( lista.containsKey(Logowanie.wpiszImie3))
            //System.out.println(" Proba logowania moze sie uda");

            System.out.println(lista.keySet());


            //for (String key : lista.keySet()) {
            //    System.out.println(key + "+" + lista.get(key));
            //
            //    if (Logowanie.inputImie1.equals(key)) {
            //        System.out.println("Udało sie");
            //    }
            //}


            fis.close();
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void zapisPlik() {

        try {
            FileOutputStream fos = new FileOutputStream("danelogowania.txt");
            ObjectOutputStream oss = new ObjectOutputStream(fos);

            oss.writeObject(users);

            oss.close();
            fos.close();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static boolean veryfikacja(Set loginverwa, String verLog) {

        for (String key : users.keySet()) {
            System.out.println(key + " " + users.get(key));
        }
        if ((users.containsKey(Logowanie.wpiszImie3))) {
            System.out.println("Udało sie ");
            return true;
        }else {
            System.out.println("Nie się zalogować !!!!");
            return false;
        }
    }

    public static boolean veryfy(boolean czyudalosie) {


        boolean czy = true;
        boolean czy2 =false;
        for (String key : users.keySet())
            System.out.println(key + " " + users.get(key));

        if (users.containsKey(Logowanie.wpiszImie3))
           return czy;
         else
            return czy2;

    }
}


//   Scanner scanner = new Scanner("danelogowania.txt");
//       scanner.useDelimiter("=");
//
//               while (scanner.hasNext()){
//               if(scanner.hasNext("Gosia")){
//               System.out.println("tdfhadshfjadhfkaa");
//               }
//               }
// if (users.containsKey(verLog)) {
//         System.out.println("Poprawne");
//         } else {
//         System.out.println("Błęde hasło");
//         }