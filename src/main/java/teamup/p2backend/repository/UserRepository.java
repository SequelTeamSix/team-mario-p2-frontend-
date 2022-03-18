package teamup.p2backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import teamup.p2backend.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {

    User save(User user);

    List<User> findAll();

    User findById(int user_id);

    //User findByFullName(String full_name);

    //User findByUsername(String username);

    //User findByEmail(String email);

    void deleteById(int user_id);

    //update(patch/put) 'methods'
}
