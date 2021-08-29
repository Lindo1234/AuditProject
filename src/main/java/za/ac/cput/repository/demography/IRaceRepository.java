package za.ac.cput.repository.demography;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.entity.user.Auditor;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IRaceRepository extends IRepository<Race,String> {
    Set<Race> getAll();
}
