package za.ac.cput.entity.demography;


import za.ac.cput.entity.user.Auditor;

import java.io.Serializable;

public class Race implements Serializable {
    private String id, description;

    private Race(){}

    private Race(Builder builder){
        this.id = builder.id;
        this.description = builder.description;
    }

    public String getId() {return id;}
    public String getDescription() {return description;}



    @Override
    public String toString() {
        return "Race{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String description;


        public Race.Builder setId(String id){
                this.id = id;
                return this;
            }
        public Race.Builder setDescription(String description){
                this.description = description;
                return this;
            }


            public Race.Builder id(String id) {
                this.id = id;
                return this;
            }

            public Race.Builder description(String description) {
                this.description = description;
                return this;
            }


            public Race build()  {
                return new Race(this);
            }

            public Race.Builder copy(Race race) {
                this.id = race.id;
                this.description = race.description;
                return this;

            }

        }
}
