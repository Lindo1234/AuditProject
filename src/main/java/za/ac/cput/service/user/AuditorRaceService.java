package za.ac.cput.service.user;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.user.AuditorRace;
import za.ac.cput.repository.user.AuditorRaceRepository;

import java.util.Set;

@Service
public class AuditorRaceService implements IAuditorRaceService {
    private static AuditorRaceService service = null;
    private AuditorRaceRepository repository ;


    private AuditorRaceService(){
        this.repository = AuditorRaceRepository.getRepository();

    }
    public static AuditorRaceService getService(){
        if(service == null){
            service = new AuditorRaceService();
        }
        return service;
    }

    @Override
    public AuditorRace create(AuditorRace auditorRace){
        return this.repository.create(auditorRace);
    }
    @Override
    public AuditorRace read(String auditorRace){
        return this.repository.read(auditorRace);
    }

    @Override
    public AuditorRace update(AuditorRace auditorRace){
        return this.repository.update(auditorRace);
    }

    @Override
    public boolean delete(String auditorRace){
        return this.repository.delete(auditorRace);
    }

    @Override
    public Set<AuditorRace> getAll(){
        return this.repository.getAll();
    }
}
