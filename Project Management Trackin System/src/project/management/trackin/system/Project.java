package project.management.trackin.system;

public class Project {

    private ProjectRelease releases;
    private String name;
    private Backlog backlog;

    public ProjectRelease getReleases() {
        return releases;
    }

    public void setReleases(ProjectRelease releases) {
        this.releases = releases;
    }

    public Backlog getBacklog() {
        return backlog;
    }

    public void setBacklog(Backlog backlog) {
        this.backlog = backlog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
