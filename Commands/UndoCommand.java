package Commands;

import Controller.ReportController;
import Models.CommandStackModel;
import Views.ConsoleView;

/**
 * Created by Nils on 03.01.2016.
 */
public class UndoCommand implements Command {
    private final String NAME = "undo";
    private final ConsoleView consoleView = new ConsoleView();
    private final CommandStackModel commandStackModel = CommandStackModel.getInstance();
    private final ReportController reportController = ReportController.getInstance();

    public void execute(String[] args) {
        if (commandStackModel.isEmpty()) {
            consoleView.outLine("Nothing to UNDO.");
            return;
        }

        Command lastCommand = commandStackModel.removeCommand();

        // Undo's for other commands need to be configured here
        if (lastCommand.getName().equals("add")) {
            reportController.removeLastReport();
        }
    }

    public String getName() {
        return NAME;
    }
}
