package CallCenterApp;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by mayan on 4/9/17.
 */
public class TheRouter {
    private static TheRouter ourInstance = new TheRouter();

    public static TheRouter getInstance() {
        return ourInstance;
    }

    private final Queue<Call> callQueue = new ArrayDeque<>();
    private TheRouter() {
    }
    public void startNewCall(){
        ICallable availableEmp = getNextAvailableEmp();
        if(availableEmp!=null){
            availableEmp.startCall(new Call());
        }else{
            callQueue.add(new Call());
        }
    }
    private ICallable getNextAvailableEmp(){
        ICallable handler = Fixtures.responders.stream().filter(e -> e.isBusy()==false).findFirst().get();
        if(handler == null){
            handler = getManager();
        }
        if(handler == null){
            handler = getDirector();
        }

       return handler;
    }
    private ICallable getResponder(){
        return Fixtures.responders.stream()
                .filter(e -> e.isBusy()==false)
                .findFirst()
                .get();
    }
    private ICallable getManager(){
        return Fixtures.managers.stream()
                .filter(e -> e.isBusy()==false)
                .findFirst()
                .get();
    }
    private ICallable getDirector(){
        return Fixtures.directors.stream()
                .filter(e -> e.isBusy()==false)
                .findFirst()
                .get();
    }


}
