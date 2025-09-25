import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> currentHand;

    public Hand() {
        currentHand = new ArrayList<>();
    }

    public void add(Card card) {
        currentHand.add(card);
    }

    public void print() {
        for (Card card : currentHand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(currentHand);
    }

    public int compareTo(Hand other) {
        int thisHand = 0;
        int otherHand = 0;

        for (Card card : this.currentHand) {
            thisHand += card.getValue();
        }

        for (Card card : other.currentHand) {
            otherHand += card.getValue();
        }
        return thisHand - otherHand;
    }

    public void sortBySuit() {
        Collections.sort(currentHand, new BySuitInValueOrder());
    }
}
