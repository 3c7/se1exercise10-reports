package Commands;

import Exceptions.UserExitException;
import Views.ConsoleView;

/**
 * Created by Nils on 03.01.2016.
 */
public class ExitCommand implements Command {
    private final ConsoleView consoleView = new ConsoleView();
    private final String NAME = "exit";

    public void execute(String[] args) throws UserExitException {
        consoleView.outLine("Good Bye!");
        throw new UserExitException();
    }

    public void undo() {}

    public String getName() {
        return NAME;
    }
}
