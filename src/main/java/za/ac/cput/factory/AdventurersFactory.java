package za.ac.cput.factory;

import za.ac.cput.domain.Adventurers;
import za.ac.cput.util.Helper;

public class AdventurersFactory {
    public static Adventurers createAdventurer(String adventurerId, String firstName, String lastName, String Race, int Age) {
        if (Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName) || Helper.isNullorEmpty(Race))
            return null;
        return new Adventurers.Builder()
                .setAdventuerId(adventurerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setRace(Race)
                .setAge(Age)
                .build();
    }

    public static Adventurers createAdventurer(String adventurerId, String firstName, String lastName) {
            if (Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName))
                return null;
        return new Adventurers.Builder()
                .setAdventuerId(adventurerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }
}//end of class
