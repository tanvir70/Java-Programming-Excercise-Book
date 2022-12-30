package book.ChapterSix;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public  List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();

        for (CardSuit suit : CardSuit.values()) {
            for (CardRank rank : CardRank.values()) {
                int pointValue = getPointValue(rank);
                Card card = new Card(rank, suit, pointValue);
                deck.add(card);
            }
        }

        return deck;
    }

    // Gets the point value for the given card rank
    public static int getPointValue(CardRank rank) {
        return switch (rank) {
            case TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN -> rank.getRank() + 2;
            case JACK, QUEEN, KING -> 10;
            case ACE -> 11;
        };
    }

    public static void main(String[] args) {
        Deck myDeck = new Deck();
        List<Card> cards = myDeck.createDeck();

        for (Card card : cards) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
    }
}
