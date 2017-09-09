package parkingLot;

/**
 * Created by mayan on 9/9/17.
 * Abstract factory wont fit for this design.
 */
public class FourWheelerDeck implements IAbstractParkingDeck {
    @Override
    public Vehicle getVehicle() {
        return new FourWheeler();
    }

    @Override
    public Slot getSlot() {
        return new FourWheelerSlot();
    }
}
