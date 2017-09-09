package parkingLot;

/**
 * Created by mayan on 7/9/17.
 */
public class Slot {
    private boolean isUsed;
    private int slotID;
    private Type slotType;

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    private double startTime;
    private double endTime;
    private double rate;

    public Slot(Type slotType) {
        this.slotType = slotType;
    }

    public double getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(double parkingTime) {
        this.parkingTime = parkingTime;
    }

    private double parkingTime;


    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public int getSlotID() {
        return slotID;
    }

    public void setSlotID(int slotID) {
        this.slotID = slotID;
    }

    public Type getSlotType() {
        return slotType;
    }

    public void setSlotType(Type slotType) {
        this.slotType = slotType;
    }
}
