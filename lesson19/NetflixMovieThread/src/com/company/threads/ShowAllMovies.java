package com.company.threads;

import com.company.Controller;
import com.company.Movie;
import com.company.Repository;

import java.util.ArrayList;

public class ShowAllMovies implements Runnable {
    @Override
    public void run() {
        Repository repo = new Repository();
        Controller controller = new Controller();
        ArrayList<Movie> movieList = repo.getMovieData();

        controller.showAllMovies(movieList);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
