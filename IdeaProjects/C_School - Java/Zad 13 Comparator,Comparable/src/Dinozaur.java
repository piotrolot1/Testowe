import java.util.Comparator;

public class Dinozaur {

    private String nazwa;
    private int poziomStrasznosci;
    private int wiek;

   public static class DinozaurComparatorPoziomStrasznosci implements Comparator<Dinozaur>{
   
       public int compare(Dinozaur o1, Dinozaur o2){
           return o2.getPoziomStrasznosci() -o1.getPoziomStrasznosci();
       }
   }

    public String getNazwa() {
        return nazwa;
    }

    public int getPoziomStrasznosci() {
        return poziomStrasznosci;
    }

    public int getWiek() {
        return wiek;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPoziomStrasznosci(int poziomStrasznosci) {
        this.poziomStrasznosci = poziomStrasznosci;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Dinozaur(String nazwa, int poziomStrasznosci, int wiek){
        super();
        this.nazwa = nazwa;
        this.poziomStrasznosci =poziomStrasznosci;
        this.wiek = wiek;

    }
    @Override
    public String toString() {
        return "Dinozaur{" +
                "nazwa = '" + nazwa + '\'' +
                ", poziomStrasznosci = " + poziomStrasznosci +
                ", wiek = " + wiek +
                '}';
    }
    public int compareTo (Dinozaur o){
        if(this.wiek > o.wiek)
            return 1;
        if(this.wiek < o.wiek)
            return -1;

        return o.getNazwa().compareTo(this.getNazwa());
    }


}
