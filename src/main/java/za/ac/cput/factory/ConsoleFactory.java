package za.ac.cput.factory;

import za.ac.cput.domain.Console;
import za.ac.cput.util.Helper;

public class ConsoleFactory {
    public static Console createConsole(String consoleName, String consoleCreator, int consoleAge) {
        if (Helper.isNullorEmpty(consoleName) || Helper.isNullorEmpty(consoleCreator))
            return null;
        return new Console.Builder()
                .setConsoleName(consoleName)
                .setConsoleCreator(consoleCreator)
                .setConsoleAge(consoleAge)
                .build();
    }
}
