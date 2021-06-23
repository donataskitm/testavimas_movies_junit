public class Movie {
    private String title;
    private int year;
    private String director;
    private double imdbRating;

    public Movie(String title, int year, String director, double imdbRating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.imdbRating = imdbRating;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", director='" + director + '\'' +
                ", imdbRating=" + imdbRating +
                '}';
    }
}
