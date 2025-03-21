package ch7.inlineclass;

public class Shipment {

    TrackingInfo trackingInformation;
    String shippingCompany;

    public String trackingInfo() {
        return trackingInformation.shippingCompany + " : " + trackingInformation.trackingNumber;
    }

    public TrackingInfo getTrackingInfo() {
        return this.trackingInformation;
    }

    public void setTrackingInformation(TrackingInfo aTrackingInformation) {
        this.trackingInformation = aTrackingInformation;
    }

    public void setShipmentCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

}
