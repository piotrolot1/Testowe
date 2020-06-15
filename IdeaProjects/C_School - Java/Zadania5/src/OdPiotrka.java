public class OdPiotrka {
    public static void main(String []args){

        int mozliweNaciecia = 4;
        int[]tab= {9, 2, 3, 3, 2, 1, 7, 2, 1, 1, 6, 1, 6, 0, 2, 4, 5, 2};
        int liczbaCiec = 0;
        Integer [] tab2 = new Integer[mozliweNaciecia];
        int ostatnieCiecie=0;


        for (int i = 1; i<tab.length-1&&liczbaCiec<=mozliweNaciecia;i++) {
            if(tab[i-1]<tab[i]&&tab[i+1]<tab[i]) {
                tab2[liczbaCiec]=i;
                System.out.println(tab[i]);
                if(liczbaCiec>=1) {
                    i=i+(i-ostatnieCiecie);
                    liczbaCiec++;
                    ostatnieCiecie=i;
                }else
                    liczbaCiec++;
                ostatnieCiecie=i;
            }
        }
        System.out.println("Liczba cięć do wykonania: "+liczbaCiec);
        for (int i = 0; i<tab2.length;i++) {
            System.out.println("Wykonaj cięcie w miejscu próbki nr: "+tab2[i]);
        }
    }
}
