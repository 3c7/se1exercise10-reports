package Controller;

import Models.Report;
import Models.ReportModel;
import Observer.Observer;
import Views.ConsoleView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nils on 03.01.2016.
 */
public class ReportController {
    private static ReportController instance;
    private final List<Observer> attachedObserver = new ArrayList<>();
    private final ReportModel reportModel = ReportModel.getInstance();
    private final ConsoleView consoleView = new ConsoleView();

    private ReportController(){}

    public static synchronized ReportController getInstance() {
        if (instance == null) instance = new ReportController();
        return instance;
    }

    public void addReport(Report r) {
        reportModel.addReport(r);
        attachedObserver.forEach(observer -> observer.update(reportModel.exportList()));
    }

    public void removeLastReport() {
        reportModel.removeLastReport();
        attachedObserver.forEach(observer -> observer.update(reportModel.exportList()));
    }

    public void removeReport(int id) {
        reportModel.removeReport(id);
        attachedObserver.forEach(observer -> observer.update(reportModel.exportList()));
    }

    public boolean addObserver(Observer v) {
        consoleView.outLine("Observer " + v.getName() + " zur Liste der Observer hinzugefügt.");
        return attachedObserver.add(v);
    }

    public boolean removeObserver(Observer v) {
        consoleView.outLine("Observer " + v.getName() + " zur Liste der Observer gelöscht.");
        return attachedObserver.remove(v);
    }

    public List<Report> exportList() {
        return reportModel.exportList();
    }

    public int getSize() {
        return reportModel.size();
    }
}
