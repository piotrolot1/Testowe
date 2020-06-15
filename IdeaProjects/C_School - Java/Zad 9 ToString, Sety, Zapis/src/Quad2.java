import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Quad2 {

    private String marka;
    private int pojemnoscSilnika;
    private int minimalnaPredkosc;
    private int maksymalnaPredkosc;
    private int idxWlasny;

    private static int indexWspolny = 1;


    public Quad2(String marka, int pojemnoscSilnika, int minimalnaPredkosc, int maksymalnaPredkosc)throws FileNotFoundException{
        this.marka = marka;
        setPojemnoscSilnika(pojemnoscSilnika);
        setMinimalnaPredkosc(minimalnaPredkosc);
        setMaksymalnaPredkosc(maksymalnaPredkosc);
        idxWlasny =indexWspolny++;
        archiwizuj();
    }

    private void archiwizuj() throws FileNotFoundException{
        StringBuilder sp = new StringBuilder();
        Scanner input = new Scanner(new File("Nowy.txt"));

        while (input.hasNextLine()){
            sp.append(input.nextLine());
            sp.append("\n");
        }
        input.close();

        PrintWriter output = new PrintWriter("Nowy.txt");
          output.print(sp.toString());
          output.println(this);
          output.close();

    }

    public void setPojemnoscSilnika(int pojemnoscSilnika){
        if (pojemnoscSilnika >0)
            this.pojemnoscSilnika =pojemnoscSilnika;
    }
    public void setMinimalnaPredkosc(int minimalnaPredkosc){
        if (minimalnaPredkosc >0)
            this.minimalnaPredkosc =minimalnaPredkosc;
    }
    public void setMaksymalnaPredkosc(int maksymalnaPredkosc){
        if (minimalnaPredkosc < maksymalnaPredkosc)
            this.maksymalnaPredkosc = maksymalnaPredkosc;
    }
    @Override
    public String toString() {
        return "Quad2{" +
                "idxWlasny=" + idxWlasny +
                ", marka='" + marka + '\'' +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", minimalnaPredkosc=" + minimalnaPredkosc +
                ", maksymalnaPredkosc=" + maksymalnaPredkosc +
                '}';
    }

}
