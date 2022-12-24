#include <iostream>
#include <vector>

struct Movie {
  std::string title;
  int year;
  std::string genre;
};

std::vector<Movie> movies = {
  { "The Shawshank Redemption", 1994, "Drama" },
  { "The Godfather", 1972, "Crime" },
  { "The Godfather: Part II", 1974, "Crime" },
  // add more movies here
};

std::vector<Movie> searchMovies(std::string genre, int year) {
  std::vector<Movie> results;
  for (const auto& movie : movies) {
    if (movie.genre == genre && movie.year == year) {
      results.push_back(movie);
    }
  }
  return results;
}

int main() {
  auto results = searchMovies("Crime", 1972);
  for (const auto& movie : results) {
    std::cout << movie.title << std::endl;
  }
  return 0;
}
