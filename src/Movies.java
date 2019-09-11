import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Movies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String addedMovie = "";
        ArrayList<String> movies = new ArrayList<String>();

        while (!addedMovie.equalsIgnoreCase("q")) {
            System.out.print("One of your favorite movies: ");
            addedMovie = sc.nextLine();
            if (addedMovie.equalsIgnoreCase("q")) {
                break;
            }
            movies.add(addedMovie);
        }
        Collections.sort(movies);
        System.out.println("Movies you entered: " + movies);
        Collections.shuffle(movies);
        System.out.println("You should probably rewatch " + movies.get(0) + "... I've heard it's pretty good.");
    }
}
