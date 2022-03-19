package teamup.p2backend.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import teamup.p2backend.model.Event;
import teamup.p2backend.repository.EventRepository;

import java.lang.annotation.*;
import java.util.List;

@Component
public class EventService {

    EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    public void deleteEvent(String event_name) {
        eventRepository.deleteByName(event_name);
    }

    public Event findEventByName(String event_name) {
        return eventRepository.findByName(event_name);}


    //public Event findEventByLevel(String level){
    //    return eventRepository.findByLevel(level);
    //}

    // public Event findEventByAge(String age_range){
    //    return eventRepository.findByAge(age_range);
    //}

    //need findBy place, date, time

    //update(patch/put) methods

}
