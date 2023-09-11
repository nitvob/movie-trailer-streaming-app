// we need to create an interface that allows us to perform db operations
// the movie repo extends the general mongo repository
// we need to specify the data type being dealt with in this repo and the
// identifier mongo should use, which is the spring boot objectid

package dev.nit.movies;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // spring automatically implements this custom query via a different property
    // other than id. this property should be unique
    Optional<Movie> findMovieByImdbId(String imdbId); // we need to implement our own function to retrieve an obj from
                                                      // mongo by a non default attribute unlike ObjectId

}