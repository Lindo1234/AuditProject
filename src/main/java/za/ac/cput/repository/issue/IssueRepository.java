package za.ac.cput.repository.issue;

import za.ac.cput.entity.issue.Issue;

import java.util.HashSet;
import java.util.Set;

public class IssueRepository implements IIssueRepository {
    private static IssueRepository issueRepository = null;
    private Set<Issue> issueDB;

    private IssueRepository(){
        issueDB = new HashSet<>();
    }

    public static IssueRepository createIssueRepository(){
        if(issueRepository == null) issueRepository = new IssueRepository();
        return issueRepository;
    }

    @Override
    public Set<Issue> getAll() {
        return issueDB;
    }

    @Override
    public Issue create(Issue issue) {
        issueDB.add(issue);
        return issue;
    }

    @Override
    public Issue read(String s) {
        for(Issue issue: issueDB)
            if(issue.getIssueId() == s) return issue;
        return null;
    }

    @Override
    public Issue update(Issue issue) {
        for(Issue i: issueDB)
            if(i.getIssueId() == issue.getIssueId()) {
                issueDB.remove(i);
                issueDB.add(issue);
                return issue;
            }
        return null;
    }

    @Override
    public boolean delete(String s) {
        for(Issue issue: issueDB)
            if(issue.getIssueId() == s) {
                issueDB.remove(issue);
                return true;
            }
        return false;
    }
}
