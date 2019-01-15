package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args){
        Input input = new Input();
        MoviesArray.findAll();


        System.out.println();

        System.out.println("What would you like to do?\n");

        System.out.println("0 - exit\n"+
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");
        int userInput = input.getInt();
        boolean stop =false;


        while(stop){
            switch(userInput){
                case 0:
                    System.exit(0);
                case 1:
                    // display movies
                    break;
                case 2:
                    // animated genre
                    break;
                case 3:
                    // drama gemre
                    break;
                case 4:
                    // horror genre
                    break;
                case 5:
                    // scifi genre
                    break;
                default:

            }
        }
    }
}