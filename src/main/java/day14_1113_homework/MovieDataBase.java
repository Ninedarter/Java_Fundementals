package day14_1113_homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MovieDataBase {

    public static final ArrayList<Movie> moviesData = new ArrayList<>();
    String originalName;
    String name;

    public ArrayList<Movie> getAllMovies() throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/moviesDataBase");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readedline = bufferedReader.readLine();
        readedline = bufferedReader.readLine();
        ArrayList<Movie> movies = new ArrayList<>();

        while (readedline != null) {
//71,"Olivier, Olivier",Drama,Dunsmuir,Netherlands,147074,2009


            if (readedline.contains(", ")) {
                String[] splittedByQuotes = readedline.split("\"");
                originalName = splittedByQuotes[1];
                splittedByQuotes[1] = null;
                readedline = readedline.replaceAll(", ", " ");
            }
            String[] splittedData = readedline.split(",");
            int placeIntList = Integer.parseInt(splittedData[0]);
            if (originalName == null) {
                name = splittedData[1];
                originalName = null;
            } else {
                name = originalName;
                originalName = null;
            }
            String genre = splittedData[2];
            String creator = splittedData[3];
            String country = splittedData[4];
            int budged = Integer.parseInt(splittedData[5]);
            int year = Integer.parseInt(splittedData[6]);
            movies.add(new Movie(placeIntList, name, genre, creator, country, budged, year));
            readedline = bufferedReader.readLine();
        }
        return movies;
    }
}