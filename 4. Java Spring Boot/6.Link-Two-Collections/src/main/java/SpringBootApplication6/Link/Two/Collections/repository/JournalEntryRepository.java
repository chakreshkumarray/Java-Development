package SpringBootApplication6.Link.Two.Collections.repository;

import SpringBootApplication6.Link.Two.Collections.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository <JournalEntry, ObjectId>{

}
