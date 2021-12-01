package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Controller {

    // Hiển thị tất cả các bộ phim
    public void showAllMovies(ArrayList<Movie> list) {
        list.forEach(System.out::println);
    }

    // Lấy ra 3 bộ phim có lượt xem cao nhất
    public void getHighestViewsMovies(int quantity, ArrayList<Movie> list) {
        list.stream()
                .sorted((o1, o2) -> o2.getViews() - o1.getViews())
                .limit(quantity)
                .forEach(System.out::println);
    }

    // Liệt kê phim theo category
    public void getMoviesByCategory(ArrayList<Movie> list) {
        Stream<Category> cateStream = Arrays.stream(Category.values());

        cateStream.forEach(cate -> {
            System.out.println("\n- Danh mục: " + cate.getValue() + ": ");
            list.stream()
                    .filter(movie -> movie.getCategory().equals(cate))
                    .forEach(System.out::println);
        });
    }

    // Liệt kê phim theo thể loại (movie genre)
    public void getMoviesByGenre(ArrayList<Movie> movieList, ArrayList<String> genreList) {
        genreList.forEach(genre -> {
            System.out.println("\n- Thể loại: " + genre + ": ");
            movieList.stream()
                    .filter(movie -> movie.getGenre().contains(genre))
                    .forEach(System.out::println);
        });
    }

    // Tạo mảng thể loại phim (Do 1 bộ phim có thể thuộc nhiều thể loại khác nhau)
    public ArrayList<String> getMovieGenreList(ArrayList<Movie> movieList) {
        ArrayList<String> genreList = new ArrayList<>();

        movieList.forEach(movie -> {
            String[] arr = movie.getGenre().split("\\|");
            for (String genre : arr) {
                if (!genreList.contains(genre)) genreList.add(genre);
            }
        });

        return genreList;
    }


}
