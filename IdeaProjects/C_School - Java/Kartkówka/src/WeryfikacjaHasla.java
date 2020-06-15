import java.util.Scanner;

//public class WeryfikacjaHasla {

class Password {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

//------ENTER A USERNAME
            System.out.println("Welcome please enter your username and password.");
            System.out.print("Username >>");
            input.nextLine();


//------PASSWORD AUTHENTICATION BEGIN
            String password = enterPassword();
            while ( !checkPassword(password) ) {
                System.out.println("Password must be 6 - 10 characters long!");
                password = enterPassword();
            }

//------PASSWORD VERIFY
            String passwordverify = enterPassword();
            while (!password.equals(passwordverify)){
                System.out.println("ERROR - Passwords DO NOT MATCH Re-Enter Passwords Again");
                password = enterPassword();

            }

//------ACCEPT PASSWORD
            System.out.println("Username and Password Accepted!");

        }


        //--ENTER PASSWORD STATEMENT
        public static String enterPassword(){
            String password;
            Scanner input = new Scanner(System.in);
            System.out.print("Password >>");
            password = input.nextLine();
            return password;
        }

        //--BOOLEAN CHECK PW
        public static boolean checkPassword(String password){
            int length;
            length = password.length();
            if (length < 6 || length > 11){
                return false;
            }
            for (int i = 0; i < password.length();i++){
                if (!Character.isLetter(password.charAt(i)))
                    return false;
            }
            return true;
        }

    }

