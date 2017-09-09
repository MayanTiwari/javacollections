package parkingLot;

/**
 * Created by mayan on 8/9/17.
 */
public class ParkingDeck {

    private final ParkingManager twoWheelerPM = new ParkingManager(200);
    private final ParkingManager fourWheelerPM = new ParkingManager(100);

    public void requestParking(Vehicle vehicle) {
        if(twoWheelerPM.isAvailable()){
            vehicle.setSlot(twoWheelerPM.getNextAvailableSlot());
        }
    }
    public void releaseParking(Vehicle vehicle) {
        twoWheelerPM.releaseSlot(vehicle.getSlot());
    }
    public double pay(Vehicle vehicle) {
        return vehicle.dueAmount();
    }

}
