package Question4;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Main
 * @date 2021/12/14 19:57
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Add List of movies based on the classes created above.");
        List<Movie> movieListA = new ArrayList<>();
        movieListA.add(new Movie("titleA",
                new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(),
                Arrays.asList("actor1", "actor2"),
                "director1"));
        movieListA.add(new Movie("titleB",
                new GregorianCalendar(2018, Calendar.MAY, 12).getTime(),
                Arrays.asList("actor3", "actor2"),
                "director2"));
        List<Movie> movieListB = new ArrayList<>();
        movieListB.add(new Movie("titleC",
                new GregorianCalendar(2020, Calendar.DECEMBER, 13).getTime(),
                Arrays.asList("actor1", "actor4"),
                "director3"));
        movieListB.add(new Movie("titleD",
                new GregorianCalendar(1998, Calendar.NOVEMBER, 14).getTime(),
                Arrays.asList("actor3", "actor4"),
                "director4"));
        Genre genreA = new Genre(movieListA);
        Genre genreB = new Genre(movieListB);
        Netflix netflix = new Netflix(Arrays.asList(genreA, genreB));
        System.out.println(netflix);
        System.out.println();

        System.out.println("For all movies released before 2000, add the string \"(Classic)\" to the title of the movie using flatMap.");
        Date date2000 = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.getReleaseDate().before(date2000))
                .forEach(movie -> {
                    movie.setTitle("(Classic)" + movie.getTitle());
                    System.out.println(movie.getTitle());
                });
        System.out.println();

        System.out.println("Get the latest 3 movies released using .limit() method of stream.");
        netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .sorted((o1, o2) -> -o1.getReleaseDate().compareTo(o2.getReleaseDate()))
                .limit(3)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Create a predicate for release date before 2000 and a predicate for release date before 1990 and then Chain the predicates for finding movieListA between 1990 and 2000.");
        Predicate<Movie> before2000 = movie -> movie.getReleaseDate()
                .before(new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime());
        Predicate<Movie> after1990 = movie -> movie.getReleaseDate()
                .after(new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime());
        netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .filter(before2000)
                .filter(after1990)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Write a method which that will add release year in the title of the movie and return the title and then use this method for all the movies.");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Function<Movie, String> method = movie -> {
            movie.setTitle(movie.getTitle() + " " + sdf.format(movie.getReleaseDate()));
            return movie.getTitle();
        };
        netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .map(method).forEach(System.out::println);
        System.out.println();

        System.out.println("Sorting on the title which will use comparator.");
        netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .sorted((o1, o2) -> -o1.getTitle().compareTo(o2.getTitle()))
                .forEach(System.out::println);
        System.out.println();
    }
}
