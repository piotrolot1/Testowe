public class DeckOdCardsTest {

    public static void main(String[] args) {
        DeckOfCards myDeckofCards = new DeckOfCards();
        myDeckofCards.shuffle();

        for ( int i = 0; i < 13; i++){
            System.out.println(myDeckofCards.dealCard());
         //   System.out.printf("%-20s%-20s%-20s%-20s\n",
         //           myDeckofCards.dealCard(),myDeckofCards.dealCard(),myDeckofCards.dealCard(),myDeckofCards.dealCard());
        }
    }
}
