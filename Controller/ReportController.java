package Controller;

import Models.Report;
import Models.ReportModel;
import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nils on 03.01.2016.
 */
public class ReportController {
    private static ReportController instance;
    private final List<Observer> attachedObserver = new ArrayList<>();
    private final ReportModel reportModel = ReportModel.getInstance();

    private ReportController(){}

    public static synchronized ReportController getInstance() {
        if (instance == null) instance = new ReportController();
        return instance;
    }

    public void addReport(Report r) {
        reportModel.addReport(r);
        attachedObserver.forEach(Observer::update);
    }

    public void removeLastReport() {
        reportModel.removeLastReport();
        attachedObserver.forEach(Observer::update);
    }

    public boolean addObserver(Observer v) {
        return attachedObserver.add(v);
    }

    public boolean removeObserver(Observer v) {
        return attachedObserver.remove(v);
    }

    public List<Report> exportList() {
        return reportModel.exportList();
    }

    public int getSize() {
        return reportModel.size();
    }
}
