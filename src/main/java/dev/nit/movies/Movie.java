package dev.nit.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//this class is defines a row/document in the movies table/collection
@Document(collection = "movies")
// annotation creates getters and setters @ compile time
@Data
// annotation creates a constructor to init all fileds
@AllArgsConstructor
// annotation creates a default constructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    // specifies to only store ids of the review objects
    @DocumentReference
    // list of refs to review objects on this movie
    private List<Review> reviewIds;
}
