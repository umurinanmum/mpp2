package project.management.trackin.system;

import java.util.Date;

public class Feature {

    private Date dueDate;
    private boolean isCompleted;
    private double estimation;
    private double remainingEstimate;

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getEstimation() {
        return estimation;
    }

    public void setEstimation(double estimation) {
        this.estimation = estimation;
    }

    public double getRemainingEstimate() {
        return remainingEstimate;
    }

    public void setRemainingEstimate(double remainingEstimate) {
        this.remainingEstimate = remainingEstimate;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

}
