package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Manager {
    private String[] movies = new String[0];
    private int movieLimit = 10;


    public Manager(int movieLimit) {
        this.movieLimit = movieLimit;
    }


    public void addMovie(String newMovie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length > movieLimit) {
            resultLength = movieLimit;
        } else {
            resultLength = movies.length;
        }
        String[] lastMovie = new String[resultLength];
        for (int i = 0; i < lastMovie.length; i++) {
            int index = movies.length - i - 1;
            lastMovie[i] = movies[index];
        }
        return lastMovie;
    }
}

