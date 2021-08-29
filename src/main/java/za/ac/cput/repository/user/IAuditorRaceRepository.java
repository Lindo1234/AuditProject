package za.ac.cput.repository.user;

import za.ac.cput.entity.user.Auditor;
import za.ac.cput.entity.user.AuditorRace;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IAuditorRaceRepository extends IRepository<AuditorRace,String> {
    Set<AuditorRace> getAll();
}
