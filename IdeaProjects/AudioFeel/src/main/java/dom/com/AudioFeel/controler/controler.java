package dom.com.AudioFeel.controler;

import dom.com.AudioFeel.Data.User;

import org.postgresql.core.SqlCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controler {

    @GetMapping("/home")
    public String getHome(Model model) {
        SQL.ImportUsersSQL();
        model.addAttribute("listaUser", User.listaUser);
        model.addAttribute("listaSQL",SQL.listaSQLtoList);

        return "index";
    }

    @GetMapping("/onas")
    public String getOnas() {
        return "onas";
    }

    @GetMapping("/zasady")
    public String getZasady() {
        return "zasady";
    }

    @GetMapping("/kontakt")
    public String getKontat() {
        return "kontakt";
    }

    @GetMapping("/userPanel")
    public String getUserPanel() {
        return "userPanel";
    }

    @GetMapping("/logowanie")
    public String toLogowanie(Model model) {
        model.addAttribute("listaUser", User.listaUser);
        model.addAttribute("konto", new User());
        return "logowanie";
    }

    @GetMapping("/rejestracja")
    public String toRejestracja(Model model) {
        model.addAttribute("konto", new User());
        return "rejestracja";

    }

    @PostMapping("/logowanie")
    public String getLogowanie(@ModelAttribute User user) {
        SQL.ImportUsersSQL();

        if (SQL.listaSQLtoList.containsKey(user.getLogin()) && SQL.listaSQLtoList.containsValue(user.getPassword())) {
            System.out.println("Login i Pass się zgadza");
            return "redirect:/userPanel";
        } else {
            System.out.println("Hasło i login się NIE zgadza");
            System.out.println(user.getLogin() + " " +user.getPassword());
            System.out.println(SQL.listaSQLtoList.values());
            return "redirect:/onas";
        }
    }

    @PostMapping("/rejestracja")
    public String getRejestracja(@ModelAttribute User user) {
        if (!user.getLogin().equals("") && !user.getPassword().equals("")) {

            User.listaUser.add(user);
            SQL.UpdateExport(user);
            SQL.ImportUsersSQL();

            return "redirect:/home";
        }
        return "errorPage";
    }

    public static void main(String[] args) {
        SQL.ImportUsersSQL();

    }

}
