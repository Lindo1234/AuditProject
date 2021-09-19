package za.ac.cput.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.demography.Race;
import za.ac.cput.entity.user.Auditor;
import za.ac.cput.entity.user.AuditorRace;
import za.ac.cput.factory.user.AuditorRaceFactory;
import za.ac.cput.service.demography.RaceService;
import za.ac.cput.service.user.AuditorRaceService;
import za.ac.cput.service.user.AuditorService;

@RestController
@RequestMapping("/auditorrace")
public class AuditorRaceController {
//ALL THIS WAS SUPPOSED TO BE IN AUDITORCONTROLLER AND VICE VERSA
    @Autowired
    private AuditorService auditorService;

    @Autowired
    private AuditorRaceService auditorRaceService;

    @Autowired
    private RaceService raceService;

    @PostMapping("/create")
    public AuditorRace create(@RequestBody AuditorRace auditorRace){
        boolean auditorExist = false;
        boolean raceExist = false;

        Auditor auditor = auditorService.read(auditorRace.getAuditorID());
        if(auditor != null)
        {
            auditorExist = true;
        }

        Race race = raceService.read(auditorRace.getRaceId());
        if(race != null){
            raceExist = true;
        }

        if(auditorExist && raceExist){
            return auditorRaceService.create(auditorRace);
        }
        else
            return AuditorRaceFactory.buildAuditorRace("", "");

    }



}
