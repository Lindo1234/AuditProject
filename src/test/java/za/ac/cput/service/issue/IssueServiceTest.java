package za.ac.cput.service.issue;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.issue.Issue;
import za.ac.cput.factory.issue.IssueFactory;
import za.ac.cput.service.issue.IssueService;

import static org.junit.jupiter.api.Assertions.*;

class IssueServiceTest {
    private static IssueService service = IssueService.createIssueService();

    private static Issue issue = IssueFactory.createIssue("No Elevator to 3rd floor", "Disability",
            "05/06/21","NA",true, false,true);

    private static Issue issue_2 = IssueFactory.createIssue("Not enough Lecturers", "Academic",
            "","",true, false,false);

    private static Issue issue_3 = IssueFactory.createIssue("Empty","","","",false,false,false);

    @Test
    void a_create() {
        service.create(issue);
        Issue success = service.create(issue_2);
        service.create(issue_3);
        assertNotNull(success);
        System.out.println("Created two issues");
    }

    @Test
    void b_read() {
        Issue readIssue = service.read(issue.getIssueId());
        assertEquals("Disability", issue.getIssueArea());
        System.out.println("Issue Read Success\n"+readIssue);
    }

    @Test
    void c_update() {
        Issue updatedIssue = IssueFactory.copyFromIssue(issue).setIssueDescription("No Elevator at all");
        service.update(updatedIssue);
        assertEquals("No Elevator at all", service.read(issue.getIssueId()).getIssueDescription());
        System.out.println("Updated Issue Description.\n"+issue);
    }

    @Test
    void d_delete() {
        boolean success = service.delete(issue_3.getIssueId());
        assertTrue(success);
        System.out.println("Issue successfully deleted.");
    }

    @Test
    void e_getAll() {
        assertEquals(2, service.getAll().size());
        System.out.println(service.getAll());
    }


}