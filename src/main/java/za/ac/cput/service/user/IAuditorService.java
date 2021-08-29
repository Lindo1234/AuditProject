package za.ac.cput.service.user;


import org.springframework.stereotype.Service;
import za.ac.cput.entity.user.Auditor;
import za.ac.cput.service.IService;

import java.util.Set;
@Service
public interface IAuditorService extends IService<Auditor, String> {
    Set<Auditor> getAll();


}
