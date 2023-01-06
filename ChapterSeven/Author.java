package book.ChapterSeven;

public class Author {
    public String name;
    public String email;
    public char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class Book {
    public String name;
    public Author author;
    public int price;
    public int stock;

    public Book(String name, Author author, int price, int stock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}


 class TestApp {
      public static void main(String[] args) {
               Author author = new Author("Tamim Shahriar Subeen",
                                 "book@subeen.com", 'M');
                Book book = new Book("Computer Programming", author,
                                250, 1000);
                System.out.println("Name of the Book: " +
                               book.getName());
                System.out.println("Name of the Author: " +
                              book.getAuthor().getName());
               System.out.println("Price of The book: " +
                              book.getPrice());
               System.out.println("Available in stock: " +
                               book.getStock());
            }
  }
