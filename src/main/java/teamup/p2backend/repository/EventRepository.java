package teamup.p2backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import teamup.p2backend.model.Event;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface EventRepository extends JpaRepository<Event, Integer> {

    Event save(Event event);

    List<Event> findAll();

    @Query(value = "select form event where event.event_name=:event_name", nativeQuery = true)
    Event findByName(String event_name);

    //?Event findBySport(String sport);

    //Event findByLevel(String level);

    //need findBy place, date, time

    @Modifying
    @Query(value = "delete from event where event.event_name=:event_name", nativeQuery = true)
    void deleteByName(String event_name);

    //update(patch/put) 'methods'
}

