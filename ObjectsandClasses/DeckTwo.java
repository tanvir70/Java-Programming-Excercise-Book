package book.ChapterSix;

import java.util.Random;

public class DeckTwo {
    private final Card[] cards = new Card[52];

    // index of the top card in the deck
    private int topCardIndex;

    // Creates a full deck of 52 cards
    public void createDeck() {
        for (CardSuit suit : CardSuit.values()) {
            for (CardRank rank : CardRank.values()) {
                int pointValue = getPointValue(rank);
                Card card = new Card(rank, suit, pointValue);
                addCard(card);
            }
        }
    }

    public void addCard(Card card) {
        // find the first empty slot in the cards array
        for (int i = 0; i < this.cards.length; i++) {
            if (this.cards[i] == null) {
                this.cards[i] = card;
                break;
            }
        }
    }


    public void shuffle() {
        Random rng = new Random();
        // loop through the cards and swap each one with a random card
        for (int i = 0; i < this.cards.length; i++) {
            int randomIndex = rng.nextInt(this.cards.length);
            Card temp = this.cards[i];
            this.cards[i] = this.cards[randomIndex];
            this.cards[randomIndex] = temp;
        }

        this.topCardIndex = this.cards.length - 1;
    }

    // Gets the point value for the given card rank
    private int getPointValue(CardRank rank) {
        return switch (rank) {
            case TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN -> rank.ordinal() + 2;
            case JACK, QUEEN, KING -> 10;
            case ACE -> 11;
        };
    }

    public Card[] getCards() {
        return cards;
    }

    // method for dealing a card
    public Card dealCard() {
        // check if the deck is empty
        if (this.topCardIndex < 0) {
            throw new IllegalStateException("No more cards in the deck");
        }

        // return the top card and decrement the top card index
        return this.cards[this.topCardIndex--];
    }

    // method for replacing a card
    public void replaceCard(Card card) {
        // check if the deck is full
        if (this.topCardIndex == this.cards.length - 1) {
            throw new IllegalStateException("Deck is full");
        }

        // add the card to the top of the deck and increment the top card index
        this.cards[++this.topCardIndex] = card;
    }

    public static void main(String[] args) {
        DeckTwo myDeck = new DeckTwo();
        myDeck.createDeck();

        // shuffle the deck
        myDeck.shuffle();
        System.out.println("Shuffled deck");

        for (Card card : myDeck.getCards()) {
            System.out.println(card.getSuit() + ": " + card.getRank());
        }

        var dealtCard = myDeck.dealCard();
        System.out.println("Dealt card: " + dealtCard.getSuit() + ": " + dealtCard.getRank());

        // replace the card
        myDeck.replaceCard(dealtCard);
        System.out.println("Replaced card: " + dealtCard.getSuit() + ": " + dealtCard.getRank());
    }
}
