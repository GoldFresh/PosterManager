package ru.netology.manager;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Poster;

public class PosterManager {
    private Poster[] posters = new Poster[0];
    private int defaultNumberOfMovies;

    PosterManager() {
        this.defaultNumberOfMovies = 10;
    }

    public PosterManager(int defaultNumberOfMovies) {
        this.defaultNumberOfMovies = defaultNumberOfMovies;
    }

    public Poster[] findAll(){
        return posters;
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
        int moviesLength;
        if (posters.length < this.defaultNumberOfMovies) {
            moviesLength = posters.length;
        } else {
            moviesLength = this.defaultNumberOfMovies;
        }
        Poster[] tmp = new Poster[moviesLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];

        }
        return tmp;
    }
}
