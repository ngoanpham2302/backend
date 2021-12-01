package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Repository repo = new Repository();
        Controller controller = new Controller();
        ArrayList<Movie> movieList = repo.getMovieData();

        while (true) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nDanh sách tất cả các bộ phim: ");
                    controller.showAllMovies(movieList);
                    break;

                case 2:
                    System.out.println("\nTop 3 bộ phim có lượt xem cao nhất: ");
                    controller.getHighestViewsMovies(3, movieList);
                    break;

                case 3:
                    System.out.println("\nLiệt kê phim theo Category: ");
                    controller.getMoviesByCategory(movieList);
                    break;

                case 4:
                    System.out.println("\nLiệt kê phim theo thể loại: ");
                    ArrayList<String> genreList = controller.getMovieGenreList(movieList);
                    controller.getMoviesByGenre(movieList, genreList);
                    break;

                case 0:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Không có lựa chọn này!");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("\n--- NETFLIX MOVIES AND TV SHOWS ---");
        System.out.println("Xin mời lựa chọn: ");
        System.out.println("1 - Hiển thị danh sách tất cả các bộ phim");
        System.out.println("2 - Lấy ra 3 bộ phim có lượt xem cao nhất");
        System.out.println("3 - Liệt kê phim theo category");
        System.out.println("4 - Liệt kê phim theo thể loại");
        System.out.println("0 - Thoát chương trình");
    }
}
