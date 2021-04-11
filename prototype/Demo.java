package prototype;

public class Demo {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Toy Story");

        System.out.println(movie);
        System.out.println(movie.getTime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie secondMovie = (Movie) registry.createItem("Movie");
        secondMovie.setTitle("Home Alone");

        System.out.println(secondMovie);
        System.out.println(secondMovie.getTime());
        System.out.println(secondMovie.getTitle());
        System.out.println(secondMovie.getUrl());
    }
}
