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
        property = "name" //
)

@Entity
@Table(name="event")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Event {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column
    private int event_id;
    //@Id
    //@Column
    private String name;
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
    @JoinColumn(name = "sportname")
    private Sport sport;
}