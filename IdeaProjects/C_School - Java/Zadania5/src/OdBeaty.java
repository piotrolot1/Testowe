public class OdBeaty {

    public static void main(String[] args){

        int[] probki = {4, 2, 3, 1, 9, 6, 5, 2, 1};
        int limitNaciec = 3;
        int mozliweNaciecia = 0;
        for (int i = 1; i < probki.length-1; i++) {
            if (mozliweNaciecia >= limitNaciec)
                break;
            if (probki[i-1] < probki[i] && probki[i+1] < probki[i]) {
                mozliweNaciecia++;
                i ++;
            }
        }
        System.out.println("Możliwe nacięcia: " + mozliweNaciecia);
    }
}

