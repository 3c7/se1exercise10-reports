package Commands;

import Controller.ReportController;
import Models.CommandStackModel;
import Models.Report;

import java.util.Stack;

/**
 * Created by Nils on 03.01.2016.
 */
public class AddCommand implements Command, UndoableCommand {
    private final String NAME = "add";
    private final CommandStackModel commandstack = CommandStackModel.getInstance();
    private final ReportController reportController = ReportController.getInstance();
    private final Stack<Integer> lastReportsAdded = new Stack<>();

    public void execute(String[] args) {
        reportController.addReport(new Report(args));
        lastReportsAdded.push(reportController.getSize() - 1);
    }

    public void undo() {
        reportController.removeReport(lastReportsAdded.pop());
    }

    public String getName() {
        return NAME;
    }
}
