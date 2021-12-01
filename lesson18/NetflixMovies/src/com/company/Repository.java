package com.company;

import java.util.ArrayList;

public class Repository {

    public ArrayList<Movie> getMovieData() {
        ArrayList<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie(1, "An Empress and the Warriors", "Caresa Gaukrodge", "Action|Romance|War", Category.MOVIE, 23859, 118));
        movieList.add(new Movie(2, "My Left Eye Sees Ghosts", "Sibella Flather", "Comedy|Fantasy|Romance", Category.MOVIE, 52178, 97));
        movieList.add(new Movie(3, "Monsters University", "Luciano Garrit", "Adventure|Animation|Musical", Category.MOVIE, 18536, 136));
        movieList.add(new Movie(4, "Day of Anger", "Wini Esgate", "War|Fantasy|Action", Category.MOVIE, 9578, 95));
        movieList.add(new Movie(5, "Neighbors", "Aleta Glaysher", "Comedy|Romance", Category.TV_SHOW, 76341, 55));
        movieList.add(new Movie(6, "My Stepmother Is an Alien", "Charity Hariot", "Comedy|Romance|Sci-Fi", Category.MOVIE, 100236, 122));
        movieList.add(new Movie(7, "Terrible Kids", "Janie Aisbett", "Sci-Fi|Thriller", Category.TV_SHOW, 10578, 64));
        movieList.add(new Movie(8, "The Giant Monster", "Lenette Cheyne", "Action|Thriller", Category.TV_SHOW, 22768, 62));
        movieList.add(new Movie(9, "God's Puzzle", "Elnora Kedge", "Comedy|Musical", Category.MOVIE, 45903, 145));
        movieList.add(new Movie(10, "APlanes: Fire & Rescue", "Dorthy Gowdridge", "Adventure|Animation|Fantasy", Category.TV_SHOW, 32901, 72));

        return movieList;
    }
}
