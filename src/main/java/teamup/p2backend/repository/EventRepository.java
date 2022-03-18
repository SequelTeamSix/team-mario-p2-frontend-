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

    Event findById(int event_id);

    //Event findByName(String event_name);

    //?Event findBySport(String sport);

    //Event findByLevel(String level);

    //need findBy place, date, time

    void deleteById(int event_id);

    //update(patch/put) 'methods'
}

