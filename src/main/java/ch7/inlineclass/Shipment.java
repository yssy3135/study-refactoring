package ch7.inlineclass;

public class Shipment {

    TrackingInfo trackingInformation;

    public String trackingInfo() {
        return trackingInformation.display();
    }

    public TrackingInfo getTrackingInfo() {
        return this.trackingInformation;
    }

    public void setTrackingInformation(TrackingInfo aTrackingInformation) {
        this.trackingInformation = aTrackingInformation;
    }
}
