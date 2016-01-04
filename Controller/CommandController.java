package Controller;

import Commands.AddCommand;
import Commands.Command;
import Commands.ExitCommand;
import Commands.UndoCommand;
import Models.CommandModel;

/**
 * COMMANDCONTROLLER
 * Created by Nils on 03.12.2015.
 */
class CommandController {

    private CommandModel commandModel = CommandModel.getInstance();

    public CommandController() {
        CommandModel commandModel = CommandModel.getInstance();
        commandModel.addCommand(new AddCommand());
        commandModel.addCommand(new UndoCommand());
        commandModel.addCommand(new ExitCommand());
    }

    public Command getCommand(String key) {
        return commandModel.getCommand(key);
    }
}
