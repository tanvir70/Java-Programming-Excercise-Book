package book.ChapterSix;

public enum Day {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private final String name;
    private final int number;

    Day(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Day[] days = {Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};

        for (Day day : days) {
            System.out.println("Day: " + day);
            System.out.println("Name: " + day.getName());
            System.out.println("Number: " + day.getNumber());
            System.out.println();
        }

    }
}



