import com.sun.scenario.effect.impl.sw.java.JSWBlend_ADDPeer;

class Samochod{

    private String model;
    private String marka;
    public static int iloscKol;
    private boolean czySprawny;

    //public Samochod(){ }

    public Samochod(String model, String marka, boolean czySprawny,int iloscKol){
        this.model = model;
        this.marka = marka;
        this.czySprawny = czySprawny;
        this.iloscKol = iloscKol;

    }

    public void setIloscKol(int ilosc){
        if(ilosc > 0)
            this.iloscKol = ilosc;
    }

    public String toString(){   // tutaj cos nadpisuje cos nowego "Overwritte"
        StringBuilder sb = new StringBuilder();

        sb.append("Model: ");
        sb.append(model);
        sb.append("\nMarka: ");
        sb.append(marka);
        sb.append("\nSprawny: ");
        sb.append(czySprawny ? "Tak" : "Nie");
        sb.append("\nIlość kół: ");
        sb.append(iloscKol);

        return sb.toString();

    }
}

public class Zajecia {
    public static void main(String[] args) {

        Samochod samochod = new Samochod("Astra", "Opel", false, 4);
        Samochod samochod2 = new Samochod("Benz", "Mercedes",true, -3);

        System.out.println(samochod);
        System.out.println();
        System.out.println(samochod2);


    }
}
