package teamup.p2backend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teamup.p2backend.model.Sport;
import teamup.p2backend.service.SportService;

import java.util.List;

@RestController
@RequestMapping("sport")
public class SportController {
    SportService sportService;

    @Autowired
    public SportController(SportService sportService){this.sportService = sportService;}

    @GetMapping
    List<Sport> getSports(){
        return sportService.findAllSports();
    }

    @GetMapping("sportname/{sportname}")
    public Sport getSport(@PathVariable String sportname){
        return sportService.findSport(sportname);
    }

    @PostMapping
    public Sport postSport(@RequestBody Sport sport){
        return sportService.saveSport(sport);
    }

    @DeleteMapping()
    public void deleteSport(@RequestParam String sportname){
        sportService.deleteSport(sportname);
    }


}
