package lab3;

import java.util.ArrayList;

public class Cmts {

    private Tdma tdma;
    private Scdma scdma;

    private LoadBalancer loadBalancer;

    private DownStream downStream;

    private ArrayList<Cm> registeredCms;

    public void register(Cm cm) {
        // call the load balancer assigncm method
    }

    public void unregister(Cm cm) {

    }

    private boolean hasEnoughBandwidth(double bandwidth) {

        return false;
    }

    public Tdma getTdma() {
        return tdma;
    }

    public void setTdma(Tdma tdma) {
        this.tdma = tdma;
    }

    public Scdma getScdma() {
        return scdma;
    }

    public void setScdma(Scdma scdma) {
        this.scdma = scdma;
    }

    public DownStream getDownStream() {
        return downStream;
    }

    public void setDownStream(DownStream downStream) {
        this.downStream = downStream;
    }

    public ArrayList<Cm> getRegisteredCms() {
        return registeredCms;
    }

    public void setRegisteredCms(ArrayList<Cm> registeredCms) {
        this.registeredCms = registeredCms;
    }

}
