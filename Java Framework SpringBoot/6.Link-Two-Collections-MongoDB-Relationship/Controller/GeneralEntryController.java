package net.engineeringdigest.journalApp.Controller;
import net.engineeringdigest.journalApp.Entity.GeneralEntry;
import net.engineeringdigest.journalApp.Entity.User;
import net.engineeringdigest.journalApp.Service.GeneralEntryService;
import net.engineeringdigest.journalApp.Service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/General")
public class GeneralEntryController {

    @Autowired
    private GeneralEntryService GeneralEntryService;

    @Autowired
    private UserService userService;

    @GetMapping("{userName}")
    public ResponseEntity<?>getAllGeneralEntriesOfUser(@PathVariable String userName){
        User user  = userService.findByUserName(userName);
        List<GeneralEntry> all = user.getGeneralEntries();
        if (all != null && !all.isEmpty()){
            return new ResponseEntity<>(all,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("{userName}")
    public ResponseEntity<GeneralEntry> createEntry(@RequestBody GeneralEntry myEntry ,@PathVariable String userName){
        try {
            User user  = userService.findByUserName(userName);
            GeneralEntryService.saveEntry(myEntry);
            return new ResponseEntity<>(myEntry,HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("id/{myId}")
    public ResponseEntity<GeneralEntry> getGeneralEntryById(@PathVariable ObjectId myId){
        Optional<GeneralEntry> GeneralEntry = GeneralEntryService.findById(myId);
        if (GeneralEntry.isPresent()){
            return new ResponseEntity<>(GeneralEntry.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("id/{username}/{myId}")
        public ResponseEntity<?> deleteGeneralEntryById(@PathVariable ObjectId myId,@PathVariable String userName){
        GeneralEntryService.deleteById(myId,userName);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/id{userName}/{id}")
    public ResponseEntity<?> updateGeneralEntryById(@PathVariable ObjectId id, @RequestBody GeneralEntry newEntry,@PathVariable String userName) {
        GeneralEntry old = GeneralEntryService.findById(id).orElse(null);
        if (old != null) {
            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() :
                    old.getTitle());
            old.setContent(newEntry.getContent() != null && !newEntry.equals("") ? newEntry.getContent() :
                    old.getContent());
            GeneralEntryService.saveEntry(old);
            return new ResponseEntity<>(old,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
