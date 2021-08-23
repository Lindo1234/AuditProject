package za.ac.cput.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.Auditor;

@RestController
@RequestMapping("/auditor")
public class AuditorController {

    @RequestMapping(value = "/create", method = RequestMethod.POST)

    //@PostMapping("/create")

    public String create(Auditor auditor){

        return "created";
    }
}
