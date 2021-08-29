package za.ac.cput.factory.issue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.entity.issue.Issue;
import za.ac.cput.factory.issue.IssueFactory;

import static org.junit.jupiter.api.Assertions.*;

class IssueFactoryTest {
    Issue issue, issue2, issue3, issue4;
    @BeforeEach
    void setup(){
        issue = IssueFactory.createIssue("No Elevator to 3rd floor", "Disability",
                "05/06/21","NA",true, false,true);

        issue2 = IssueFactory.createIssue("Not enough Lecturers", "Academic",
                "20/02/21","03/05/21",true, true,true);
        issue3 = issue;
    }

    @Test
    void testEquality(){
        issue4 = IssueFactory.copyFromIssue(issue);
        assertEquals(issue.getIssueId(), issue4.getIssueId());
        System.out.println("Objects are equal because issue was copied into issue4");
    }

    @Test void testIdentity(){
        assertSame(issue, issue3);
        System.out.println("Objects are Identical");
    }

    @Timeout(11000)
    @Test void testTimeout() throws InterruptedException {
        Thread.sleep(11000);
        assertNotNull(issue);
        System.out.println("Timeout display after 11 seconds");
    }

    @Disabled("Disabled this test")
    @Test void testDisabled(){
        assertNotNull(issue2);
    }


}