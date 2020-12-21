package repetition1;

import java.util.Comparator;

/**
 *
 * @author TM
 */
public class MovieComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m1.getRating(),m2.getRating());
    }

}
