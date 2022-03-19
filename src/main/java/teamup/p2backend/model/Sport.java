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
        property = "sport_name" //
)

@Entity
@Table(name="sport")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sport {

     /* Sports table

    Sport ID
    Sport name
    (-)Level (beginner intermediate expert)
    (-)Age range? (teen, 18+, children)
    (-)Time
    (-)Place
      *moved (-) to Event table */

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column
    //int sport_id;

    @Id
    private String sport_name;


    //need to consult on this-- join column or join table (??)
    //JoinColumn w/ Event table


}