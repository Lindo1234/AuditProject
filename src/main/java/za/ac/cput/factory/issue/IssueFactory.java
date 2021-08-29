package za.ac.cput.factory.issue;

import za.ac.cput.entity.issue.Issue;
import za.ac.cput.util.KeyGenerator;

public class IssueFactory {
    public static Issue createIssue(String issueDescription, String issueArea,
                                    String issueRaisedDate, String issueResolvedDate, boolean issueStatus,
                                    boolean isResolved, boolean isValidated){

        String issueId = KeyGenerator.genratedId();

        return new Issue.Builder().issueId(issueId).issueDescription(issueDescription).issueArea(issueArea)
                .issueRaisedDate(issueRaisedDate).issueResolvedDate(issueResolvedDate).issueStatus(issueStatus)
                .isResolved(isResolved).isValidated(isValidated).Build();
    }

    public static Issue copyFromIssue(Issue issue){
        return new Issue.Builder().Copy(issue);
    }

}
