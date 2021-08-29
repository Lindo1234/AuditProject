package za.ac.cput.controller.user;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
    @Autowired
    private AuditorRaceService auditorRaceService;

    @Autowired
    private AuditorService auditorService;
    @RequestMapping(value = "/create", method = RequestMethod.POST)



    @PostMapping("/create")
    public Auditor create(@RequestBody AuditorData auditor){
        //this handles everything related to the employee creation
        auditor = AuditorFactory.buildAuditor(auditor.getAuditorID(), auditor.getAuditorFirstName(), auditor.getAuditorSurname(), auditor.getCellphone());
    return auditorService.create(auditor);
    }

    @GetMapping("/read/{id}")
    public Auditor read(@PathVariable String s){
        return auditorService.read(s);
    }

    @PostMapping("/update")
    public Auditor update(@RequestBody Auditor auditor){
       return auditorService.update(auditor);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String s){
        return auditorService.delete(s);
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
