package parkingLot;

/**
 * Created by mayan on 8/9/17.
 */
public abstract class Vehicle {

    Type type ;
    double startTime;
    double endTime;
    double chargePerMin ;
    Slot slot;

    public Vehicle(Payments payments) {
        this.payments = payments;
    }

    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }

    Payments payments = new Payments();
    public Slot getSlot() {
        return slot;
    }
    public void setSlot(Slot slot) {
        this.slot = slot;
    }
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
    public double getChargePerMin() {
        return chargePerMin;
    }
    public void setChargePerMin(double chargePerMin) {
        this.chargePerMin = chargePerMin;
    }
    public Vehicle(Type type) {
        this.type = type;
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public double dueAmount(){
        return payments.dueAmount(getSlot());
    }

}
