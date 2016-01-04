package Models;

import Commands.Command;

import java.util.HashMap;

/**
 * Created by Nils on 03.12.2015.
 */
public class CommandModel {
    private static CommandModel instance = null;
    private final HashMap<String, Command> commands = new HashMap<String, Command>();

    private CommandModel(){}

    public void addCommand(Command c) {
        commands.put(c.getName(), c);
    }

    public void removeCommand(String key) {
        if (commands.containsKey(key))
            commands.remove(key);
    }

    public boolean containsCommand(String key) {
        return commands.containsKey(key);
    }

    public Command getCommand(String key) {
        if (commands.containsKey(key))
            return commands.get(key);
        else return null;
    }

    public synchronized static CommandModel getInstance() {
        if (instance != null) return instance;
        return instance = new CommandModel();
    }

}
