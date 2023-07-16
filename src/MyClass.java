import java.time.LocalDate;

public class MyClass {
    // Classs level variables are called properties.
    // We can access them outside of the User class by using dot notation.
    public String name;  // Since we declare those variables in class level, the default values are assigned to them. 
    public LocalDate birthday;  // They are null for String, 0 for int, 0.0 for double, false for boolean, and null for LocalDate.
}
