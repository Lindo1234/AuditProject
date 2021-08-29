package za.ac.cput.repository.user;

import org.springframework.stereotype.Repository;
import za.ac.cput.entity.user.Auditor;

import java.util.*;
@Repository
public class AuditorRepository implements IAuditorRepository {

    private static AuditorRepository repository = null;
    private Map<String, Auditor> auditorDB;

    private AuditorRepository(){ this.auditorDB = new HashMap<>(); }

    public static AuditorRepository getRepository(){
        if(repository == null) {
            repository = new AuditorRepository();
        }
        return repository;

    }

    @Override
    public Auditor create(Auditor auditor) {
        if(read(auditor.getAuditorID())  == null){
            this.auditorDB.put(auditor.getAuditorID(),auditor);
        }
        return auditor;
    }

    @Override
    public Auditor read(String auditorID) {
        return this.auditorDB.get(auditorID);
    }

    @Override
    public Auditor update(Auditor auditor) {
        if(read(auditor.getAuditorID()) != null){
            auditorDB.replace(auditor.getAuditorID(), auditor);
        }
        return auditor;
    }

    @Override
    public boolean delete(String auditorID) {
        Auditor auditor = read(auditorID);
        this.auditorDB.remove(auditorID, auditor);
        if (auditorID == null)
            return false;
        auditorDB.remove(auditorID);

        return true;
    }
    @Override
    public Set<Auditor> getAll() {
        Collection<Auditor> auditors = this.auditorDB.values();
        Set<Auditor> set = new HashSet<>();
        set.addAll(auditors);
        return set;
    }

}
