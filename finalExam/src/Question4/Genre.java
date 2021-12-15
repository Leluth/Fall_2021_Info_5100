package Question4;

import java.util.List;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Genre
 * @date 2021/12/14 19:55
 */
public class Genre {
    private List<Movie> movies;

    public Genre(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "movies=" + movies +
                '}';
    }
}
