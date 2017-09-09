package parkingLot;

/**
 * Created by mayan on 9/9/17.
 */
public class TwoWheelerDeck implements IAbstractParkingDeck {
    @Override
    public Vehicle getVehicle() {
        return new TwoWheeler();
    }

    @Override
    public Slot getSlot() {
        return null;
    }
}
