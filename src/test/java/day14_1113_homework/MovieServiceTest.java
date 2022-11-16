package day14_1113_homework;

import day12_1105.homework.Patient;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {
    @BeforeClass
    public static ArrayList<Movie> getSampleDataForMoviesList() {

        ArrayList<Movie> moviesList = new ArrayList<>();
        Movie movie1 = new Movie(1, "The Simpsons", "Comedy", "Raimis Zabaliauskas", "USA", 25000, 2012);
        Movie movie2 = new Movie(2, "Shrek", "Comedy|Animation", "Arturas Makalauskas", "USA", 45000, 2002);
        Movie movie3 = new Movie(3, "The Taxi", "Action", "Tomas Kaleda", "Lietuva", 400, 2018);
        Movie movie4 = new Movie(4, "Liudnas filmas ", "Drama", "Arturas Makalauskas", "Latvia", 400, 2002);
        moviesList.add(movie1);
        moviesList.add(movie2);
        moviesList.add(movie3);
        moviesList.add(movie4);

        return moviesList;
    }

    ArrayList<Movie> moviesSampleData = getSampleDataForMoviesList();
    MovieService movieService = new MovieService();

    @Test
    void getAllMoviesCreator() {
        ArrayList<String> actualMoviesByCreator = movieService.getAllMoviesCreator(moviesSampleData);
        assertEquals("Tomas Kaleda",actualMoviesByCreator.get(2));
        assertEquals(4, actualMoviesByCreator.size());
    }

    @Test
    void getMoviesByGenre() {
        ArrayList<String> actualMoviesByGenre  = movieService.getMoviesByGenre(moviesSampleData,"Comedy");
        assertEquals(2,actualMoviesByGenre.size());
        assertEquals("The Simpsons",actualMoviesByGenre.get(0));
        assertEquals("Shrek",actualMoviesByGenre.get(1));

    }

    @Test
    void findMoviesByName() {

        ArrayList<String> actualMoviesByName  =  movieService.findMoviesByName(moviesSampleData,"The");
        assertEquals(2,actualMoviesByName.size());
        assertEquals("The Simpsons",actualMoviesByName.get(0));

         }


    @Test
    void findMostExpensiveMovie() {
        Movie actualMostExpensiveMovie = movieService.findMostExpensiveMovie(moviesSampleData);
        assertEquals("Shrek",actualMostExpensiveMovie.getName());
        assertEquals(45000,actualMostExpensiveMovie.getBudged());
    }

    @Test
    void findMoviesAboveGivenBudgetMargin() {

        ArrayList<Movie> actualMoviesAboveMargin =movieService.findMoviesAboveGivenBudgetMargin(moviesSampleData,17800);
        assertEquals(2,actualMoviesAboveMargin.size());
        assertEquals(25000, actualMoviesAboveMargin.get(0).getBudged());
        assertEquals(45000, actualMoviesAboveMargin.get(1).getBudged());

    }
}