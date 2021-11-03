import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("id")
    int id;

    @SerializedName("title")
    String title;

    @SerializedName("genre")
    String genre;

    @SerializedName("length")
    double length;

    @SerializedName("studio")
    String studio;

    @SerializedName("year")
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
