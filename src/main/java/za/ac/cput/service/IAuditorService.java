package za.ac.cput.service;


import za.ac.cput.entity.Auditor;

import java.util.Set;

public interface IAuditorService extends IService<Auditor, String> {
    Set<Auditor> getAll();


}
