public class Z3TablicaMinSrednia {
    public static void main(String[] args) {

        int[][] tab = new int[10][10];

        int min = tab[0][0];
        int max = tab[0][0];
        float array = 0 ;
        float average = 0;

        for (int i = 0; i < tab.length; i++) {

            int[] tab2 = tab[i];

            for (int j = 0; j < tab2.length; j++) {

                tab[i][j] = (int) (Math.random() * 201 - 100);

                System.out.print(tab[i][j] + " ");

                if(tab[i][j] > max)
                    max = tab[i][j];

                if (tab[i][j]<min)
                    min= tab[i][j];

                array = array + tab[i][j];
                average = array / tab.length;
            }
            System.out.println();
        }
        System.out.println("Maksymalna liczba to : " + max);
        System.out.println("Minimalna liczba to : " + min);
        System.out.println(average);
        System.out.println(array);
    }
}
//Zad 3. Stwórz tablicę 2 wymiarową 10 x 10 i zapełnij ją wartościami wylosowanymi z zakresu od -100 do 100.
// Znajdź i wypisz współrzędne elementu najmniejszego i największego.