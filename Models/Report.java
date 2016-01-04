package Models;

/**
 * Created by Nils on 03.01.2016.
 */
public class Report {
    private String[] content;

    public Report(String[] s) {
        content = s;
    }

    public void setContent(String[] s) {
        content = s;
    }

    public String[] getContent() {
        return content;
    }

    public String getContentString() {
        String s = "";
        for (String a : content) s += a + " ";
        s = s.substring(0, s.length()-1);
        return s;
    }
}
