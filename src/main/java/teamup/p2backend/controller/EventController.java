package teamup.p2backend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teamup.p2backend.model.Event;
import teamup.p2backend.service.EventService;

import java.util.List;

@RestController
@RequestMapping("event")
public class EventController {

    EventService eventService;

    @Autowired
    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @GetMapping
    List<Event> getEvents(){
        return eventService.findAllEvents();
    }

    @GetMapping("name/{name}")
    public Event getEventByName(@PathVariable String name){return eventService.findEventByName(name);}

    //next 3 find queries print All events for some reason - need to fix
    @GetMapping("sportname/{sportname}")
    public Event getEventBySport(@PathVariable String sportname){return eventService.findEventBySport(sportname);}

    @GetMapping("level/{level}")
    public Event getEventByLevel(@PathVariable String level){return eventService.findEventByLevel(level);}

    @GetMapping("place/{place}")
    public Event getEventByPlace(@PathVariable String place){return eventService.findEventByPlace(place);}

    @PostMapping
    public Event postEvent(@RequestBody Event event){
        return eventService.saveEvent(event);
    }

    @DeleteMapping
    public void deleteEvent(@RequestParam String name){
        eventService.deleteEvent(name);
    }

    @PatchMapping
    public void updateName(@RequestBody Event event){eventService.updateEvent(event);}

    /*@PatchMapping
    public void updateEventInfo(@RequestBody Event event){eventService.updateEventInfo(event);} */
}