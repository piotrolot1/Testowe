
public class Epicentra {
    public static void main(String[] args) {


        int[] tab = {9,2,3,3,2,1,7,2,1,1,6,1,6,0,2,4,5,2};
        int suma = 0;
        int iloscMozliwychNaciec = 4;
        Integer [] epi = new Integer[iloscMozliwychNaciec];
        int iloscNaciec = 0;
        int ostatnieCiecie = 0;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > tab[i + 1] && tab[i] > tab[i - 1]) {
                suma += 1;

                epi[iloscNaciec]=i;

                if (iloscNaciec >= 1) {
                    i = i + (i - ostatnieCiecie);
                    iloscNaciec++;
                }else{
                    iloscNaciec++;
                    ostatnieCiecie = i;
                }
            }
        }
        System.out.println("Suma nacięćwynosi : " + suma);
        for (int i = 0; i < epi.length;i++)
            System.out.println("Cięcia robimy w miejscu : " +epi[i]);
    }
}
