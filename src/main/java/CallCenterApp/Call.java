package CallCenterApp;

/**
 * Created by mayan on 4/9/17.
 */
public class Call {
    private double duration;

    public String getCallFrom() {
        return CallFrom;
    }

    public void setCallFrom(String callFrom) {
        CallFrom = callFrom;
    }

    public String getCallTo() {
        return callHandler;
    }

    public void setCallTo(String callTo) {
        this.callHandler = callTo;
    }

    private String CallFrom;
    private String callHandler;
}
