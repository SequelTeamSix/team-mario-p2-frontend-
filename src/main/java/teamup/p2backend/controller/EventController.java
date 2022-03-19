package teamup.p2backend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teamup.p2backend.model.Event;
import teamup.p2backend.service.EventService;

import java.util.List;

@RestController
@RequestMapping("event") // ?
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

    @GetMapping("event_name/{event_name}")
    public Event getEventByName(@RequestParam String event_name){return eventService.findEventByName(event_name);}


    // @GetMapping("level/{level}")
    // public Event getEventByLevel(@PathVariable String level){
    //    return eventService.findEventByLevel(level);
    //}

    //@GetMapping("age_range/{age_range}")
    //public Event getEventByAge(@PathVariable String age_range){
    //    return eventService.findEventByAge(age_range);
    // }

    //need getEventBy place, date, time (&sport??)

    @PostMapping
    public Event postEvent(@RequestBody Event event){
        return eventService.saveEvent(event);
    }

    @DeleteMapping
    public void deleteEvent(@RequestParam String event_name){
        eventService.deleteEvent(event_name);
    }

    //@PatchMapping
}