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

    Sport findBySportname(String sportname);

    @Modifying
    @Query(value = "delete from sport where sport.sportname=:sportname", nativeQuery = true)
    void deleteByName(String sportname);

}
