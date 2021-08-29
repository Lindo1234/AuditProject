package za.ac.cput.service.demography;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.demography.Race;
import za.ac.cput.entity.user.Auditor;
import za.ac.cput.repository.demography.RaceRepository;
import za.ac.cput.repository.user.AuditorRepository;
import za.ac.cput.service.user.AuditorService;
import za.ac.cput.service.user.IAuditorService;

import java.util.Set;
@Service
public class RaceService implements IRaceService {
    private static RaceService service = null;
    private RaceRepository repository;

    private RaceService(){ this.repository = RaceRepository.getRepository();}

    public static RaceService getService(){
        if(service == null){service = new RaceService();}
        return service;
    }

    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return this.repository.create(race);
    }

    @Override
    public Race read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Race update(Race race) {
        return repository.update(race);
    }

    @Override
    public boolean delete(String s) { return repository.delete(s);
    }
}
