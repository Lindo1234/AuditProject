package za.ac.cput.service.demography;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.entity.user.Auditor;
import za.ac.cput.service.IService;

import java.util.Set;

public interface IRaceService extends IService<Race, String> {
    Set<Race> getAll();
}
