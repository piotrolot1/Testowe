public class Z4Piramida {
    public static void main(String[] args) {

        int n =5;
        int s = 2 * n -1;

        for (int i = 0;i < 5; i++){
            int m = n;
            for (int j = 0; j < i ; j++){
                System.out.print(m + " ");
                m--;
            }
        }

    }
}