package SpringBootApplication8.MongoDB.Atlas.Connection.repository;

import SpringBootApplication8.MongoDB.Atlas.Connection.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);
}
