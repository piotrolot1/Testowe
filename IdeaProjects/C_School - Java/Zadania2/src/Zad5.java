public class Zad5 {
    public static void main(String[] args) {

        int liczba1 = 13133;
        do {
            System.out.print(liczba1 % 2);
            liczba1 /= 2;
            /*zamiast licznby 2 można podstawić inną w zależności od tego na jaki system liczbowy zamieniamy, np.
            NIE DZIAłA DLA SYSTEMU 16-tkowego
             */
        }
        while( liczba1 >0);

    }
}
//  Napisz program który będzie realizował 5 dowolnych zamian systemów liczbowych poznanych na zajęciach (np. (2) -> (10) )
