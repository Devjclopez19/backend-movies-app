package backend.app.movies.services;

import backend.app.movies.model.Movie;
import backend.app.movies.repositories.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    public MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Movie singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId).get();
    }
}
