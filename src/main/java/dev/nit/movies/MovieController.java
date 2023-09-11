package dev.nit.movies;

import java.util.List;
import java.util.Optional;

//import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    // controller has access to our custom mongo service to abstract layers
    @Autowired
    private MovieService movieService;

    @GetMapping
    // call a service method to talk to the db and get the movies list
    // then return this movie list in a response entity
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }

    // @GetMapping("/{id}")
    // // tells service to get a movie from db by objectid search
    // public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId
    // id) {
    // return new ResponseEntity<>(movieService.singleMovie(id), HttpStatus.OK);
    // }

    @GetMapping("/{imdbId}")
    // tells service to get a movie from db by imdbId search
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
