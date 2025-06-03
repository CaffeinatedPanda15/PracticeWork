package za.ac.cput.service;

import za.ac.cput.domain.Adventurers;

import java.util.ArrayList;
import java.util.List;

public class AdventurerService implements IService<Adventurers, String> {

    private static IService service;

    private AdventurersRepository repository;

    private List<Adventurers> AdventurerList;

    private AdventurerService() {
        this.repository = (AdventurersRepository) AdventurersRepository.getRepository();
        this.AdventurerList = new ArrayList<Adventurers>();
    }

    public static IService getService(){
        if (service == null) {
            service = new AdventurerService();
        }
        return service;
    }

    @Override
    public Adventurers create(Adventurers adventurers) {
        return this.repository.create(adventurers);
    }

    @Override
    public Adventurers read(String adventuerId) {
        return this.repository.read(adventuerId);
    }

    @Override
    public Adventurers update(Adventurers adventurers) {
        return null;
    }


}
