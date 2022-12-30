package book.ChapterSix;
//// Chapter six problem 27 and 28
public class PersonTwo {
    private String name;
    private Day favoriteDay;

    public PersonTwo(String name, Day favoriteDay) {
        this.name = name;
        this.favoriteDay = favoriteDay;
    }

    public String getName() {
        return name;
    }

    public Day getFavoriteDay() {
        return favoriteDay;
    }


    // problem 28 part
    public static void main(String[] args) {
        PersonTwo pt = new PersonTwo("Rifat",Day.MONDAY);

        System.out.println("Name : " + pt.getName());
        System.out.println("Favourite day : " + pt.getFavoriteDay());
    }
}
