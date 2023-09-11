package dev.nit.movies;

import java.util.List;
import java.util.Optional;

//import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    // framework instantiates this movieRepository ref automatically
    @Autowired
    private MovieRepository movieRepository;

    // db method to retrieve all movies from movies collection
    public List<Movie> allMovies() {
        return movieRepository.findAll(); // findAll comes from MongoRepository interface
    }

    // // db method to retrieve a movie from movies collection by id
    // // Optional allows it to return null in case that id is not found
    // public Optional<Movie> singleMovie(ObjectId id) {
    // return movieRepository.findById(id);
    // }

    // we will search mongo for a movie by imdbId on our own
    // movie repository interface inherits prebuilt method to search by objectid
    // so we need to implement search by imdbId
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
