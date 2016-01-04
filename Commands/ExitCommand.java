package Commands;

import Exceptions.UserExitException;

/**
 * Created by Nils on 03.01.2016.
 */
public class ExitCommand implements Command {
    private final String NAME = "exit";

    public void execute(String[] args) throws UserExitException {
        throw new UserExitException();
    }

    public String getName() {
        return NAME;
    }
}
