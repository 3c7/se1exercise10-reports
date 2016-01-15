package Observer;

import Controller.ReportController;
import Models.Report;
import Views.ConsoleView;

import java.util.List;

/**
 * Created by Nils on 03.01.2016.
 */
public class ListView implements Observer {
    private final ConsoleView consoleView = new ConsoleView();
    private final ReportController reportController = ReportController.getInstance();
    private final String NAME = "ListView";

    public void update(List<Report> list) {
        consoleView.outLine(getName() + ": ");
        if (list.size() > 0)
            for (int i=1;i<=list.size();i++) {
                consoleView.outLine("Report Nr. " + i + ": (\"" + list.get(i-1).getContentString() + "\")");
            }
        else
            consoleView.outLine("Empty!");
    }

    public String getName() {
        return NAME;
    }
}
