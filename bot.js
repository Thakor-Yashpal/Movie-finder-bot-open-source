const movies = [
  {
    title: "The Shawshank Redemption",
    year: 1994,
    genre: "Drama"
  },
  {
    title: "The Godfather",
    year: 1972,
    genre: "Crime"
  },
  {
    title: "The Godfather: Part II",
    year: 1974,
    genre: "Crime"
  },
  // add more movies here
];

function searchMovies(genre, year) {
  return movies.filter(movie => movie.genre === genre && movie.year === year);
}

console.log(searchMovies("Crime", 1972)); // should return The Godfather
