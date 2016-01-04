package Observer;

import Controller.ReportController;
import Views.ConsoleView;

/**
 * Created by Nils on 03.01.2016.
 */
public class CountView implements Observer {
    private final ReportController reportController = ReportController.getInstance();
    private final ConsoleView consoleView = new ConsoleView();
    private final String NAME = "CountView";

    public void update() {
        consoleView.outLine(getName() + ": Anzahl Reports: " + reportController.getSize());
    }

    public String getName() {
        return NAME;
    }
}
