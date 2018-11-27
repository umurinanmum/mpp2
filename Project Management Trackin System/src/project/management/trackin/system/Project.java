package project.management.trackin.system;

import java.util.ArrayList;

public class Project {

    private ArrayList<ProjectRelease> releases;
    private String name;
    private Backlog backlog;

    public ArrayList<ProjectRelease> getReleases() {
        return releases;
    }

    public void setReleases(ArrayList<ProjectRelease> releases) {
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
