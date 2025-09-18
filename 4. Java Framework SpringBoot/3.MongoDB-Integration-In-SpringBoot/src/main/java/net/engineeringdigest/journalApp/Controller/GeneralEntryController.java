package net.engineeringdigest.journalApp.Controller;
import net.engineeringdigest.journalApp.Entity.GeneralEntry;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/General")
public class GeneralEntryController {

    private final Map<Long,GeneralEntry> generalEntries = new HashMap<>();

    @GetMapping()
    public List<GeneralEntry> getAll(){
        return new ArrayList<>(generalEntries.values());
    }

    @PostMapping()
    public boolean createEntry(@RequestBody GeneralEntry myEntry){
        generalEntries.put(myEntry.getId(),myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public GeneralEntry getGeneralEntryById(@PathVariable Long myId){
        return generalEntries.get(myId);
    }


    @DeleteMapping("id/{myId}")
    public GeneralEntry deleteGeneralEntryById(@PathVariable Long myId){
        return generalEntries.remove(myId);
    }

    @PutMapping("id/{id}")
    public GeneralEntry updateGeneralEntryById(@PathVariable Long id, @RequestBody GeneralEntry myEntry){
        return generalEntries.put(id,myEntry);
    }

}
