package ru.netology.manager;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Poster;

public class PosterManager {
    private Poster[] posters = new Poster[0];
    private int defaultNumberOfMovies = 10;

    PosterManager() {

    }

    public PosterManager(int customMovieLength) {
        if (customMovieLength > 0) {
            defaultNumberOfMovies = customMovieLength;
        }

    }

    public void addMovie(Poster movie) {
        int length = posters.length + 1;
        Poster[] tmp = new Poster[length];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        int lastMovie = tmp.length - 1;
        tmp[lastMovie] = movie;
        posters = tmp;

    }

    public Poster[] getFindLast() {
        int moviesLength = posters.length;
        if (moviesLength < defaultNumberOfMovies) {
            defaultNumberOfMovies = moviesLength;
        }
        Poster[] reverse = new Poster[defaultNumberOfMovies];
        for (int i = 0; i < reverse.length; i++) {
            int result = moviesLength - i - 1;
            reverse[i] = posters[result];

        }
        return reverse;
    }

}
