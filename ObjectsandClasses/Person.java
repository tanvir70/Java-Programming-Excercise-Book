package book.ChapterSix;
// Chapter six problem Eight and nine
public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    // Problem eight solved

    //For problem 9  solve began here :

    public static void main(String[] args) {
        Person p = new Person("John", 30, 'M');
        String name = p.getName();
        p.setAge(31);
        char gender = p.getGender();
        int age = p.getAge();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

