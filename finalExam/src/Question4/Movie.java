package Question4;

import java.util.Date;
import java.util.List;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Movie
 * @date 2021/12/14 19:51
 */
public class Movie {
    private String title;
    private Date releaseDate;
    private List<String> actors;
    private String director;

    public Movie(String title, Date releaseDate, List<String> actors, String director) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.actors = actors;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", actors=" + actors +
                ", director='" + director + '\'' +
                '}';
    }
}
