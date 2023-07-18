public class MovieExtends extends Inheritence{
    private String genre;

    // Since this class inherit from Inheritence class, we need to call the constructor method of Inheritence class.
    // We can do that by using super keyword.
    // super() method should be the first line of the constructor method.
    // super() method can take parameters if the constructor method of the parent class takes parameters.
    MovieExtends(String MovieName, String Actor, int Imdb, String genre) {
        super(MovieName, Actor, Imdb);  // We are calling the constructor method of the Parent class. (Inheritence class in this case)
        this.genre = genre;
    }
}
