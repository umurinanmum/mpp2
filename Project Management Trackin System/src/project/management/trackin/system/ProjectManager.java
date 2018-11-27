package project.management.trackin.system;

public class ProjectManager {

    private Report dailyReports;
    private String name;

    public void AssignFeaturesToDevelopers() {
    }

    public void AddFeaturesToRelease() {
    }

    public Report getDailyReports() {
        return dailyReports;
    }

    public void setDailyReports(Report dailyReports) {
        this.dailyReports = dailyReports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
