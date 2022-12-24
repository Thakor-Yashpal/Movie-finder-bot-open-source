movies = [
    {
        "title": "The Shawshank Redemption",
        "year": 1994,
        "genre": "Drama",
    },
    {
        "title": "The Godfather",
        "year": 1972,
        "genre": "Crime",
    },
    {
        "title": "The Godfather: Part II",
        "year": 1974,
        "genre": "Crime",
    },
    # add more movies here
]

def search_movies(genre, year):
    return [movie for movie in movies if movie["genre"] == genre and movie["year"] == year]

print(search_movies("Crime", 1972))  # should return The Godfather
