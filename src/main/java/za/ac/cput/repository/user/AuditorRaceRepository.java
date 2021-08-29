package za.ac.cput.repository.user;

import za.ac.cput.entity.user.Auditor;
import za.ac.cput.entity.user.AuditorRace;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AuditorRaceRepository implements IAuditorRaceRepository {

    private static AuditorRaceRepository repository = null;
    private Set<AuditorRace> auditorRaceDB;

    private AuditorRaceRepository(){ this.auditorRaceDB = new HashSet<>();
    }

    public static AuditorRaceRepository getRepository() {
        if (repository == null) {
            repository = new AuditorRaceRepository();
    }
        return repository;

    }

    public AuditorRace create(AuditorRace auditorRace) {
        boolean success = auditorRaceDB.add(auditorRace);
        if(!success)
            return null;

        return auditorRace;
    }

    @Override

    public AuditorRace read(String auditorID){
        AuditorRace auditorRace = auditorRaceDB.stream()
                .filter(e -> e.getAuditorID().equals(auditorID))
                .findAny()
                .orElse(null);
                return auditorRace;

    }
    @Override
    public AuditorRace update(AuditorRace auditorRace){
        AuditorRace oldAuditorRace = read(auditorRace.getAuditorID());
        if(oldAuditorRace != null){
            auditorRaceDB.remove(oldAuditorRace);
            auditorRaceDB.add(auditorRace);
            return auditorRace;
        }
        return null;
    }

    @Override
    public boolean delete(String auditorID){
        AuditorRace auditorRaceToDelete = read(auditorID);
        if(auditorRaceToDelete == null)
            return false;
        auditorRaceDB.remove(auditorRaceToDelete);
        return true;

    }

    @Override
    public Set<AuditorRace> getAll(){
        return auditorRaceDB;
    }
}
