package project.management.trackin.system;

import java.util.Date;

public class Report {

    private Sprint sprint;
    private Date createdDate;
    private double amountOfWorkCompleted;
    private double remainingWork;

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public double getAmountOfWorkCompleted() {
        return amountOfWorkCompleted;
    }

    public void setAmountOfWorkCompleted(double amountOfWorkCompleted) {
        this.amountOfWorkCompleted = amountOfWorkCompleted;
    }

    public double getRemainingWork() {
        return remainingWork;
    }

    public void setRemainingWork(double remainingWork) {
        this.remainingWork = remainingWork;
    }

}
