package book.ChapterSix;
// problem 30
public enum CardRank {
    KING("king", 13),
    QUEEN("queen", 12),
    JACK("jack", 11),
    TEN("ten", 10),
    NINE("nine", 9),
    EIGHT("eight", 8),
    SEVEN("seven", 7),
    SIX("six", 6),
    FIVE("five", 5),
    FOUR("four", 4),
    THREE("three", 3),
    TWO("two", 2),
    ACE("ace", 1);

    private final String name;
    private final int rank;

    CardRank(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }
}
