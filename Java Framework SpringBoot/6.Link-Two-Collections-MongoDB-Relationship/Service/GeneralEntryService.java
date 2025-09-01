package net.engineeringdigest.journalApp.Service;
import net.engineeringdigest.journalApp.Entity.GeneralEntry;
import net.engineeringdigest.journalApp.Entity.User;
import net.engineeringdigest.journalApp.Repository.GeneralEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class GeneralEntryService {

    @Autowired
    private GeneralEntryRepository GeneralEntryRepository;

    @Autowired
    private UserService userService;

    public void saveEntry(GeneralEntry GeneralEntry, String userName){
        User user = userService.findByUserName(userName);
        GeneralEntry.setDate(LocalDateTime.now());
        GeneralEntry saved = GeneralEntryRepository.save(GeneralEntry);
        user.getGeneralEntries().add(saved);
        userService.saveEntry(user);
    }

    public void saveEntry(GeneralEntry GeneralEntry){
        GeneralEntryRepository.save(GeneralEntry);
    }

    public List<GeneralEntry> getAll(){
        return GeneralEntryRepository.findAll();
    }

    public Optional<GeneralEntry> findById(ObjectId id){
        return GeneralEntryRepository.findById(id);
    }

    public void deleteById(ObjectId id, String userName){
        User user = userService.findByUserName(userName);
        user.getGeneralEntries().removeIf(x ->x.getId().equals(id));
        userService.saveEntry(user);
        GeneralEntryRepository.deleteById(id);
    }

}
