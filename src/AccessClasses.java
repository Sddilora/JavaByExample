import java.time.LocalDate;

class AccessClasses {
    public static void main (String[] args) {
        // accessUser();
        // accessConstructorMethod();
        accessInheritence();
    }

    public static void accessUser () {
        MyClass youngerUser = new MyClass();
        youngerUser.name = "Sdd";
        youngerUser.birthday = LocalDate.parse("2002-06-08");

        MyClass olderUser = new MyClass();
        olderUser.name = "Hidayet";
        olderUser.birthday = LocalDate.parse("1970-03-01");
 

        System.out.printf("%s was born back in %s \n", youngerUser.name, youngerUser.birthday.toString());

        System.out.printf("%s can never calculate her age Lets help her. Your age is %d %s :) \n", youngerUser.name, youngerUser.getAgeViaPeriodClass(), youngerUser.name);

        System.out.printf("%s is %s's father and he was born back in %s, so he is %d now \n", olderUser.name, youngerUser.name, olderUser.birthday, olderUser.getAge());

        Book book = accesBooks(); 

        whoBorrowedBook(youngerUser, book);
    
    }

    public static Book accesBooks () {
        Book book = new Book();

        book.title = "Harry Potter";
        book.author = "J.K. ROWLING";

        return book;
    }

    public static void whoBorrowedBook (MyClass user, Book book) {
        user.borrow(book);
        System.out.printf("%s has borrowed these books: %s \n", user, book);  // MyClass@5fd0d5ae has borrowed these books: Book@2d98a335  // After we override the toString method in Book class, we get this: MyClass@5fd0d5ae has borrowed these books: Title: Harry Potter, Author: J.K. ROWLING
        // System.out.printf("%s has borrowed these books: %s \n", user.name, user.books);  // Sdd has borrowed these books: [Book@2d98a335]  // After we override the toString method in Book class, we get this: Sdd has borrowed these books: [Title: Harry Potter, Author: J.K. ROWLING]
        // System.out.printf("%s has borrowed these books: %s \n", user.name, user.books.toString());  //Sdd has borrowed these books: [Book@2d98a335]  // After we override the toString method in Book class, we get this: Sdd has borrowed these books: [Title: Harry Potter, Author: J.K. ROWLING]
        // After I made the books property private, I can't access it from outside of the MyClass class.
        System.out.printf("%s took those books: %s \n",user.name,user.borrowedBooks());  // Sdd took those books: [Title: Harry Potter, Author: J.K. ROWLING]
    }

    public static void accessConstructorMethod () {
        ConstructorMethod dog = new ConstructorMethod("Dog", "Woof");
        System.out.printf("The %s says %s \n", dog.getName(), dog.getSound());  // The Dog says Woof
    }

    public static void accessInheritence () {
        Inheritence movie = new Inheritence("The Godfather", "Al Pacino", 9);
        System.out.printf("The movie %s is played by %s and has %d imdb score \n", movie.getMovieName(), movie.getActor(), movie.getImdb());  // The movie The Godfather is played by Al Pacino and has 9 imdb score

        MovieExtends inheritedFromInheritence = new MovieExtends("Sherlock Holmes", "Robert Downey Jr.", 7, "Action");  // The movie Sherlock Holmes is played by Robert Downey Jr. and has 7 imdb score
        System.out.println(inheritedFromInheritence.toString());
    }
}
