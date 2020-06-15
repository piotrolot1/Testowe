public class Quad implements IPojazdyMechaniczne{


    private String nazwa;
    private String model;
    private int moc;
    private int predkoscPoruszaniaSie;
    private int stanPaliwa;
    private boolean samochodStan;


    private static EStanPaliwa wspolczynikPaliwa = EStanPaliwa.PELNY;

    public Quad(String nazwa, String model, int moc) {
        this.nazwa = nazwa;
        this.model = model;
        this.moc = moc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getModel() {
        return model;
    }

    public int getMoc() {
        return moc;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    @Override
    public String toString() {
        return "Quad{" +
                "nazwa='" + nazwa + '\'' +
                ", model='" + model + '\'' +
                ", moc=" + moc +
                '}';
    }

    @Override
    public int paliwoPelne() {
        System.out.println("Paliwo w samochodzie jest pełne");
        return stanPaliwa=15;
    }

    @Override
    public int zerowaniePaliwa() {
        System.out.println("Wyzerowanie paliwa ");
        return stanPaliwa =0;

    }
    public int getStanPaliwa(){
        return stanPaliwa;
    }

    @Override
    public void ponowneZatankowanie(int iloscJednostek2) {
        System.out.println("Ponowne zatankowanie paliwa");
        if(stanPaliwa ==0){
            stanPaliwa += (wspolczynikPaliwa.getWspolczynikPaliwa()*iloscJednostek2);
        }
    }

    @Override
    public boolean samochodDobry() {
        System.out.println("Quad jest w dobrym stanie");
        return true;
    }

    @Override
    public boolean samochodZepsuty() {
        System.out.println("Quad jes zepsuty");
        return false;
    }

    @Override
    public void naprawaSamochodu() {
        if(samochodZepsuty() == false){
            System.out.println("Quad został narawiony");
        }
    }
}
