package repetition1;

import java.util.Comparator;

public class MovieComparator2 implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) {
        if (Double.compare(m1.getRating(),m2.getRating()) == 0) {
            return m1.getTitle().compareTo(m2.getTitle());
        } else {
            return Double.compare(m1.getRating(),m2.getRating());
        }   
    }
    
}
