public interface IPojazdyMechaniczne {

    public int paliwoPelne();
    public int getStanPaliwa();
    public void ponowneZatankowanie(int iloscJednostek2);
    public int zerowaniePaliwa();

    public boolean samochodDobry();
    public boolean samochodZepsuty();
    public void naprawaSamochodu();

    //public void uzupelnijPaliwo;

    public default void nowaMetoda2(){
        System.out.println("Metoda wspolna dla wszystkich obiektow klas ktore implementuja IRuch");
    }
}
