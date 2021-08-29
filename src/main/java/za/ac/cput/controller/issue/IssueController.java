/* IssueController.java Class
 * Entity for Issue Controller
 * Author: Athenkosi Zono (218030185)
 * Date: 4 August 2021
 */

package za.ac.cput.controller.issue;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.issue.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.service.issue.IssueService;
import java.util.Set;

@RestController
@RequestMapping("/issue")
public class IssueController {

    @Autowired
    private IssueService service;

    private IssueController() {
        service = IssueService.createIssueService();
    }

    @PostMapping("/create")
    public Issue create(@RequestBody Issue issue) {
        return service.create(issue);
    }

    @GetMapping("/read")
    public Issue read(@RequestBody String id) {
        return service.read(id);
    }

    @PostMapping("/update")
    public Issue update(@RequestBody Issue issue) {
        return service.update(issue);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody String id){
        return service.delete(id) ? "Successfully deleted." : "Could NOT Perform delete operation!";
    }

    @GetMapping("/getall")
    public Set<Issue> getAll() {
        return service.getAll();
    }

}


