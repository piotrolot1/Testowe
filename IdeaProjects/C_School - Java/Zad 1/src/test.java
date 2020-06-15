public class test {
    public static void main(String[] args) {

        String str = "abc";
        str = str + "def";


        System.out.println(str.substring(0,3));
        System.out.println(str.substring(0,str.indexOf ('d')));
    }
}
