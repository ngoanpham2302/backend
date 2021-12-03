package com.company;

import com.company.threads.HighestViewMovies;
import com.company.threads.MovieByCategory;
import com.company.threads.MovieByGenre;
import com.company.threads.ShowAllMovies;

public class Main {

    public static void main(String[] args) {

        // Mỗi công việc cách nhau 5 giây:

        System.out.println("\n--- 1. DANH SÁCH TẤT CẢ CÁC BỘ PHIM: ");
        ShowAllMovies allMovies = new ShowAllMovies();
        Thread showAllMoviesThread = new Thread(allMovies);
        showAllMoviesThread.start();

        try {
            showAllMoviesThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- 2. TOP 3 BỘ PHIM CÓ LƯỢT XEM CAO NHẤT: ");
        HighestViewMovies highestViewMovies = new HighestViewMovies();
        Thread getHighestViewsMoviesThread = new Thread(highestViewMovies);
        getHighestViewsMoviesThread.start();

        try {
            getHighestViewsMoviesThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- 3. LIỆT KÊ PHIM THEO CATEGORY: ");
        MovieByCategory movieByCategory = new MovieByCategory();
        Thread getMoviesByCategoryThread = new Thread(movieByCategory);
        getMoviesByCategoryThread.start();

        try {
            getMoviesByCategoryThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- 4. LIỆT KÊ PHIM THEO THỂ LOẠI: ");
        MovieByGenre movieByGenre = new MovieByGenre();
        Thread getMoviesByGenreThread = new Thread(movieByGenre);
        getMoviesByGenreThread.start();
    }
}
