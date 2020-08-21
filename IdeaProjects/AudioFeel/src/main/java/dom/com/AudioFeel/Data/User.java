package dom.com.AudioFeel.Data;

import dom.com.AudioFeel.controler.SQL;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String login;
    private String password;
    private int ifAdmin;
    //TODO: Czy zapisujemy też zdjęcia użytwownika ? Czy to jako String https://przykładNaszeZdjęciaDefault
    public static List<User> listaUser = new ArrayList<>();

    public User(){}

    public User(String login, String password, int ifAdmin) {
        this.login = login;
        this.password = password;
        this.ifAdmin = ifAdmin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIfAdmin() {
        return 0;
    }

    public void setIfAdmin(int ifAdmin) {
        this.ifAdmin = ifAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", ifAdmin=" + ifAdmin +
                '}';
    }

    public static boolean checkLogin( User user) {
        if (SQL.listaSQLtoList.containsKey(user.getLogin()) ) {
            System.out.println("Login i Pass się zgadza");
            return true;
        } else {
            System.out.println("Hasło i login się NIE zgadza");
            System.out.println(SQL.listaSQLtoList.keySet());
            System.out.println(user.getLogin());
            return false;
        }
    }
}
