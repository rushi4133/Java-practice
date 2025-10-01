/* Objective: Create a program that stores a list of your favorite movies, and then performs
 some basic operations on that list.

Instructions:
Create an ArrayList:
In your main method, create a List of String type. Call it myMovies.
Use ArrayList as the implementation.
Add Movies to the List:
Add at least 5 of your favorite movie titles to the myMovies list.
Add one movie title a second time to see that lists allow duplicates.
Perform List Operations:
Print the entire list.
Print the movie at a specific index (e.g., the first movie or the third movie).
Check if the list contains a specific movie title. Print true or false based on the result.
Remove one movie from the list (either by its name or by its index).
Print the list again to see the result.
Take your time and give it a try. I'm here to help if you get stuck */


import java.util.ArrayList;
import java.util.List;

public class myMovies {
    public static void main(String[] args) {
        // Create an ArrayList implementing List<String>
        List<String> myMovies = new ArrayList<>();

        // Add at least 5 favorite movies
        myMovies.add("The Shawshank Redemption");
        myMovies.add("Inception");
        myMovies.add("The Godfather");
        myMovies.add("Pulp Fiction");
        myMovies.add("The Dark Knight");

        // Add one movie title a second time to show duplicates
        myMovies.add("Inception"); // duplicate

        // Print the entire list
        System.out.println("All movies: " + myMovies);

        // Print the movie at a specific index
        // Example: first movie (index 0) and third movie (index 2)
        if (myMovies.size() > 0) {
            System.out.println("First movie (index 0): " + myMovies.get(0));
        }
        if (myMovies.size() > 2) {
            System.out.println("Third movie (index 2): " + myMovies.get(2));
        }

        // Check if the list contains a specific movie title
        String searchTitle = "Pulp Fiction";
        boolean contains = myMovies.contains(searchTitle);
        System.out.println("Contains \"" + searchTitle + "\"? " + contains);

        // Remove one movie from the list (by name)
        String toRemove = "The Godfather";
        boolean removed = myMovies.remove(toRemove);
        System.out.println("Removed \"" + toRemove + "\"? " + removed);

        // Print the list again to see the result
        System.out.println("Movies after removal: " + myMovies);
    }
}