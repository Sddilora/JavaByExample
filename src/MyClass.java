import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class MyClass {
    // Classs level variables are called properties.
    // We can access them outside of the MyClass class by using dot notation.
    public String name;  // Since we declare those variables in class level, the default values are assigned to them. 
    public LocalDate birthday;  // They are null for String, 0 for int, 0.0 for double, false for boolean, and null for LocalDate.
    public ArrayList<Book> books = new ArrayList<Book>();

    public int getAge() {
        return ((LocalDate.now().getYear()) - (birthday.getYear()));
    }

    // or
    public int getAgeViaPeriodClass() {
        int currentAge = Period.between(this.birthday, LocalDate.now()).getYears();  //
        return currentAge;
    }

    public String borrowedBooks() {
        return this.books.toString();
    }

    public void borrow (Book book) {
        this.books.add(book);
    }

}
 