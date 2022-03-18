package teamup.p2backend.model;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/*@JsonIdentityInfo(

        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "event_id" //
)*/

@Entity
@Table(name="event")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Event {
     /* Event

    EventID
    Place <need to consult>
    Date
    Time
    +Level
    +Age Range
     */


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column
    private int event_id;
    @Column
    private String event_name;
    @Column
    private String place;
    @Column
    private String date;
    @Column
    private String time;
    @Column
    private String level;
    @Column
    private String age_range;

    //relationship to other tables
    //@JoinColumn Sport(/id)
}