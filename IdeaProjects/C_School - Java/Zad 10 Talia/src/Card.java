public class Card {


    private String face;
    private String suite;
    private int index;

    public Card(String face, String suite) {
        this.face = face;
        this.suite = suite;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Card{" +
                "face='" + face + '\'' +
                ", suite='" + suite + '\'' +
                '}';
    }
}
