/* IssueRService.java Class
 * Entity for Issue Service
 * Author: Athenkosi Zono (218030185)
 * Date: 28 July 2021
 */
package za.ac.cput.service;

import za.ac.cput.entity.Issue;

import java.util.Set;

public interface IIssueService extends IService<Issue, String> {
    public Set<Issue> getAll();
}
