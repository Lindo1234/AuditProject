package za.ac.cput.entity.user;
//bridging class/class

public class AuditorRace {
    private String auditorID;
    private String raceId;

    public AuditorRace() {
    }

    private AuditorRace(Builder builder) {
        this.auditorID = builder.auditorID;
        this.raceId = builder.raceId;

    }

    public String getAuditorID() {
        return auditorID;
    }

    public String getRaceId() {
        return raceId;
    }

    @Override
    public String toString() {
        return "AuditorRace{" +
                "auditorID='" + auditorID + '\'' +
                ", raceId='" + raceId + '\'' +
                '}';
    }

    public static class Builder {

        private String auditorID;
        private String raceId;


        public Builder auditorID(String auditorID){
            this.auditorID = auditorID;
            return this;
        }
        public Builder raceId(String raceId){
            this.raceId = raceId;
            return this;

    }

        public Builder setAuditorID(String auditorID) {
            this.auditorID = auditorID;
            return this;
        }

        public Builder setRaceId(String raceId) {
            this.raceId = raceId;
            return this;
        }

        public AuditorRace build()  {
            return new AuditorRace(this);
        }

        public Builder copy(AuditorRace auditorRace) {
            this.auditorID = auditorRace.auditorID;
            this.raceId = auditorRace.raceId;

            return this;

        }

    }
}