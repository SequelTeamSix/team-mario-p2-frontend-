package teamup.p2backend.model;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@JsonIdentityInfo(

        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "event_name" //
)

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
     */


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    //relationship to other tables
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sport_name")
    private Sport sport;
}