import java.util.ArrayList;
import java.util.List;

public class Movie {
  private String title;
  private int year;
  private String genre;

  public Movie(String title, int year, String genre) {
    this.title = title;
    this.year = year;
    this.genre = genre;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }

  public String getGenre() {
    return genre;
  }
}

List<Movie> movies = new ArrayList<>();
movies.add(new Movie("The Shawshank Redemption", 1994, "Drama"));
movies.add(new Movie("The Godfather", 1972, "Crime"));
movies.add(new Movie("The Godfather: Part II", 1974, "Crime"));
// add more movies here

List<Movie> searchMovies(String genre, int year) {
  List<Movie> results = new ArrayList<>();
  for (Movie movie : movies) {
    if (movie.getGenre().equals(genre) && movie.getYear() == year) {
      results.add(movie);
    }
  }
  return results;
}

List<Movie> results = searchMovies("Crime", 1972);
for (Movie movie : results) {
  System.out.println(movie.getTitle());
}
