package book.ChapterSix;

public enum CardSuit {
    HEART("heart", "♥"),
    SPADE("spade", "♠"),
    CLUB("club", "♣"),
    DIAMOND("diamond", "♦");

    private final String name;
    private final String symbol;

    CardSuit(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

}
