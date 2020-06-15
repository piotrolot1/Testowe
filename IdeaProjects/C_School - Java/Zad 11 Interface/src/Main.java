public class Main {
    public static void main(String[] args) {

        Motocykl motocykl = new Motocykl("Yamaha",1923,100);
        Osoba osoba = new Osoba ("Jan","Kowalski",1982);
        Hulajnoga hulajnoga = new Hulajnoga("Skate","małe",299);
        Quad quad = new Quad("Suzuki","Stinger",500);

        IRuch elementyRuchome[] = {osoba,motocykl};
        IPojazdyMechaniczne zurzyciePaliwa2 [] ={quad,hulajnoga};

        for (IRuch r : elementyRuchome){
            r.wykonajRuch(10);
            System.out.println(r.getPredkosc());
            r.zatrzymaj();
            System.out.println(r.getPredkosc());
            System.out.println("");
        }
        for (IPojazdyMechaniczne p : zurzyciePaliwa2){
            System.out.println(p.paliwoPelne());
            System.out.println(p.zerowaniePaliwa());
            p.ponowneZatankowanie(5);
            System.out.println(p.getStanPaliwa());
            System.out.println(" ");
            p.samochodDobry();
            p.naprawaSamochodu();
        }

        //Nadal drukuje się stan paliwa dla Quada do zrobienia


    }
}
