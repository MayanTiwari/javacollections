package CallCenterApp;

/**
 * Created by mayan on 4/9/17.
 */
public abstract class Employee implements ICallable{
    private String name;
    private String address;
    private Call call;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public Call getCall() {
        return call;
    }
    public void setCall(Call call) {
        this.call = call;
        this.call.setCallTo(this.name);
    }
    public boolean isBusy(){
        return call != null ;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void startCall(Call call) {
        this.setCall(call);
    }

    @Override
    public void stopCall(Call call) {
        this.setCall(null);
    }
}
