package repetition1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author TM
 */
public class Sort2 {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Lord of the rings", 8.8, true),
                new Movie("Back to the future", 8.8, false),
                new Movie("Carlito's way", 7.9, true),
                new Movie("Carlito's way 2", 7.8, true),
                new Movie("Pulp fiction", 8.9, false));

        movies.sort(new MovieComparator());
        //movies.sort(new MovieComparator().reversed());
        movies.sort(Comparator.comparing(Movie::isStarred)
                .reversed()
                .thenComparing(Comparator.comparing(Movie::getRating)
                        .reversed())
        );

        movies.forEach(System.out::println);
        Movie m = Collections.max(movies,
                Comparator.comparing(Movie::getRating));

        System.out.println("Highest rating " + m);

    }
}
