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

    //next 3 find queries print All events for some reason - need to fix
    @Query(value= "from event where event.sportname=:sportname", nativeQuery = true)
    Event findBySport(String sportname);

    @Query(value = "from event where event.place=:place", nativeQuery = true)
    Event findByPlace(String place);

    @Query(value = "from event where event.level=:level", nativeQuery = true)
    Event findByLevel(String level);

    //delete
    @Modifying
    @Query(value = "delete from event where event.name=:name", nativeQuery = true)
    void deleteByName(String name);

    //update(patch/put) 'methods'
    @Modifying
    @Query(value = "update event set event.name=:name where event.event_id=:event_id", nativeQuery = true)
    void updateByName(String name, int event_id);

    @Modifying
    @Query(value = "update event set event.place=:place, event.date=:date, event.time=:time, event.level=:level," +
            " event.sportname=:sportname WHERE event.name=:name", nativeQuery = true)
    void updateInfo(String place, String date, String time, String level, String sportname, String name);



}

