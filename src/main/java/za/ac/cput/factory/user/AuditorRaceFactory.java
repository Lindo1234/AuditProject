package za.ac.cput.factory.user;

import za.ac.cput.entity.user.AuditorRace;
import za.ac.cput.util.KeyGenerator;

public class AuditorRaceFactory {
    public static AuditorRace buildAuditorRace(String auditorID, String raceId){

        if((KeyGenerator.isNullorEmpty((auditorID))|| (KeyGenerator.isNullorEmpty(raceId))))
            return new AuditorRace.Builder().build();

        return new AuditorRace.Builder()
                .setAuditorID(auditorID)
                .setRaceId(raceId)
                .build();

    }
}
