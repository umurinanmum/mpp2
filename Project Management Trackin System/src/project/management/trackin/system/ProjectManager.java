package project.management.trackin.system;

import java.util.ArrayList;

public class ProjectManager {

    private ArrayList<Report> dailyReports;
    private String name;

    public void assignFeaturesToDevelopers() {
    }

    public void addFeaturesToRelease() {
    }

    public ArrayList<Report> getDailyReports() {
        return dailyReports;
    }

    public void setDailyReports(ArrayList<Report> dailyReports) {
        this.dailyReports = dailyReports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
