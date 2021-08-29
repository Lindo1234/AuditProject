package za.ac.cput.repository.demography;

import za.ac.cput.entity.demography.Race;
import za.ac.cput.entity.user.Auditor;
import za.ac.cput.repository.user.AuditorRepository;

import java.util.*;

public class RaceRepository implements IRaceRepository {
    private static RaceRepository repository = null;
    private Map<String, Race> raceDB;

    private RaceRepository(){ this.raceDB = new HashMap<>(); }

    public static RaceRepository getRepository(){
        if(repository == null) {
            repository = new RaceRepository();
        }
        return repository;

    }

    @Override
    public Race create(Race race) {
        if(read(race.getId())  == null){
            this.raceDB.put(race.getId(),race);
        }
        return race;
    }

    @Override
    public Race read(String s) {
        return this.raceDB.get(s);
    }

    @Override
    public Race update(Race race) {
        if(read(race.getId()) != null){
            raceDB.replace(race.getId(), race);
        }
        return race;
    }

    @Override
    public boolean delete(String id) {
        Race race = read(id);
        this.raceDB.remove(id,race);
        if (id == null)
            return false;
        raceDB.remove(id);

        return true;
    }
    @Override
    public Set<Race> getAll() {
        Collection<Race> races = this.raceDB.values();
        Set<Race> set = new HashSet<>();
        set.addAll(races);
        return set;
    }
}
