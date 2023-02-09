package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;


public class PosterManagerTest {

    PosterManager manager = new PosterManager();

    Poster movie1 = new Poster(1, "Бладшот", "боевик");
    Poster movie2 = new Poster(2, "Вперёд", "мультфильм");
    Poster movie3 = new Poster(3, "Отель Белград ", "комедия");
    Poster movie4 = new Poster(4, "Джентельмены", "боевик");
    Poster movie5 = new Poster(5, "Человек-невидимка", "ужасы");
    Poster movie6 = new Poster(6, "Тролли.Мировой тур", "мультфильм");

    Poster movie7 = new Poster(7, "Номер один", "комедия");
    Poster movie8 = new Poster(8, "Черная Пантера 2", "фантастика");
    Poster movie9 = new Poster(9, "Достать ножи", "детектив");
    Poster movie10 = new Poster(10, "Форсаж 10", "боевик");

    @Test
    public void shouldFindAll() {
        PosterManager manager = new PosterManager(10);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        Poster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {
        PosterManager manager = new PosterManager(11);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        Poster addedMovie = new Poster(11, "Доктор сон", "фантастика");
        manager.addMovie(addedMovie);
        Poster[] expected = {new Poster(11, "Доктор сон", "фантастика"), movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = manager.getFindLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast(){
        PosterManager manager = new PosterManager(5);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        Poster[] expected = {movie10, movie9, movie8, movie7, movie6};
        Poster[] actual = manager.getFindLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
