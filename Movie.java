package movies;

import java.util.Arrays;

public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public static void showAllMovies(Movie[] mArray){
        for(Movie movie : mArray){
            System.out.println(movie.getName());
        }
    }

    public static void showAnimated(Movie[] mArray){
        showFiltered(mArray,"animated");
    }

    public static void showDrama(Movie[] mArray){
        showFiltered(mArray,"drama");
    }

    public static void showScifi(Movie[] mArray){
        showFiltered(mArray,"scifi");
    }

    public static void showHorror(Movie[] mArray){
        showFiltered(mArray,"horror");
    }

    public static void showFiltered(Movie[] mArray, String filter){
        for(Movie movie : mArray) {
            if (movie.category.equalsIgnoreCase(filter)){
                System.out.println(movie.getName());
            }
        }
    }

    public static Movie[] addMovie(Movie[] movies, Movie movie){
        System.out.println(movie.getName() + " has been added");
        int arrayLength = movies.length;
        movies = Arrays.copyOf(movies, arrayLength+1);
        movies[arrayLength] = movie;
        return movies;
    }

    public String getName() {
        return name + " -- " + category;
    }
}