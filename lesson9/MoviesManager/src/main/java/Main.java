/* Viết chương trình quản lý các bộ phim của một rạp chiếu bao gồm:
mã, tên phim, thể loại, độ dài, nhà sản xuất, năm công chiếu
Lấy dữ liệu bằng cách đọc file JSON (sử dụng mockaroo để tạo dữ liệu ảo của 20 bộ phim)
In thông tin các bộ phim ra màn hình */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MovieRepository movieRepo = new MovieRepository();
        ArrayList<Movie> movieList = movieRepo.getData();
        System.out.println("Danh sách các bộ phim: ");
        movieRepo.printList(movieList);
    }
}
