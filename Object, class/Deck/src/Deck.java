import java.util.*;
public class Deck {
    public static int NumOfSuits=4;
    public static int NumOfRanks=13;
    public static int NumOfAllCards=NumOfSuits*NumOfRanks;
    ArrayList<Cards> cards;
    public Deck(){
        cards=new ArrayList<Cards>(NumOfAllCards);
        }
    public void in() {
        for (int i = 1; i < NumOfSuits; i++) {
            for (int j = 1; j < NumOfRanks+1; j++){
                cards.add(new Cards(j,j));
        }
    }
    }
    public void out () {
        final String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        for (int i = 0; i < NumOfSuits; i++){
            Cards operatingCard = cards.get(i);
            for (int j=0;j<NumOfRanks;j++){
                switch (cards.get(i).getSuit()) {
                    case 1:
                        System.out.print("Spades ");
                        break;
                    case 2:
                        System.out.print("Clubs ");
                        break;
                    case 3:
                        System.out.print("Hearts ");
                        break;
                    case 4:
                        System.out.print("Diamonds ");
                        break;
                }
                switch (cards.get(j).getRank()){
                    case 1:
                        System.out.println("Ace");
                        break;
                    case 11:
                        System.out.println("Jack");
                        break;
                    case 12:
                        System.out.println("Queen");
                        break;
                    case 13:
                        System.out.println("King");
                        break;
                    default:
                        System.out.println(cards.get(j).getRank());
                }
    }
        }
}
}
