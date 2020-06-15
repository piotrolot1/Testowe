public class Epi {

    public static void main(String[] args) {

        int iloscMozliwychNaciec = 4;
        int iloscNaciec = 0;
        int[] tab = {9, 2, 3, 3, 2, 1, 7, 2, 1, 1, 6, 1, 6, 0, 2, 4, 5, 2};
        int ostatnieCiecie = 0;
        Integer[] epicentra = new Integer[iloscMozliwychNaciec];

        for (int i = 0; i < tab.length -1 && iloscNaciec<=iloscMozliwychNaciec; i++)
            if(tab[i-1]<tab[i]&&tab[i+1]<tab[i]) {
                epicentra[iloscNaciec]=i;
                System.out.println(epicentra[i]);


            }
    }
}