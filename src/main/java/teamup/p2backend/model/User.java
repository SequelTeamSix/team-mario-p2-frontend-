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
        property = "user_id" //
)*/

@Entity
@Table(name="user1")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    /*USER

    user id
    username
    fullname
    email
    password */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //column
    private int user_id1;
    @Column
    private String username1;
    @Column
    private String full_name1;
    @Column
    private String email1;
    @Column
    private String password1;

    //relationships between tables <??>
}