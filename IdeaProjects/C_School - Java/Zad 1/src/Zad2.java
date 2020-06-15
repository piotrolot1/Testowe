public class Zad2 {

    public static void main(String[] args) {
        int a = 6;
        int i = 0;

        while (i < a) {
            i++;
            if (a % i == 0){
                System.out.println(i);
            }
        }
    }
}