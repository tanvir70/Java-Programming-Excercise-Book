package book.ChapterSix;

public class Card {
    private CardRank rank;
    private CardSuit suit;
    private int pointValue;

    public Card(CardRank rank, CardSuit suit, int pointValue) {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }
    public CardRank getRank() {
        return rank;
    }
    public CardSuit getSuit() {
        return suit;
    }
    public int getPointValue() {
        return pointValue;
    }
}
