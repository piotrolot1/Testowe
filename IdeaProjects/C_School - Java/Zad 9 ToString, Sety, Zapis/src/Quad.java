import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Quad  {

     private String Marka;
     private String Model;
     private boolean CzySprawny;
     private int Pojemnosc;

     private int idxWlasny;
     private static int indexWspolny =1;

     private String Czy4x;
     private int MaxPredkosc;


    @Override
    public String toString() {
        return  " Quad{" +
                "Index: " +idxWlasny +
                ", Marka='" + Marka + '\'' +
                ", Model='" + Model + '\'' +
                ", CzySprawny=" + CzySprawny +
                ", Pojemnosc=" + Pojemnosc +
                ", Czy4x='" + Czy4x + '\'' +
                ", MaxPredkosc=" + MaxPredkosc +
                '}';
    }

    public Quad(String Marka, String Model, boolean CzySprawny, int Pojemnosc) throws FileNotFoundException {
         this.Marka = Marka;
         this.Model = Model;
         this.CzySprawny = CzySprawny;
         //this.Pojemnosc = Pojemnosc;
         setPojemnoscSilnika(Pojemnosc);
         idxWlasny = indexWspolny++;

         archiwizuj();

     }
    private void archiwizuj() throws FileNotFoundException{

        StringBuilder sb = new StringBuilder();
        Scanner input = new Scanner(new File( "Nowy.txt"));

        while (input.hasNextLine()){
            sb.append(input.nextLine());
            sb.append("\n");
        }
        input.close();

        PrintWriter output = new PrintWriter("Nowy.txt");
        output.print(sb.toString());
        output.println(this);
        output.close();
        //archiwizuj();

    }
     public void setPojemnoscSilnika(int Pojemnosc){
         if ( Pojemnosc > 0 ) {
             this.Pojemnosc = Pojemnosc;
         }
     }


}
