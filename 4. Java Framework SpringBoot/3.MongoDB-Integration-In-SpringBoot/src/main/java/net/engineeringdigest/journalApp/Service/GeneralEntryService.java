package net.engineeringdigest.journalApp.Service;
import net.engineeringdigest.journalApp.Entity.GeneralEntry;
import net.engineeringdigest.journalApp.Repository.GeneralEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GeneralEntryService {

    @Autowired
    private GeneralEntryRepository GeneralEntryRepository;

    public void saveEntry(GeneralEntry GeneralEntry){
        GeneralEntryRepository.save(GeneralEntry);
    }

    public List<GeneralEntry> getAll(){
        return GeneralEntryRepository.findAll();
    }

    public Optional<GeneralEntry> findById(ObjectId id){
        return GeneralEntryRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        GeneralEntryRepository.deleteById(id);
    }

}

