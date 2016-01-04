package Models;

import Commands.Command;

import java.util.Stack;

/**
 * Created by Nils on 03.01.2016.
 */
public class CommandStackModel {
    private Stack<Command> commandstack = new Stack<>();
    private static CommandStackModel instance;

    private CommandStackModel(){}

    public static synchronized CommandStackModel getInstance() {
        if (instance == null) instance = new CommandStackModel();
        return instance;
    }

    public void addCommand(Command c) {
        commandstack.push(c);
    }

    public Command removeCommand(){
        return commandstack.pop();
    }

    public boolean isEmpty() {
        return commandstack.isEmpty();
    }
}
