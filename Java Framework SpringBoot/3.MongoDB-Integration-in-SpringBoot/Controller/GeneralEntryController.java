package net.engineeringdigest.journalApp.Controller;
import net.engineeringdigest.journalApp.Entity.GeneralEntry;
import net.engineeringdigest.journalApp.Service.GeneralEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/GeneralM")
public class GeneralEntryController {

    @Autowired
    private GeneralEntryService GeneralEntryService;

    @GetMapping
    public List<GeneralEntry>getAll(){
        return GeneralEntryService.getAll();
    }

    @PostMapping
    public GeneralEntry createEntry(@RequestBody GeneralEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        GeneralEntryService.saveEntry(myEntry);
        return myEntry;
    }

    @GetMapping("id/{myId}")
    public GeneralEntry getGeneralEntryById(@PathVariable ObjectId myId){
        return GeneralEntryService.findById(myId).orElse(null);
    }

    @DeleteMapping("id/{myId}")
        public boolean deleteGeneralEntryById(@PathVariable ObjectId myId){
        GeneralEntryService.deleteById(myId);
        return true;
    }

    @PutMapping("/id/{id}")
    public GeneralEntry updateGeneralEntryById(@PathVariable ObjectId id, @RequestBody GeneralEntry newEntry){
        GeneralEntry old = GeneralEntryService.findById(id).orElse(null);
        if (old != null){
            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle():
                    old.getTitle());
            old.setContent(newEntry.getContent() != null && !newEntry.equals("") ? newEntry.getContent() :
                    old.getContent());
        }
        GeneralEntryService.saveEntry(old);
        return old;
    }


}
