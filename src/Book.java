public class Book {
    public String title;
    public String author;

    // Since we have created the Book ourselves, it doesn't have a built-in toString method.
    
    public String toString() {
        return String.format("Title: %s, Author: %s", this.title, this.author);
    }
}
 