package za.ac.cput.service.user;

import za.ac.cput.entity.user.Auditor;
import za.ac.cput.entity.user.AuditorRace;
import za.ac.cput.service.IService;

import java.util.Set;

public interface IAuditorRaceService extends IService<AuditorRace, String> {
    Set<AuditorRace> getAll();
}
