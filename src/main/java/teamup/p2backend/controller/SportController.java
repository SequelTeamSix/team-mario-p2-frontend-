package teamup.p2backend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teamup.p2backend.model.Sport;
import teamup.p2backend.service.SportService;

import java.util.List;

@RestController
@RequestMapping("sport") // ?
public class SportController {
    SportService sportService;

    @Autowired
    public SportController(SportService sportService){this.sportService = sportService;}

    @GetMapping
    List<Sport> getSports(){
        return sportService.findAllSports();
    }


    @GetMapping("sport_name/{sport_name}")
    public Sport getSport(@RequestParam String sport_name){
        return sportService.findSport(sport_name);
    }

    @PostMapping
    public Sport postSport(@RequestBody Sport sport){
        return sportService.saveSport(sport);
    }

    @DeleteMapping()
    public void deleteSport(@RequestParam String sport_name){
        sportService.deleteSport(sport_name);
    }


}
