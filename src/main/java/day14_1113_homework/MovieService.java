package day14_1113_homework;


import java.util.ArrayList;
import java.util.regex.Pattern;

public class MovieService {

    public ArrayList<String> getAllMoviesCreator(ArrayList<Movie> moviesFromTheList) {
        System.out.println("Movies creators list : ");
        ArrayList<String> movieCreators = new ArrayList<>();
        for (Movie movie : moviesFromTheList) {
            if (movie.getCreator() != null) {
                movieCreators.add(movie.getCreator());
            } else {
                System.out.println("No creators placed in the list");
            }
        }
        return movieCreators;
    }

    public ArrayList<String> getMoviesByGenre(ArrayList<Movie> moviesList, String specificGenre) {
        System.out.println("Movies by a genre : " + specificGenre);
        ArrayList<String> moviesByGendre = new ArrayList<>();
        for (Movie movie : moviesList) {
            if (movie.getGenre().contains(specificGenre)) {
                moviesByGendre.add(movie.getName());
            }
        }
        return moviesByGendre;

    }

    public ArrayList<String> findMoviesByName(ArrayList<Movie> moviesList, String specificName) {
        ArrayList<String> moviesByName = new ArrayList<>();
        for (Movie movie : moviesList) {
            if (movie.getName() != null && movie.getName().contains(specificName)) {
                moviesByName.add(movie.getName());
            } else {
                System.out.println("No results found for " + specificName);
            }
        }

        return moviesByName;
    }


    public Movie findMostExpensiveMovie(ArrayList<Movie> moviesList) {

        String [] mostExpensiveMovie = new String[1];
        Movie mostExpensive = new Movie();
        int mostExpensiveBudged = 0;
        for (Movie movie : moviesList) {
            if(movie.getBudged() > mostExpensive.getBudged() ) {
                mostExpensive = movie;
            }
        }

        return mostExpensive;
    }


    public ArrayList<Movie> findMoviesAboveGivenBudgetMargin (ArrayList<Movie> movies , final int givenMargin){
        ArrayList<Movie> moviesAboveGivenBudged = new ArrayList<>();
        for (Movie movie : movies) {
            if(movie.getBudged()> givenMargin) {
                moviesAboveGivenBudged.add(movie);
            }
        }
    return moviesAboveGivenBudged;
    }

    public ArrayList<Movie> findOldestMovie(ArrayList<Movie> movies){

        ArrayList<Movie> oldestMovie = new ArrayList<>();


        for (Movie movie : movies) {
            if
        }


    }
}
