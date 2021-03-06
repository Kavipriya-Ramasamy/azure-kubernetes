package com.stackroute.repository;

import com.stackroute.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Repository marks the specific class as a Data Access Object
 */
@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
}
