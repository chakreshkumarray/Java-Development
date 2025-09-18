package net.engineeringdigest.journalApp.Repository;
import net.engineeringdigest.journalApp.Entity.GeneralEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GeneralEntryRepository extends MongoRepository <GeneralEntry, ObjectId>{

}
