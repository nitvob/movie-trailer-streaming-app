package dev.nit.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    // to perform db operations that the repository cannot
    // to perform dynamic queries
    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbId) {
        // insert a new review with the reviewBody into the review's table
        // then get the created review
        Review review = reviewRepository.insert(new Review(reviewBody));

        // need to associate review to its movie via imdbId
        // must add this new review to the corresponding movie's reviewIds
        // find the movie by imdbId
        // then update the movie's reviewIds by adding this review
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first(); // first to get the first match

        return review;
    }

}
