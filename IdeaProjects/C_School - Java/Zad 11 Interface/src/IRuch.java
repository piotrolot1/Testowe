public interface IRuch {

    public int getPredkosc();
    public void wykonajRuch(int iloscJednostek);
    public void zatrzymaj();


   public default void nowaMetoda(){
       System.out.println("Metoda wspolna dla wszystkich obiektow klas ktore implementuja IRuch");
   }
}
