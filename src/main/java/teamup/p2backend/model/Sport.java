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
        property = "sportname" //
)

@Entity
@Table(name="sport")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sport {

    @Id
    private String sportname;


}