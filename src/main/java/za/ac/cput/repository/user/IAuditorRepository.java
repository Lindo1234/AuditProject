package za.ac.cput.repository.user;

import za.ac.cput.entity.user.Auditor;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IAuditorRepository extends IRepository<Auditor,String> {

    Set<Auditor> getAll();

}
