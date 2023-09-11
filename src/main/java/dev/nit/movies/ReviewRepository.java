/*
 * this interface creates an interface with mongo for our review's collection table
 * 
 * an instance of this interface has built in methods to query mongo but we can
 * also declare and implement custom query methods
 * 
 * the mongorepository deals with review objects and uses the review object's ObjectId
 * as the default idenitifier
 */

package dev.nit.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
