package za.ac.cput.repository.issue;
import za.ac.cput.entity.issue.Issue;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IIssueRepository extends IRepository<Issue, String> {
    public Set<Issue> getAll();
}
