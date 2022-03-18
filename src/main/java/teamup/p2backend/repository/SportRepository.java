package teamup.p2backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import teamup.p2backend.model.Sport;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface SportRepository extends JpaRepository<Sport, Integer> {

    Sport save(Sport sport);

    List<Sport> findAll();

    Sport findById(int sport_id);

    //Sport findByType(String sport_name);

    /* Sport findByLevel(String level);

    Sport findByAge(String age_range); */

    void deleteById(int sport_id);

    //update(patch/put) 'methods'
}
