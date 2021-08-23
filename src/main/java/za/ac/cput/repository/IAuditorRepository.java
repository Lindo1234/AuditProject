package za.ac.cput.repository;

import za.ac.cput.entity.Auditor;

import java.util.Set;

public interface IAuditorRepository extends IRepository<Auditor,String> {

    Set<Auditor> getAll();

}
