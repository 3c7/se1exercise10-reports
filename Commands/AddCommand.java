package Commands;

import Controller.ReportController;
import Models.CommandStackModel;
import Models.Report;

/**
 * Created by Nils on 03.01.2016.
 */
public class AddCommand implements Command {
    private final String NAME = "add";
    private final CommandStackModel commandstack = CommandStackModel.getInstance();
    private final ReportController reportController = ReportController.getInstance();

    public void execute(String[] args) {
        reportController.addReport(new Report(args));
        commandstack.addCommand(this);
    }

    public String getName() {
        return NAME;
    }
}
