public class Inheritence {
    // Lets take movies as an example
    private String movieName;
    private String actor;
    private int imdb;

    Inheritence(String MovieName, String Actor, int Imdb ) {
        this.movieName = MovieName;
        this.actor = Actor;
        this.imdb = Imdb;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public String getActor() {
        return this.actor;
    }

    public int getImdb() {
        return this.imdb;
    }

    public String toString() {
        return String.format("The movie %s is played by %s and has %d imdb score", this.getMovieName(), this.getActor(), this.getImdb());
    }
}
