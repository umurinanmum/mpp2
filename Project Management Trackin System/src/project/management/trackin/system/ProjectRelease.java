package project.management.trackin.system;

import java.util.ArrayList;

public class ProjectRelease {

    private ArrayList<Sprint> sprints;
    private String version;
    
    public void addSprint(Sprint sprint){
        
    }

    public ArrayList<Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(ArrayList<Sprint> sprints) {
        this.sprints = sprints;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
