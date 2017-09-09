package parkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by mayan on 9/9/17.
 * Data structure to manage parking lot .
 */
public class ParkingManager {
    private List<Slot> usedSlots = new ArrayList<>();
    private Stack<Slot> freeStack = new Stack<>();
    private int MAX_SLOTS ;

    public ParkingManager(int MAX_SLOTS) {
        this.MAX_SLOTS = MAX_SLOTS;
    }

    /*  public SlotManager(int MAX_SLOTS) {
          this.MAX_SLOTS = MAX_SLOTS;
      }*/
    public int getMAX_SLOTS() {
        return MAX_SLOTS;
    }
    public void setMAX_SLOTS(int MAX_SLOTS) {
        this.MAX_SLOTS = MAX_SLOTS;
    }
    public Slot getNextAvailableSlot(){
        usedSlots.add(freeStack.peek());
        return freeStack.pop();
    }
    public void releaseSlot(Slot slot){
        freeStack.push(usedSlots.stream()
                .filter(s -> s.getSlotID() == slot.getSlotID())
                .findFirst()
                .get());
    }
    public boolean isAvailable(){
        return freeStack.size() > 0;
    }
}
