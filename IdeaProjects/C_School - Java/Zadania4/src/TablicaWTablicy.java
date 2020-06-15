public class TablicaWTablicy {
    public static void main(String[] args) {

        int[][] tab = {
                { 2, 1, 2},
                { 3, 2, 1},
                { 4, 2, 0}
        };

        for (int i = 0; i<tab.length;i++){
            int suma =0;
            for( int j = 0; j < tab[i].length; j++)
                suma += tab[j][i]; // Tutaj jak chce zliczyć sobie kolumanmi a nie wierszami to zamieniam i z j

            System.out.println(suma);
            }
        }
    }

