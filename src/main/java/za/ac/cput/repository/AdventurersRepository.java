package za.ac.cput.repository;

import za.ac.cput.domain.Adventurers;

import java.util.ArrayList;
import java.util.List;

public class AdventurersRepository implements IRepository <Adventurers, String> {

    public static IRepository repository = null;

    private List<Adventurers> AdventurersList;

    public AdventurersRepository() {
        this.AdventurersList = new ArrayList<Adventurers>();
    }

    public static IRepository getRepository() {
        if (repository == null) {
            repository = new AdventurersRepository();
        }
        return repository;
    }


    @Override
    public Adventurers create(Adventurers adventurers) {
        boolean success = AdventurersList.add(adventurers);
        if (success) {
            return adventurers;
        }
        return null;
    }

    @Override
    public Adventurers read(String adventurerId) {
        for (Adventurers A : AdventurersList) {
            if (A.getAdventurerId().equals(adventurerId));
            return A;
        }
        return null;
    }

    @Override
    public Adventurers update(Adventurers adventurers) {
        String id = adventurers.getAdventurerId();
        Adventurers adventurersOld = read(id);
        if (adventurersOld == null)
            return null;

        boolean success = delete(id);
        if (success) {
            if (AdventurersList.add(adventurers))
                return adventurers;
        }
        return null;
    }

    @Override
    public Boolean delete(String adventurerId) {
        Adventurers adventurersToDelete = read(adventurerId);
        if (adventurersToDelete == null)
            return false;
        return (AdventurersList.remove(adventurerId));
    }
}//end of class
