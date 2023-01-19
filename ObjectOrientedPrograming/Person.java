package book.ChapterSeven;

import java.lang.reflect.Field;

public class Person {
    private String fistName;
    private String lastName;
    private int age;
    private String gender;

    public Person(String fistName, String lastName, int age, String gender) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public boolean checkNull() throws IllegalAccessException {
        for (var f : getClass().getDeclaredFields()) {
            if (f.get(this) != null)
                return false;
        }
        return true;
    }// dekhaite hobe kawke ...... aita likhlam method check korlo.... i think khali thaka jabe na mane constructor likhlei hobe

    public void setFistNameAndLastName(String fistName,String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getFistNameAndLastName(){
        return fistName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
