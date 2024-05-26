package creational.factory.product;

public interface UberVehicle {

    public void acceptTrip();

    public void rejectTrip();

    public boolean isDriverEligibleToRejectRide();

    public void notifyArrival();

    public void startTrip();

    public void endTrip();
}
