package Question4;

import java.util.List;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Netflix
 * @date 2021/12/14 19:56
 */
public class Netflix {
    private List<Genre> genres;

    public Netflix(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Netflix{" +
                "genres=" + genres +
                '}';
    }
}
