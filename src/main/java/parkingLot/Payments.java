package parkingLot;

/**
 * Created by mayan on 8/9/17.
 */
public class Payments {
    public double dueAmount(Slot slot){
        return (slot.getEndTime() - slot.getEndTime()) * slot.getRate();
    }
}
