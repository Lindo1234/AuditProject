package za.ac.cput.controller.user;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.issue.Issue;
import za.ac.cput.entity.user.Auditor;
import za.ac.cput.entity.user.AuditorData;
import za.ac.cput.factory.user.AuditorFactory;
import za.ac.cput.service.user.AuditorRaceService;
import za.ac.cput.service.user.AuditorService;

import java.util.Set;


@RestController
@RequestMapping("/auditor")
public class AuditorController {

    @Autowired
    private AuditorService auditorService;

    @RequestMapping(value = "create", method = RequestMethod.POST)

    public Auditor create(@RequestBody Auditor auditor) {
        //@PostMapping("/create")
        Auditor newauditor = AuditorFactory.buildAuditor(auditor.getAuditorID(), auditor.getAuditorFirstName(),
                auditor.getAuditorSurname(), auditor.getCellphone());
            return auditorService.create(newauditor);


    }
        // @PostMapping("/create")
        //public Auditor create(@RequestBody Auditor auditor) {
        // return auditorService.create(auditor);
        // }
        //Create not working

      @GetMapping("/read{auditorID}")
        public Auditor read (@PathVariable String auditorID){
            return auditorService.read(auditorID);

    }
    @PostMapping("/update")
    public Auditor update(@RequestBody Auditor auditor){
       return auditorService.update(auditor);
    }

    //delete not working

    @DeleteMapping("/delete")
        public boolean delete(@RequestBody String auditorID){
        return auditorService.delete(auditorID);

    }
    @GetMapping("/getAll")
    public Set<Auditor> getAll(){
        return auditorService.getAll();
    }

    @GetMapping("/getallwitha")
    public Set<Auditor> getallwitha(){
        return auditorService.getAllAuditorsStartWithA();
    }

}
