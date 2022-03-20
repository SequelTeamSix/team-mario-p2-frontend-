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

    Event findByName(String name);

    //works
    @Query(value= "Select * from event where event.sportname=:sportname", nativeQuery = true) //syntax?
    Event findBySport(String sportname);

    //works
    @Query(value = "Select * from event where event.place=:place", nativeQuery = true)
    Event findByPlace(String place);

    //works
    @Query(value = "Select * from event where event.level=:level", nativeQuery = true)
    Event findByLevel(String level);

    //delete
    @Modifying
    @Query(value = "delete from event where event.name=:name", nativeQuery = true)
    void deleteByName(String name);

    //update(patch method)
    @Modifying
    @Query(value = "update event set event.name=:name, event.place=:place, event.date=:date, event.time=:time," +
            " event.level=:level, event.sportname=:sportname where event.event_id=:event_id", nativeQuery = true)
    void updateEvent(String name, String place, String date, String time, String level, String sportname, int event_id);

}

