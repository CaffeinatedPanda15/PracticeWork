package za.ac.cput.repository;

import za.ac.cput.domain.Console;

import java.util.ArrayList;
import java.util.List;

public class ConsoleRepository implements IRepository<Console, String> {

    public static IRepository repository = null;

    private List<Console> ConsoleList;

    private ConsoleRepository() {
        this.ConsoleList = new ArrayList<Console>();
    }

    private IRepository getRepository() {
        if (repository == null) {
            repository = new ConsoleRepository();
        }
        return repository;
    }
    @Override
    public Console create(Console console) {
        boolean success = ConsoleList.add(console);
                if (success) {
                    return console;
                }
        return console;
    }

    @Override
    public Console read(String consoleName) {
        for (Console c : ConsoleList) {
            if (c.getConsoleName().equals(consoleName));
            return c;
        }
        return null;
    }

    @Override
    public Console update(Console console) {
        String name = console.getConsoleName();
        Console consoleold = read(name);
        if (consoleold == null)
            return null;

        boolean success = delete(name);
        if (success) {
            if(ConsoleList.add(console))
                return console;
        }
        return consoleold;
    }

    @Override
    public Boolean delete(String consoleName) {
        Console consoleTODelete = read(consoleName);
        if (consoleTODelete ==  null)
            return false;
        return (ConsoleList.remove(consoleName));
    }
}//end of class
