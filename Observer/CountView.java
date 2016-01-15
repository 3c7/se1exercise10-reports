package Observer;

import Controller.ReportController;
import Models.Report;
import Views.ConsoleView;

import java.util.List;

/**
 * Created by Nils on 03.01.2016.
 */
public class CountView implements Observer {
    private final ReportController reportController = ReportController.getInstance();
    private final ConsoleView consoleView = new ConsoleView();
    private final String NAME = "CountView";

    public void update(List<Report> list) {
        consoleView.outLine(getName() + ": Anzahl Reports: " + list.size());
    }

    public String getName() {
        return NAME;
    }
}
