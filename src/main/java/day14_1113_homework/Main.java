package day14_1113_homework;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {


        MovieDataBase movieDataBase = new MovieDataBase();
        ArrayList<Movie> movies = movieDataBase.getAllMovies();
        MovieService movieService = new MovieService();
        ArrayList<String> movieCreators = movieService.getAllMoviesCreator(movies);
        System.out.println(movieCreators);
        ArrayList<String> moviesByGenre  = movieService.getMoviesByGenre(movies,"Comedy");
        System.out.println(moviesByGenre);
        Movie  mostExpensiveMovie = movieService.findMostExpensiveMovie(movies);
        System.out.println(mostExpensiveMovie);
        System.out.println(movieService.findMoviesAboveGivenBudgetMargin(movies,700000));



    }
}
