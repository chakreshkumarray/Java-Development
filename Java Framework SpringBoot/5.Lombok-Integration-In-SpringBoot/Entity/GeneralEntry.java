package net.engineeringdigest.journalApp.Entity;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "General_entries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Data
@Generated
public class GeneralEntry {

    @Id
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;




}
