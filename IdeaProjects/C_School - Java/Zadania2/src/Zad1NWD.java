public class Zad1NWD {
    public static void main(String[] args) {

        for (int a = 42, b =112; a != b; ){
            if (a > b) {
                a -= b;

            }else {
                b-=a;

                System.out.println("NWD z liczb 42 i 112 wynosi " + a);
            }
        }

    }
}

// 42 bo a jest nie zmienione b wchodzi na 70
// 42 bo a jest nie zmienione b wchodzi na 28
// 42 > 28  wiec 42-28 = 14