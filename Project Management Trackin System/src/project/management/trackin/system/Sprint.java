package project.management.trackin.system;

import java.util.ArrayList;
import java.util.Date;

public class Sprint {

    private ArrayList<Feature> features;
    private int duration;
    private Date startDate;
    private Date endDate;

    public void addFeature(Feature feature){
        
    }
    
    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}
