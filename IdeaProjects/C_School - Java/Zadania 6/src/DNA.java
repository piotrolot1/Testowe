import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class DNA {

    public static void main(String[] args) {

        String DNA = "tagaggtatagatgagatgatgatgatga";
        String DNAUpper = DNA.toUpperCase();
        String NDNA = "";

        for (int i = 0; i < (DNA.length()-4); i +=3) {
            NDNA = NDNA + DNAUpper.substring(i, i + 3) + " ";
        }
      
        String RNA1 = NDNA.replaceAll("A", "1");
        String RNA2 = RNA1.replaceAll("C", "2");
        String RNA3 = RNA2.replaceAll("T", "3");
        String RNA4 = RNA3.replaceAll("G", "4");

        String RNAa = RNA4.replaceAll("1", "T");
        String RNAc = RNAa.replaceAll("2", "G");
        String RNAt = RNAc.replaceAll("3", "A");
        String RNA = RNAt.replaceAll("4", "C");

        System.out.println(RNA);
    }
}







