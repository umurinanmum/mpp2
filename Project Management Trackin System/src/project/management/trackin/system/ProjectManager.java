package project.management.trackin.system;

import java.util.ArrayList;

public class ProjectManager {

    private ArrayList<Report> dailyReports;
    private String name;
    private ArrayList<Project> projects;

    public void createReport(Report report) {

    }

    public void assignFeaturesToDevelopers() {
    }

    public void addFeaturesToRelease() {
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
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
