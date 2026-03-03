package SpringBootApplication6.Link.Two.Collections.repository;

import SpringBootApplication6.Link.Two.Collections.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);
}
