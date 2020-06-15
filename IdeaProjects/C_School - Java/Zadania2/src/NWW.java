public class NWW {
    public static void main(String[] args) {

        for (int a = 3, b = 7, i = 1; i < 100;i++ ){
            if ((i % a == 0) && (i % b == 0 )) {
                System.out.println("NWW liczb " + a +" i " + b + " to "+ i);
                break ; // To dodałem tylko do sprawdzenia
            }else {
                System.out.println("");
            }
        }

    }
}

