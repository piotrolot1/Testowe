import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) throws PusteImie {

        Scanner inputImie = new Scanner(System.in);
        String strImie = inputImie.nextLine();

        //Scanner inputNazw = new Scanner(System.in);
        //String strNazw = inputNazw.nextLine();

        try{
            if( strImie.isEmpty())
                throw new PusteImie("nieaeadfa");

        }catch (Exception e){
            e.printStackTrace();

        }
        System.out.println(strImie);
    }
}
