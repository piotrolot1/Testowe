import java.util.Arrays;

public class Zad1 {
	public static void main(String[] args) {

		int [] tab = {2,4,3,4,};
		int [] tab2 ={1,3,2,5};

		int s =(tab[0] + tab2[0] + tab[2]);
		int d = (tab[1]+tab2[1]);


		System.out.println(Arrays.toString(tab2));
		System.out.println(s +" " + d);
	}
}