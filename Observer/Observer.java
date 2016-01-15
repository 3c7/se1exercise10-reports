package Observer;

import Models.Report;

import java.util.List;

/**
 * Created by Nils on 03.01.2016.
 */

public interface Observer {
    void update(List<Report> listOfReports);
    String getName();
}
