package repetition1;

public class Movie {
   private final String title;
   private final double rating;
   private final boolean starred;

    public Movie(String title, double rating, boolean starred) {
        if (rating <= 0 || rating > 10) {
            throw new IllegalArgumentException();
        }
        this.title = title;
        this.rating = rating;
        this.starred = starred;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public boolean isStarred() {
        return starred;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", rating=" + rating + ", starred=" + starred + '}';
    }

}
