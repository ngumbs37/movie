package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args){
        Input input = new Input();

        Movie[] mArray = MoviesArray.findAll();
        do{
            System.out.println("What would you like to do?\n");

            System.out.println("0 - exit\n"+
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add movie\n");
            int userInput = input.getInt();

            switch(userInput){
                case 0:
                    System.exit(0);
                case 1:
                    Movie.showAllMovies(mArray);
                    break;
                case 2:
                    Movie.showAnimated(mArray);
                    break;
                case 3:
                    Movie.showDrama(mArray);
                    break;
                case 4:
                    Movie.showHorror(mArray);
                    break;
                case 5:
                    Movie.showScifi(mArray);
                    break;
                case 6:
                    mArray = Movie.addMovie(mArray, new Movie(input.getString("Enter movie name\n"), input.getString("Enter category/genre\n")));
                    break;
                default:
                    System.out.println("Invalid input.");
            }

        }while(input.yesNo("\nDo you want to search again? "));
    }
}