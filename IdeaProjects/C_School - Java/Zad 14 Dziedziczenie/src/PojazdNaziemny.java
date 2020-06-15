public class PojazdNaziemny {

    String nazwa;
    int zadawaneObrazenia;
    double zasieg;



    public PojazdNaziemny(String nazwa, int zadawaneObrazenia, double zasieg){
        this.nazwa = nazwa;
        this.zadawaneObrazenia = zadawaneObrazenia;
        this.zasieg =zasieg;
        System.out.println(" Konstruktor z klas PojazdNaziemny");
    }

    @Override
    public String toString() {
        return "PojazdNaziemny {" +
                "nazwa = '" + nazwa + '\'' +
                ", zadawaneObrazenia = " + zadawaneObrazenia +
                ", zasieg = " + zasieg +
                '}';
    }
    public String getNumer(){
        return nazwa +" "+ zasieg + " "+ (int)(Math.random()*10)+" " + zadawaneObrazenia;
    }

}

