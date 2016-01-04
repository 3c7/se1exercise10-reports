package Commands;

import Exceptions.UserExitException;

/**
 * Created by Nils on 03.01.2016.
 */
public interface Command {
    void execute(String[] args) throws UserExitException;
    String getName();
}
