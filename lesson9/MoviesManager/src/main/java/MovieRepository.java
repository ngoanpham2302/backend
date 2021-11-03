import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class MovieRepository {
    public ArrayList<Movie> getData() {
        ArrayList<Movie> movieList = new ArrayList<>();

        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader("movies.json");
            Type objectType = new TypeToken<ArrayList<Movie>>(){}.getType();
            movieList = gson.fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        }

        return movieList;
    }

    public void printList(ArrayList<Movie> list) {
        for (Movie movie : list) {
            System.out.println(movie);
        }
    }
}
