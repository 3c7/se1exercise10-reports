package Models;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nils on 03.01.2016.
 */
public class ReportModel {
    private List<Report> reports = new ArrayList<>();
    private static ReportModel instance;

    private ReportModel() {
    }

    public static synchronized ReportModel getInstance() {
        if (instance == null) instance = new ReportModel();
        return instance;
    }

    public boolean addReport(Report r) {
        return reports.add(r);
    }

    public Report removeReport(int id) {
        return reports.remove(id);
    }

    public boolean removeReport(Report r) {
        return reports.remove(r);
    }

    public void removeLastReport() {
        reports.remove(reports.size() - 1);
    }

    public int size() {
        return reports.size();
    }

    public List<Report> exportList() {
        return reports;
    }
}
