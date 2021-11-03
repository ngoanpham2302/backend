public class Movie {
    int id;
    String title;
    String genre;
    double length;
    String studio;
    int year;

    public Movie(int id, String title, String genre, double length, String studio, int year) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.studio = studio;
        this.year = year;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + "Thể loại: " + genre
                + " - " + "Thời lượng: " + length + " phút" + " - "
                + "Nhà sản xuất: " + studio + " - " + "Năm phát hành: " + year;
    }
}
